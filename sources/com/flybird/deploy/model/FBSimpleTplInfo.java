package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBSimpleTplInfo implements IFBTplInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f4996a;

    public static FBSimpleTplInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBSimpleTplInfo) ipChange.ipc$dispatch("83a6b0a0", new Object[]{str});
        }
        FBSimpleTplInfo fBSimpleTplInfo = new FBSimpleTplInfo();
        fBSimpleTplInfo.f4996a = str;
        return fBSimpleTplInfo;
    }

    public static JSONObject c(FBSimpleTplInfo fBSimpleTplInfo) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b97b0ab3", new Object[]{fBSimpleTplInfo});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tplId", fBSimpleTplInfo.f4996a);
        return jSONObject;
    }

    public static String d(FBSimpleTplInfo fBSimpleTplInfo) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5db29e9", new Object[]{fBSimpleTplInfo});
        }
        return c(fBSimpleTplInfo).toString();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71e7524", new Object[]{this});
        }
        return this.f4996a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FBSimpleTplInfo{tplId='" + this.f4996a + "'}";
    }
}
