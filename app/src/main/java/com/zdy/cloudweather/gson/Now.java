package com.zdy.cloudweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mike_zdy on 2017/5/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("text")
        public String info;
    }
}
