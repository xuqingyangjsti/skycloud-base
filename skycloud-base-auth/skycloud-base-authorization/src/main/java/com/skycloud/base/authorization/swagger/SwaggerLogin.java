/*
 * The MIT License (MIT)
 * Copyright © 2019 <sky>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the “Software”), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.skycloud.base.authorization.swagger;

import com.skycloud.base.authorization.model.dto.UserPasswordLoginDto;
import com.fasterxml.classmate.TypeResolver;
import com.google.common.collect.Sets;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import springfox.documentation.builders.OperationBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiDescription;
import springfox.documentation.spring.web.readers.operation.CachingOperationNameGenerator;

import java.util.Arrays;

/**
 * 用户名密码登录
 *
 * @author
 */
@SuppressWarnings("all")
public class SwaggerLogin {

    public static ApiDescription create() {
        return new ApiDescription("groupName",
                "/oauth/login",
                "用户名密码登录",
                Arrays.asList(
                        new OperationBuilder(
                                new CachingOperationNameGenerator())
                                .method(HttpMethod.POST)
                                .produces(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                                .summary("用户名密码登录")
                                .notes("用户名密码登录")
                                .tags(Sets.newHashSet("login"))
                                .consumes(Sets.newHashSet(MediaType.APPLICATION_JSON_VALUE))
                                .parameters(
                                        Arrays.asList(
                                                new ParameterBuilder()
                                                        .description("渠道")
                                                        .type(new TypeResolver().resolve(String.class))
                                                        .name("channel")
                                                        .parameterType("header")
                                                        .parameterAccess("access")
                                                        .required(true)
                                                        .modelRef(new ModelRef("string"))
                                                        .build(),
                                                new ParameterBuilder()
                                                        .description("第三方渠道")
                                                        .type(new TypeResolver().resolve(String.class))
                                                        .name("thirdPartyChannel")
                                                        .parameterType("header")
                                                        .parameterAccess("access")
                                                        .required(false)
                                                        .modelRef(new ModelRef("string"))
                                                        .build(),
                                                new ParameterBuilder()
                                                        .description("appSource")
                                                        .type(new TypeResolver().resolve(String.class))
                                                        .name("appSource")
                                                        .parameterType("header")
                                                        .parameterAccess("access")
                                                        .required(false)
                                                        .modelRef(new ModelRef("string"))
                                                        .build(),
                                                new ParameterBuilder()
                                                        .description("设备号deviceNo")
                                                        .type(new TypeResolver().resolve(String.class))
                                                        .name("deviceNo")
                                                        .parameterType("header")
                                                        .parameterAccess("access")
                                                        .required(false)
                                                        .modelRef(new ModelRef("string"))
                                                        .build(),
                                                new ParameterBuilder()
                                                        .description("设备号deviceId")
                                                        .type(new TypeResolver().resolve(String.class))
                                                        .name("deviceId")
                                                        .parameterType("header")
                                                        .parameterAccess("access")
                                                        .required(false)
                                                        .modelRef(new ModelRef("string"))
                                                        .build(),
                                                new ParameterBuilder()
                                                        .description("userPasswordLoginDto")
                                                        .type(new TypeResolver().resolve(UserPasswordLoginDto.class))
                                                        .name("userPasswordLoginDto")
                                                        .parameterType("body")
                                                        .parameterAccess("access")
                                                        .required(true)
                                                        .modelRef(new ModelRef("UserPasswordLoginDto"))
                                                        .build()

                                        ))
                                .build()),
                false);
    }
}
