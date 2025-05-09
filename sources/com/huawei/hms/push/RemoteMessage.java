package com.huawei.hms.push;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.utils.DateUtil;
import com.huawei.hms.push.utils.JsonUtil;
import com.huawei.hms.support.api.push.PushException;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new a();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    private static final String[] c;
    private static final int[] d;
    private static final long[] e;
    private static final HashMap<String, Object> f;
    private static final HashMap<String, Object> g;
    private static final HashMap<String, Object> h;
    private static final HashMap<String, Object> i;
    private static final HashMap<String, Object> j;

    /* renamed from: a  reason: collision with root package name */
    private Bundle f5436a;
    private Notification b;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface MessagePriority {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Notification implements Serializable {
        private final long[] A;
        private final String B;

        /* renamed from: a  reason: collision with root package name */
        private final String f5438a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;
        private final int o;
        private final String p;
        private final int q;
        private final int r;
        private final int s;
        private final int[] t;
        private final String u;
        private final int v;
        private final String w;
        private final int x;
        private final String y;
        private final String z;

        public /* synthetic */ Notification(Bundle bundle, a aVar) {
            this(bundle);
        }

        private Integer a(String str) {
            if (str != null) {
                try {
                    return Integer.valueOf(str);
                } catch (NumberFormatException unused) {
                    HMSLog.w("RemoteMessage", "NumberFormatException: get " + str + " failed.");
                }
            }
            return null;
        }

        public Integer getBadgeNumber() {
            return a(this.w);
        }

        public String getBody() {
            return this.d;
        }

        public String[] getBodyLocalizationArgs() {
            String[] strArr = this.f;
            if (strArr == null) {
                return new String[0];
            }
            return (String[]) strArr.clone();
        }

        public String getBodyLocalizationKey() {
            return this.e;
        }

        public String getChannelId() {
            return this.m;
        }

        public String getClickAction() {
            return this.k;
        }

        public String getColor() {
            return this.j;
        }

        public String getIcon() {
            return this.g;
        }

        public Uri getImageUrl() {
            String str = this.p;
            if (str == null) {
                return null;
            }
            return Uri.parse(str);
        }

        public Integer getImportance() {
            return a(this.y);
        }

        public String getIntentUri() {
            return this.l;
        }

        public int[] getLightSettings() {
            int[] iArr = this.t;
            if (iArr == null) {
                return new int[0];
            }
            return (int[]) iArr.clone();
        }

        public Uri getLink() {
            return this.n;
        }

        public int getNotifyId() {
            return this.o;
        }

        public String getSound() {
            return this.h;
        }

        public String getTag() {
            return this.i;
        }

        public String getTicker() {
            return this.z;
        }

        public String getTitle() {
            return this.f5438a;
        }

        public String[] getTitleLocalizationArgs() {
            String[] strArr = this.c;
            if (strArr == null) {
                return new String[0];
            }
            return (String[]) strArr.clone();
        }

        public String getTitleLocalizationKey() {
            return this.b;
        }

        public long[] getVibrateConfig() {
            long[] jArr = this.A;
            if (jArr == null) {
                return new long[0];
            }
            return (long[]) jArr.clone();
        }

        public Integer getVisibility() {
            return a(this.B);
        }

        public Long getWhen() {
            if (!TextUtils.isEmpty(this.u)) {
                try {
                    return Long.valueOf(DateUtil.parseUtcToMillisecond(this.u));
                } catch (StringIndexOutOfBoundsException unused) {
                    HMSLog.w("RemoteMessage", "StringIndexOutOfBoundsException: parse when failed.");
                } catch (ParseException unused2) {
                    HMSLog.w("RemoteMessage", "ParseException: parse when failed.");
                }
            }
            return null;
        }

        public boolean isAutoCancel() {
            if (this.x == 1) {
                return true;
            }
            return false;
        }

        public boolean isDefaultLight() {
            if (this.q == 1) {
                return true;
            }
            return false;
        }

        public boolean isDefaultSound() {
            if (this.r == 1) {
                return true;
            }
            return false;
        }

        public boolean isDefaultVibrate() {
            if (this.s == 1) {
                return true;
            }
            return false;
        }

        public boolean isLocalOnly() {
            if (this.v == 1) {
                return true;
            }
            return false;
        }

        private Notification(Bundle bundle) {
            this.f5438a = bundle.getString(RemoteMessageConst.Notification.NOTIFY_TITLE);
            this.d = bundle.getString("content");
            this.b = bundle.getString(RemoteMessageConst.Notification.TITLE_LOC_KEY);
            this.e = bundle.getString(RemoteMessageConst.Notification.BODY_LOC_KEY);
            this.c = bundle.getStringArray(RemoteMessageConst.Notification.TITLE_LOC_ARGS);
            this.f = bundle.getStringArray(RemoteMessageConst.Notification.BODY_LOC_ARGS);
            this.g = bundle.getString("icon");
            this.j = bundle.getString("color");
            this.h = bundle.getString(RemoteMessageConst.Notification.SOUND);
            this.i = bundle.getString("tag");
            this.m = bundle.getString("channelId");
            this.k = bundle.getString(RemoteMessageConst.Notification.CLICK_ACTION);
            this.l = bundle.getString(RemoteMessageConst.Notification.INTENT_URI);
            this.o = bundle.getInt("notifyId");
            String string = bundle.getString("url");
            this.n = !TextUtils.isEmpty(string) ? Uri.parse(string) : null;
            this.p = bundle.getString(RemoteMessageConst.Notification.NOTIFY_ICON);
            this.q = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS);
            this.r = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_SOUND);
            this.s = bundle.getInt(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS);
            this.t = bundle.getIntArray(RemoteMessageConst.Notification.LIGHT_SETTINGS);
            this.u = bundle.getString("when");
            this.v = bundle.getInt(RemoteMessageConst.Notification.LOCAL_ONLY);
            this.w = bundle.getString(RemoteMessageConst.Notification.BADGE_SET_NUM, null);
            this.x = bundle.getInt(RemoteMessageConst.Notification.AUTO_CANCEL);
            this.y = bundle.getString("priority", null);
            this.z = bundle.getString(RemoteMessageConst.Notification.TICKER);
            this.A = bundle.getLongArray(RemoteMessageConst.Notification.VIBRATE_TIMINGS);
            this.B = bundle.getString("visibility", null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Parcelable.Creator<RemoteMessage> {
        /* renamed from: a */
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        /* renamed from: a */
        public RemoteMessage[] newArray(int i) {
            return new RemoteMessage[i];
        }
    }

    public RemoteMessage(Bundle bundle) {
        this.f5436a = a(bundle);
    }

    private Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject b = b(bundle);
        JSONObject a2 = a(b);
        String string = JsonUtil.getString(a2, "data", null);
        bundle2.putString(RemoteMessageConst.ANALYTIC_INFO, JsonUtil.getString(a2, RemoteMessageConst.ANALYTIC_INFO, null));
        bundle2.putString(RemoteMessageConst.DEVICE_TOKEN, bundle.getString(RemoteMessageConst.DEVICE_TOKEN));
        JSONObject d2 = d(a2);
        JSONObject b2 = b(d2);
        JSONObject c2 = c(d2);
        if (bundle.getInt(RemoteMessageConst.INPUT_TYPE) != 1 || !d.a(a2, d2, string)) {
            String string2 = bundle.getString("to");
            String string3 = bundle.getString("message_type");
            String string4 = JsonUtil.getString(a2, RemoteMessageConst.MSGID, null);
            bundle2.putString("to", string2);
            bundle2.putString("data", string);
            bundle2.putString(RemoteMessageConst.MSGID, string4);
            bundle2.putString("message_type", string3);
            JsonUtil.transferJsonObjectToBundle(b, bundle2, f);
            bundle2.putBundle(RemoteMessageConst.NOTIFICATION, a(b, a2, d2, b2, c2));
            return bundle2;
        }
        bundle2.putString("data", com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        return bundle2;
    }

    private static JSONObject b(Bundle bundle) {
        try {
            return new JSONObject(com.huawei.hms.push.a.a(bundle.getByteArray(RemoteMessageConst.MSGBODY)));
        } catch (JSONException unused) {
            HMSLog.w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public String getAnalyticInfo() {
        return this.f5436a.getString(RemoteMessageConst.ANALYTIC_INFO);
    }

    public Map<String, String> getAnalyticInfoMap() {
        HashMap hashMap = new HashMap();
        String string = this.f5436a.getString(RemoteMessageConst.ANALYTIC_INFO);
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    hashMap.put(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get analyticInfo from map failed.");
            }
        }
        return hashMap;
    }

    public String getCollapseKey() {
        return this.f5436a.getString(RemoteMessageConst.COLLAPSE_KEY);
    }

    public String getData() {
        return this.f5436a.getString("data");
    }

    public Map<String, String> getDataOfMap() {
        HashMap hashMap = new HashMap();
        String string = this.f5436a.getString("data");
        if (string != null && !string.trim().isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    hashMap.put(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
                HMSLog.w("RemoteMessage", "JSONException: get data from map failed");
            }
        }
        return hashMap;
    }

    public String getFrom() {
        return this.f5436a.getString("from");
    }

    public String getMessageId() {
        return this.f5436a.getString(RemoteMessageConst.MSGID);
    }

    public String getMessageType() {
        return this.f5436a.getString("message_type");
    }

    public Notification getNotification() {
        Bundle bundle = this.f5436a.getBundle(RemoteMessageConst.NOTIFICATION);
        if (this.b == null && bundle != null) {
            this.b = new Notification(bundle, null);
        }
        if (this.b == null) {
            this.b = new Notification(new Bundle(), null);
        }
        return this.b;
    }

    public int getOriginalUrgency() {
        int i2 = this.f5436a.getInt(RemoteMessageConst.ORI_URGENCY);
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        return 0;
    }

    public int getReceiptMode() {
        return this.f5436a.getInt(RemoteMessageConst.RECEIPT_MODE);
    }

    public int getSendMode() {
        return this.f5436a.getInt(RemoteMessageConst.SEND_MODE);
    }

    public String getTo() {
        return this.f5436a.getString("to");
    }

    public String getToken() {
        return this.f5436a.getString(RemoteMessageConst.DEVICE_TOKEN);
    }

    public int getTtl() {
        return this.f5436a.getInt(RemoteMessageConst.TTL);
    }

    public int getUrgency() {
        int i2 = this.f5436a.getInt(RemoteMessageConst.URGENCY);
        if (i2 == 1 || i2 == 2) {
            return i2;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f5436a);
        parcel.writeSerializable(this.b);
    }

    static {
        String[] strArr = new String[0];
        c = strArr;
        int[] iArr = new int[0];
        d = iArr;
        long[] jArr = new long[0];
        e = jArr;
        HashMap<String, Object> hashMap = new HashMap<>(8);
        f = hashMap;
        hashMap.put("from", "");
        hashMap.put(RemoteMessageConst.COLLAPSE_KEY, "");
        hashMap.put(RemoteMessageConst.SEND_TIME, "");
        hashMap.put(RemoteMessageConst.TTL, Integer.valueOf((int) RemoteMessageConst.DEFAULT_TTL));
        hashMap.put(RemoteMessageConst.URGENCY, 2);
        hashMap.put(RemoteMessageConst.ORI_URGENCY, 2);
        hashMap.put(RemoteMessageConst.SEND_MODE, 0);
        hashMap.put(RemoteMessageConst.RECEIPT_MODE, 0);
        HashMap<String, Object> hashMap2 = new HashMap<>(8);
        g = hashMap2;
        hashMap2.put(RemoteMessageConst.Notification.TITLE_LOC_KEY, "");
        hashMap2.put(RemoteMessageConst.Notification.BODY_LOC_KEY, "");
        hashMap2.put(RemoteMessageConst.Notification.NOTIFY_ICON, "");
        hashMap2.put(RemoteMessageConst.Notification.TITLE_LOC_ARGS, strArr);
        hashMap2.put(RemoteMessageConst.Notification.BODY_LOC_ARGS, strArr);
        hashMap2.put(RemoteMessageConst.Notification.TICKER, "");
        hashMap2.put(RemoteMessageConst.Notification.NOTIFY_TITLE, "");
        hashMap2.put("content", "");
        HashMap<String, Object> hashMap3 = new HashMap<>(8);
        h = hashMap3;
        hashMap3.put("icon", "");
        hashMap3.put("color", "");
        hashMap3.put(RemoteMessageConst.Notification.SOUND, "");
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_LIGHT_SETTINGS, 1);
        hashMap3.put(RemoteMessageConst.Notification.LIGHT_SETTINGS, iArr);
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_SOUND, 1);
        hashMap3.put(RemoteMessageConst.Notification.DEFAULT_VIBRATE_TIMINGS, 1);
        hashMap3.put(RemoteMessageConst.Notification.VIBRATE_TIMINGS, jArr);
        HashMap<String, Object> hashMap4 = new HashMap<>(8);
        i = hashMap4;
        hashMap4.put("tag", "");
        hashMap4.put("when", "");
        hashMap4.put(RemoteMessageConst.Notification.LOCAL_ONLY, 1);
        hashMap4.put(RemoteMessageConst.Notification.BADGE_SET_NUM, "");
        hashMap4.put("priority", "");
        hashMap4.put(RemoteMessageConst.Notification.AUTO_CANCEL, 1);
        hashMap4.put("visibility", "");
        hashMap4.put("channelId", "");
        HashMap<String, Object> hashMap5 = new HashMap<>(3);
        j = hashMap5;
        hashMap5.put(RemoteMessageConst.Notification.CLICK_ACTION, "");
        hashMap5.put(RemoteMessageConst.Notification.INTENT_URI, "");
        hashMap5.put("url", "");
    }

    public RemoteMessage(Parcel parcel) {
        this.f5436a = parcel.readBundle();
        this.b = (Notification) parcel.readSerializable();
    }

    private static JSONObject c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("param");
        }
        return null;
    }

    private static JSONObject d(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PS_CONTENT);
        }
        return null;
    }

    public long getSentTime() {
        try {
            String string = this.f5436a.getString(RemoteMessageConst.SEND_TIME);
            if (!TextUtils.isEmpty(string)) {
                return Long.parseLong(string);
            }
            return 0L;
        } catch (NumberFormatException unused) {
            HMSLog.w("RemoteMessage", "NumberFormatException: get sendTime error.");
            return 0L;
        }
    }

    private static JSONObject b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.NOTIFY_DETAIL);
        }
        return null;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f5437a;
        private final Map<String, String> b = new HashMap();

        public Builder(String str) {
            Bundle bundle = new Bundle();
            this.f5437a = bundle;
            bundle.putString("to", str);
        }

        public Builder addData(String str, String str2) {
            if (str != null) {
                this.b.put(str, str2);
                return this;
            }
            throw new IllegalArgumentException("add data failed, key is null.");
        }

        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, String> entry : this.b.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                try {
                    String jSONObject2 = jSONObject.toString();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(RemoteMessageConst.COLLAPSE_KEY, this.f5437a.getString(RemoteMessageConst.COLLAPSE_KEY));
                    jSONObject3.put(RemoteMessageConst.TTL, this.f5437a.getInt(RemoteMessageConst.TTL));
                    jSONObject3.put(RemoteMessageConst.SEND_MODE, this.f5437a.getInt(RemoteMessageConst.SEND_MODE));
                    jSONObject3.put(RemoteMessageConst.RECEIPT_MODE, this.f5437a.getInt(RemoteMessageConst.RECEIPT_MODE));
                    JSONObject jSONObject4 = new JSONObject();
                    if (jSONObject.length() != 0) {
                        jSONObject4.put("data", jSONObject2);
                    }
                    jSONObject4.put(RemoteMessageConst.MSGID, this.f5437a.getString(RemoteMessageConst.MSGID));
                    jSONObject3.put(RemoteMessageConst.MessageBody.MSG_CONTENT, jSONObject4);
                    bundle.putByteArray(RemoteMessageConst.MSGBODY, jSONObject3.toString().getBytes(m.f5445a));
                    bundle.putString("to", this.f5437a.getString("to"));
                    bundle.putString("message_type", this.f5437a.getString("message_type"));
                    return new RemoteMessage(bundle);
                } catch (JSONException unused) {
                    HMSLog.w("RemoteMessage", "JSONException: parse message body failed.");
                    throw new PushException(PushException.EXCEPTION_SEND_FAILED);
                }
            } catch (JSONException unused2) {
                HMSLog.w("RemoteMessage", "JSONException: parse data to json failed.");
                throw new PushException(PushException.EXCEPTION_SEND_FAILED);
            }
        }

        public Builder clearData() {
            this.b.clear();
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.f5437a.putString(RemoteMessageConst.COLLAPSE_KEY, str);
            return this;
        }

        public Builder setData(Map<String, String> map) {
            this.b.clear();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.b.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public Builder setMessageId(String str) {
            this.f5437a.putString(RemoteMessageConst.MSGID, str);
            return this;
        }

        public Builder setMessageType(String str) {
            this.f5437a.putString("message_type", str);
            return this;
        }

        public Builder setReceiptMode(int i) {
            if (i == 1 || i == 0) {
                this.f5437a.putInt(RemoteMessageConst.RECEIPT_MODE, i);
                return this;
            }
            throw new IllegalArgumentException("receipt mode can only be 0 or 1.");
        }

        public Builder setSendMode(int i) {
            if (i == 0 || i == 1) {
                this.f5437a.putInt(RemoteMessageConst.SEND_MODE, i);
                return this;
            }
            throw new IllegalArgumentException("send mode can only be 0 or 1.");
        }

        public Builder setTtl(int i) {
            if (i < 1 || i > 1296000) {
                throw new IllegalArgumentException("ttl must be greater than or equal to 1 and less than or equal to 1296000");
            }
            this.f5437a.putInt(RemoteMessageConst.TTL, i);
            return this;
        }
    }

    private Bundle a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        JsonUtil.transferJsonObjectToBundle(jSONObject3, bundle, g);
        JsonUtil.transferJsonObjectToBundle(jSONObject4, bundle, h);
        JsonUtil.transferJsonObjectToBundle(jSONObject, bundle, i);
        JsonUtil.transferJsonObjectToBundle(jSONObject5, bundle, j);
        bundle.putInt("notifyId", JsonUtil.getInt(jSONObject2, "notifyId", 0));
        return bundle;
    }

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(RemoteMessageConst.MessageBody.MSG_CONTENT);
        }
        return null;
    }
}
