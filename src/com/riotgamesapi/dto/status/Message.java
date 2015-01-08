/*
Copyright 2015 Jesús Rodríguez Tinoco

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.riotgamesapi.dto.status;

import java.util.List;

/**
 * @version 1.0
 */
public class Message {

    private String author;
    private String content;
    private String created_at;
    private long id;
    private String severity;
    private List<Translation> translations;
    private String update_at;

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public long getId() {
        return id;
    }

    /**
     *
     * @return Legal values: Info, Alert, Error
     */
    public String getSeverity() {
        return severity;
    }

    public List<Translation> getTranslations() {
        return translations;
    }

    public String getUpdate_at() {
        return update_at;
    }
}
