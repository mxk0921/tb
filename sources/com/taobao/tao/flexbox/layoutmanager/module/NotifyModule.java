package com.taobao.tao.flexbox.layoutmanager.module;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.io.Serializable;
import tb.akt;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class NotifyModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317311);
        t2o.a(503316559);
    }

    private static boolean checkNotifyValid(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6129272", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof o.r) {
            return ((o.r) obj).isAlive();
        }
        if (obj instanceof Activity) {
            return !((Activity) obj).isFinishing();
        }
        return true;
    }

    public static void offNotify(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25c689f4", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("name");
            if (!TextUtils.isEmpty(string)) {
                jVar.f11976a.I().J(string, jVar);
            }
        }
    }

    public static void onNotify(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79c39b84", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("name");
            if (!TextUtils.isEmpty(string)) {
                jVar.f11976a.I().F(string, jVar);
            }
        }
    }

    public static void postNotify(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa580a3", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if (json instanceof JSONObject) {
            String string = ((JSONObject) json).getString("name");
            if (!TextUtils.isEmpty(string)) {
                Intent intent = new Intent(string);
                JSONObject jSONObject = ((JSONObject) jVar.b).getJSONObject("args");
                if (!nwv.o(((JSONObject) jVar.b).get("appear"), false) || checkNotifyValid(jVar.f11976a.W())) {
                    if (!(jSONObject == null || jSONObject.keySet() == null)) {
                        for (String str : jSONObject.keySet()) {
                            putIntentExtra(intent, str, jSONObject.get(str));
                        }
                    }
                    o oVar = jVar.f11976a;
                    if (oVar != null) {
                        oVar.I().G(intent);
                    } else {
                        LocalBroadcastManager.getInstance(o.J()).sendBroadcast(intent);
                    }
                }
            }
        }
    }

    private static void putIntentExtra(Intent intent, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13939caf", new Object[]{intent, str, obj});
        } else if (obj == null) {
        } else {
            if (obj instanceof Integer) {
                intent.putExtra(str, ((Integer) obj).intValue());
            } else if (obj instanceof Float) {
                intent.putExtra(str, ((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                intent.putExtra(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                intent.putExtra(str, ((Long) obj).longValue());
            } else if (obj instanceof Short) {
                intent.putExtra(str, ((Short) obj).shortValue());
            } else if (obj instanceof String) {
                intent.putExtra(str, (String) obj);
            } else if (obj instanceof CharSequence) {
                intent.putExtra(str, (CharSequence) obj);
            } else if (obj instanceof Character) {
                intent.putExtra(str, ((Character) obj).charValue());
            } else if (obj instanceof Boolean) {
                intent.putExtra(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                intent.putExtra(str, ((Byte) obj).byteValue());
            } else if (!akt.f0() || !(obj instanceof Serializable)) {
                intent.putExtra(str, obj.toString());
            } else {
                intent.putExtra(str, (Serializable) obj);
            }
        }
    }
}
