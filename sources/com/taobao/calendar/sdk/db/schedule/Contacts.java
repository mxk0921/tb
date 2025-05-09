package com.taobao.calendar.sdk.db.schedule;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Contacts extends ArrayList<Contact> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Contact {
        private String email;
        private String name;
        private String phone;
        private String uid;

        static {
            t2o.a(414187588);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getUid() {
            return this.uid;
        }

        public final void setEmail(String str) {
            this.email = str;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setPhone(String str) {
            this.phone = str;
        }

        public final void setUid(String str) {
            this.uid = str;
        }

        public String toString() {
            return JSON.toJSONString(this);
        }
    }

    static {
        t2o.a(414187587);
    }

    public Contact remove(Contacts contacts) {
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(contacts)) {
                return (Contact) super.remove(i);
            }
        }
        return null;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return JSON.toJSONString(this);
    }

    public void parse(String str) {
        JSONArray jSONArray;
        if (!(str == null || str.equals(""))) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                jSONArray = new JSONArray();
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Contact contact = new Contact();
                    contact.name = optJSONObject.optString("name");
                    contact.uid = optJSONObject.optString("uid");
                    contact.phone = optJSONObject.optString("phone");
                    contact.email = optJSONObject.optString("email");
                    add(contact);
                }
            }
        }
    }
}
