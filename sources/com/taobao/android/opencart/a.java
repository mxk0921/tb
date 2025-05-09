package com.taobao.android.opencart;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AddBagModel f9061a;
    public JSONObject b;
    public boolean c;

    public a(AddBagModel addBagModel) {
        this.f9061a = addBagModel;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38f8242f", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null || !jSONObject.getBooleanValue("disableJoinGroupPop")) {
            return false;
        }
        return true;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78bf712a", new Object[]{this})).booleanValue();
        }
        if (this.f9061a.getClientExParams() == null || !Boolean.TRUE.equals(this.f9061a.getClientExParams().get("disableToast"))) {
            return false;
        }
        return true;
    }

    public AddBagModel c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AddBagModel) ipChange.ipc$dispatch("71754174", new Object[]{this});
        }
        return this.f9061a;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52067622", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e38214a2", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject != null) {
            return jSONObject.getString("successShowMsg");
        }
        return "";
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("efccf15c", new Object[]{this})).booleanValue();
        }
        if (a() || this.f9061a.isOpenUrlInDetail() || this.f9061a.getStartRect() == null || this.f9061a.getStartRect().j() || this.f9061a.getEndRect() == null || this.f9061a.getEndRect().j()) {
            return false;
        }
        return true;
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d399a2", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }
}
