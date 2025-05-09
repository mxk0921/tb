package com.taobao.calendar.sdk.db;

import com.alibaba.evo.internal.database.ExperimentDO;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EventDO extends BaseEventDO {
    public Message message;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Message {
        public String description;
        public int endTime;
        public String location;
        public String members;
        public String name;
        public int startTime;

        static {
            t2o.a(414187565);
        }
    }

    static {
        t2o.a(414187564);
    }

    public void parseMessage(String str) {
        parseMessage(parseJSONObjectFromString(str));
    }

    public void parseMessage(JSONObject jSONObject) {
        Message message = new Message();
        this.message = message;
        message.name = jSONObject.optString("name");
        this.message.startTime = jSONObject.optInt("start_time");
        this.message.endTime = jSONObject.optInt(ExperimentDO.COLUMN_END_TIME);
        this.message.description = jSONObject.optString("description");
        this.message.location = jSONObject.optString("location");
        this.message.members = jSONObject.optString("members");
    }
}
