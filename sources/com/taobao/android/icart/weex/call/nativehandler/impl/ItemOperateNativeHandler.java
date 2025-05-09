package com.taobao.android.icart.weex.call.nativehandler.impl;

import android.app.Activity;
import android.content.DialogInterface;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.dialog.ItemOperateDialog;
import java.util.ArrayList;
import tb.ckf;
import tb.mw;
import tb.rv;
import tb.sv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ItemOperateNativeHandler extends mw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8043a;

        public a(String str) {
            this.f8043a = str;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                CartMegaManager.INSTANCE.l(this.f8043a);
            }
        }
    }

    static {
        t2o.a(478150951);
    }

    public static /* synthetic */ Object ipc$super(ItemOperateNativeHandler itemOperateNativeHandler, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/nativehandler/impl/ItemOperateNativeHandler");
    }

    @Override // tb.mw
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3046a606", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.mw
    public boolean a(String str, String str2, JSONObject jSONObject, String str3) {
        sv b;
        Activity f;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18e260f", new Object[]{this, str, str2, jSONObject, str3})).booleanValue();
        }
        ckf.g(str, "instanceID");
        ckf.g(str2, "method");
        ckf.g(jSONObject, "params");
        ckf.g(str3, "callbackID");
        rv i = CartMegaManager.INSTANCE.i(str);
        if (i == null || (b = i.b()) == null || (f = b.f()) == null || (jSONArray = jSONObject.getJSONArray("operateItems")) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int size = jSONArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            if (jSONObject2.containsKey("text") && jSONObject2.containsKey("event")) {
                String string = jSONObject2.getString("text");
                ckf.f(string, "operateItem.getString(\"text\")");
                String string2 = jSONObject2.getString("textColor");
                if (string2 == null) {
                    string2 = "#333333";
                }
                String string3 = jSONObject2.getString("event");
                ckf.f(string3, "operateItem.getString(\"event\")");
                arrayList.add(new ItemOperateDialog.a(string, string2, string3));
            }
        }
        ItemOperateDialog itemOperateDialog = new ItemOperateDialog(f, arrayList, new ItemOperateNativeHandler$handleNativeBiz$dialog$1(str3));
        itemOperateDialog.setOnDismissListener(new a(str3));
        itemOperateDialog.show();
        return true;
    }
}
