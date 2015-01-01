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

/**
 * @version 1.2
 */
public class Gold {

    private int base;
    private boolean purchasable;
    private int sell;
    private int total;

    public int getBase() {
        return base;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public int getSell() {
        return sell;
    }

    public int getTotal() {
        return total;
    }
}
