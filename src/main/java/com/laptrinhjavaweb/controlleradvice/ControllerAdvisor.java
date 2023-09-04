package com.laptrinhjavaweb.controlleradvice;

import com.laptrinhjavaweb.model.ErrorResponseBean;
import com.laptrinhjavaweb.customexception.FieldRequiredException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {
        @ExceptionHandler(ArithmeticException.class)
        public ResponseEntity<ErrorResponseBean> handleArithmeticException(ArithmeticException ex, WebRequest request){
            ErrorResponseBean result = new ErrorResponseBean();
            result.setError(ex.getMessage());
            List<String> details = new ArrayList<>();
            details.add("1 so khong chia duoc cho 0");
            result.setDetails(details);
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    @ExceptionHandler(FieldRequiredException.class)
    public ResponseEntity<ErrorResponseBean> handleFieldRequiredException(FieldRequiredException ex, WebRequest request){
        ErrorResponseBean result = new ErrorResponseBean();
        result.setError(ex.getMessage());
        List<String> details = new ArrayList<>();
//        details.add("1 so khong chia duoc cho 0");
        result.setDetails(details);
        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseBean> handleFieldRequiredException(Exception ex, WebRequest request){
        ErrorResponseBean errorResponseBean = new ErrorResponseBean();
        errorResponseBean.setError(ex.getMessage());
        errorResponseBean.setDetails(null);
        return new ResponseEntity<>(errorResponseBean, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
