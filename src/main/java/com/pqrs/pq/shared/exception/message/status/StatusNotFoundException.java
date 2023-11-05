package com.pqrs.pq.shared.exception.message.status;

import com.pqrs.pq.shared.exception.base.BaseException;
import com.pqrs.pq.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class StatusNotFoundException extends BaseException {


    public StatusNotFoundException(String message) {
        super(false, HttpStatus.NOT_FOUND, message, ExceptionCode.STATUS_NOT_FOUND);
    }
}
