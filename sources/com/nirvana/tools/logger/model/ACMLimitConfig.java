package com.nirvana.tools.logger.model;

import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ACMLimitConfig implements Serializable {
    private boolean isLimited;
    private int limitCount;
    private int limitHours;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5975a;
        public int b;
        public int c;

        public b() {
        }

        public final ACMLimitConfig d() {
            return new ACMLimitConfig(this);
        }

        public final b e(boolean z) {
            this.f5975a = z;
            return this;
        }

        public final b f(int i) {
            this.b = i;
            return this;
        }

        public final b g(int i) {
            this.c = i;
            return this;
        }
    }

    public ACMLimitConfig() {
    }

    public static ACMLimitConfig fromJson(String str) {
        ACMLimitConfig aCMLimitConfig = new ACMLimitConfig();
        try {
            if (!TextUtils.isEmpty(str)) {
                wrf.a(new JSONObject(str), aCMLimitConfig, null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return aCMLimitConfig;
    }

    public static b newACMLimitConfig() {
        return new b();
    }

    public int getLimitCount() {
        return this.limitCount;
    }

    public int getLimitHours() {
        return this.limitHours;
    }

    public boolean isLimited() {
        return this.isLimited;
    }

    public void setLimitCount(int i) {
        this.limitCount = i;
    }

    public void setLimitHours(int i) {
        this.limitHours = i;
    }

    public void setLimited(boolean z) {
        this.isLimited = z;
    }

    public String toJsonString() {
        return wrf.n(this, null).toString();
    }

    private ACMLimitConfig(b bVar) {
        this.isLimited = bVar.f5975a;
        this.limitCount = bVar.b;
        this.limitHours = bVar.c;
    }
}
