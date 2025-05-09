package com.taobao.calendar.sdk.db;

import com.alibaba.fastjson.JSON;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BaseEventDO {
    public long endTime;
    public long startTime;
    public String theDate;
    public String title;
    public String uid;
    public long sourceId = 0;
    public boolean isAllDay = false;
    public boolean isEditable = false;
    public boolean isDeleted = false;
    public int sync = 0;
    public boolean isOnclickEventMark = false;

    static {
        t2o.a(414187559);
    }

    public BaseEventDO() {
        Calendar instance = Calendar.getInstance();
        this.startTime = instance.getTimeInMillis();
        instance.add(12, 30);
        this.endTime = instance.getTimeInMillis();
    }

    public String formatDate(Long l) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(l.longValue());
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(instance.getTime());
    }

    public String getLable() {
        String str = this.title;
        if (str == null || str.equals("")) {
            return "无标题";
        }
        return this.title;
    }

    public boolean isOnclickEventMark() {
        return this.isOnclickEventMark;
    }

    public Calendar parseDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = null;
        try {
            Date parse = simpleDateFormat.parse(str.trim());
            calendar = Calendar.getInstance();
            calendar.setTime(parse);
            return calendar;
        } catch (ParseException unused) {
            return calendar;
        }
    }

    public JSONArray parseJSONArrayFromString(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            return new JSONArray();
        }
    }

    public JSONObject parseJSONObjectFromString(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public void setOnclickEventMark(boolean z) {
        this.isOnclickEventMark = z;
    }

    public String toString() {
        return JSON.toJSONString(this);
    }
}
