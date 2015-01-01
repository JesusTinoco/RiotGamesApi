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

package com.riotgamesapi.dto.staticData;

import java.util.List;

/**
 * @version 1.2
 */
public class SpellVars {

    private List<Double> coeff;
    private String dyn;
    private String key;
    private String link;
    private String ranksWith;

    public List<Double> getCoeff() {
        return coeff;
    }

    public String getDyn() {
        return dyn;
    }

    public String getKey() {
        return key;
    }

    public String getLink() {
        return link;
    }

    public String getRanksWith() {
        return ranksWith;
    }
}
