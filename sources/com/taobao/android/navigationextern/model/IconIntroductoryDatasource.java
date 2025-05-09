package com.taobao.android.navigationextern.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import tb.jhj;
import tb.lpj;
import tb.rpj;
import tb.yl2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class IconIntroductoryDatasource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BroadcastReceiver f9042a = new UcpTabBarChangedReceiver();
    public final c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class UcpTabBarChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public UcpTabBarChangedReceiver() {
        }

        public static /* synthetic */ Object ipc$super(UcpTabBarChangedReceiver ucpTabBarChangedReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/navigationextern/model/IconIntroductoryDatasource$UcpTabBarChangedReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                String action = intent.getAction();
                if (yl2.ACTION_UCP_TAB_CONFIG_CHANGE.equals(action)) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        IconIntroductoryDatasource.a(IconIntroductoryDatasource.this, extras.get("data"));
                    }
                } else if ("UCPTabBarShouldRemove".equals(action)) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 == null) {
                        jhj.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE extra is null");
                        return;
                    }
                    Object obj = extras2.get("data");
                    if (!(obj instanceof JSONObject)) {
                        jhj.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE data is not JSONObject. data: " + obj);
                        return;
                    }
                    Object obj2 = ((JSONObject) obj).get("removeList");
                    if (!(obj2 instanceof JSONArray)) {
                        jhj.b("IconIntroductoryDatasource", "onReceive ACTION_UCP_TAB_INTRODUCTORY_REMOVE removeList is not JSONArray. removeList: " + obj2);
                        return;
                    }
                    IconIntroductoryDatasource.b(IconIntroductoryDatasource.this, (JSONArray) obj2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int OP_ADD = 11;
        public static final int OP_REMOVE = 12;
        public static final int OP_REMOVE_INTRODUCTORY = 13;

        /* renamed from: a  reason: collision with root package name */
        public final int f9044a;
        public String b;
        public String c;
        public JSONObject d;
        public String e;
        public String f;
        public String g;

        public b(int i) {
            this.f9044a = i;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "DataCompat{op=" + this.f9044a + ", materialType='" + this.b + "', materialSubType='" + this.c + "', resourceObject=" + this.d + ", bizCode='" + this.e + "', trackInfo='" + this.f + "', bizData='" + this.g + "'}";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    public IconIntroductoryDatasource(c cVar) {
        this.b = cVar;
    }

    public static /* synthetic */ void a(IconIntroductoryDatasource iconIntroductoryDatasource, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e53b052f", new Object[]{iconIntroductoryDatasource, obj});
        } else {
            iconIntroductoryDatasource.e(obj);
        }
    }

    public static /* synthetic */ void b(IconIntroductoryDatasource iconIntroductoryDatasource, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bdbdbbc", new Object[]{iconIntroductoryDatasource, jSONArray});
        } else {
            iconIntroductoryDatasource.g(jSONArray);
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1c57ac", new Object[]{this, context});
            return;
        }
        yl2.c(context, this.f9042a);
        if (NavigationExternSwitch.r()) {
            yl2.b(context, this.f9042a);
        }
    }

    public final void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1485d49d", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject)) {
            jhj.b("IconIntroductoryDatasource", "onConfigUpdated configJson is not JSONObject");
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            f(jSONObject.getJSONArray("removeList"));
            c(jSONObject.getJSONArray("addList"));
        }
    }

    public final void c(JSONArray jSONArray) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7647b6e9", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    bVar = new b(11);
                    bVar.b = jSONObject.getString("materialType");
                    bVar.c = jSONObject.getString("materialSubType");
                    bVar.d = jSONObject.getJSONObject("resource");
                    bVar.e = jSONObject.getString("bizCode");
                    bVar.f = jSONObject.getString("trackInfo");
                    bVar.g = jSONObject.getString("bizData");
                } catch (Exception e) {
                    jhj.b("IconIntroductoryDatasource", "onConfigUpdated" + e);
                }
                if (!TextUtils.isEmpty(bVar.e) && !TextUtils.isEmpty(bVar.f) && bVar.d != null && !TextUtils.isEmpty(bVar.b) && !TextUtils.isEmpty(bVar.c) && !TextUtils.isEmpty(bVar.g)) {
                    ((lpj) this.b).w(bVar);
                }
                jhj.b("IconIntroductoryDatasource", "onConfigUpdated error. dataCompat: " + bVar);
                rpj.a("IconIntroductoryDatasource", "addByConfig error, some params is empty");
            }
        }
    }

    public final void f(JSONArray jSONArray) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("921b2e4c", new Object[]{this, jSONArray});
        } else if (jSONArray == null) {
            jhj.b("IconIntroductoryDatasource", "removeByConfig removeList is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    bVar = new b(12);
                    bVar.b = jSONObject.getString("materialType");
                    bVar.e = jSONObject.getString("bizCode");
                    bVar.f = jSONObject.getString("trackInfo");
                } catch (Exception e) {
                    jhj.b("IconIntroductoryDatasource", "removeByConfig" + e);
                }
                if (!TextUtils.isEmpty(bVar.e) && !TextUtils.isEmpty(bVar.f) && !TextUtils.isEmpty(bVar.b)) {
                    ((lpj) this.b).w(bVar);
                }
                jhj.b("IconIntroductoryDatasource", "removeByConfig error. dataCompat: " + bVar);
                rpj.a("IconIntroductoryDatasource", "removeByConfig error, some params is empty");
            }
        }
    }

    public final void g(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2d2f74", new Object[]{this, jSONArray});
        } else if (jSONArray == null) {
            jhj.b("IconIntroductoryDatasource", "removeIntroductoryByConfig removeList is null");
        } else {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    b bVar = new b(13);
                    bVar.e = jSONObject.getString("bizCode");
                    ((lpj) this.b).w(bVar);
                } catch (Exception e) {
                    jhj.b("IconIntroductoryDatasource", "removeByConfig" + e);
                }
            }
        }
    }
}
