package com.alipay.mobile.verifyidentity.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ProductDataHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLICK_CLOSE = "click_clo";
    public static final String KEY_CLICK_FORGET = "click_4get";
    public static final String KEY_CLICK_OTHER = "click_oth";
    public static final String KEY_COST = "cost";
    public static final String KEY_INIT = "init";
    public static final String KEY_LOCAL_VERIFY = "l_verify";
    public static final String KEY_LOCKED = "locked";
    public static final String KEY_MODIFY = "modify";
    public static final String KEY_PRODUCT = "pd";
    public static final String KEY_PROVERIFYRESULT = "proverifyresult";
    public static final String KEY_VERIFY = "verify";
    public static final String VAL_PRODUCT_FACE = "face";
    public static final String VAL_PRODUCT_FACE_ID = "faceId";
    public static final String VAL_PRODUCT_FP = "fp";
    public static final String VAL_PRODUCT_PWD = "pwd";
    public static final String VAL_PRODUCT_SWIPE = "swipe";
    public static volatile ProductDataHelper e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f4477a;
    public long b;
    public JSONArray c = new JSONArray();
    public JSONObject d = new JSONObject();

    public static ProductDataHelper getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductDataHelper) ipChange.ipc$dispatch("9efe3bcc", new Object[0]);
        }
        if (e == null) {
            synchronized (ProductDataHelper.class) {
                try {
                    if (e == null) {
                        e = new ProductDataHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public boolean canTrustTransfer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c3777e", new Object[]{this})).booleanValue();
        }
        return this.f4477a;
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "clearCache");
            this.c = new JSONArray();
            this.d = new JSONObject();
            this.f4477a = false;
        } catch (Throwable unused) {
        }
    }

    public void commitRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccf8cef", new Object[]{this});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "commitRecord");
            if (this.c == null) {
                this.c = new JSONArray();
            }
            if (!this.d.isEmpty()) {
                this.c.add(this.d);
            }
            this.d = new JSONObject();
            this.b = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public String generateIISDataStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64becff0", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(this.c);
        if (!this.d.isEmpty()) {
            jSONArray.add(this.d);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("productData", (Object) jSONArray);
        VerifyLogCat.i("ProductDataHelper", "generateIISDataStr result str: " + jSONObject.toJSONString());
        try {
            return Base64.encodeToString(jSONObject.toJSONString().getBytes(), 2);
        } catch (Throwable th) {
            VerifyLogCat.e("ProductDataHelper", th);
            return jSONObject.toJSONString();
        }
    }

    public void recordCostEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c62e44", new Object[]{this});
            return;
        }
        write("cost", Long.valueOf(System.currentTimeMillis() - this.b));
        this.b = System.currentTimeMillis();
    }

    public void recordCostStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0803dcb", new Object[]{this});
        } else {
            this.b = System.currentTimeMillis();
        }
    }

    public void setTrustTransfer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac126ac", new Object[]{this, new Boolean(z)});
        } else {
            this.f4477a = z;
        }
    }

    public void startRecord(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb75a4", new Object[]{this, str});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "startRecord type: " + str);
            if (this.d == null) {
                this.d = new JSONObject();
            }
            if (!this.d.isEmpty()) {
                commitRecord();
            }
            this.b = System.currentTimeMillis();
            this.d.put("pd", (Object) str);
        } catch (Throwable unused) {
        }
    }

    public void write(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdead50c", new Object[]{this, str, obj});
        } else {
            write(str, obj, false);
        }
    }

    public void write(String str, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef707f48", new Object[]{this, str, obj, new Boolean(z)});
            return;
        }
        try {
            VerifyLogCat.i("ProductDataHelper", "write key: " + str + ", value: " + obj);
            if (!TextUtils.isEmpty(str)) {
                if (this.d == null) {
                    this.d = new JSONObject();
                }
                this.d.put(str, obj);
                if (z) {
                    commitRecord();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
