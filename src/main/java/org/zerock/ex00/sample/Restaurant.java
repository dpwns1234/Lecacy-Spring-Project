package org.zerock.ex00.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
@RequiredArgsConstructor
public class Restaurant {

    private final Chef chef;

}
