package com.taobao.homepage.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.speed.TBSpeed;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class HomepageProxyActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809095);
    }

    public static /* synthetic */ Object ipc$super(HomepageProxyActivity homepageProxyActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/page/HomepageProxyActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        Nav.from(this).toUri("http://m.taobao.com/index.htm");
        finish();
    }

    public final void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804104c8", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("type");
        JSONArray jSONArray = jSONObject.getJSONArray("ids");
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof String) {
                arrayList.add((String) next);
            }
        }
        if (TextUtils.equals(string, KeepModel.STRATEGY_WHITE_LIST)) {
            TBSpeed.updateSpeedConfigStatus(this, arrayList, null);
            Toast.makeText(this, "白名单开关配置设置完成，重启生效", 1).show();
        } else if (TextUtils.equals(string, KeepModel.STRATEGY_BLACK_LIST)) {
            TBSpeed.updateSpeedConfigStatus(this, null, arrayList);
            Toast.makeText(this, "黑名单开关配置设置完成，重启生效", 1).show();
        } else {
            TBSpeed.updateSpeedConfigStatus(this, null, null);
            Toast.makeText(this, "开关配置恢复，重启生效", 1).show();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                String queryParameter = data.getQueryParameter("proxyParams");
                if (!TextUtils.isEmpty(queryParameter) && (parseObject = JSON.parseObject(queryParameter)) != null) {
                    if (parseObject.getBooleanValue("showSpeedStatus")) {
                        Toast.makeText(this, TBSpeed.getCurrentSpeedStatus(), 1).show();
                    }
                    if (parseObject.getInteger("topLevelSwitch") != null) {
                        b(parseObject.getIntValue("topLevelSwitch"));
                    }
                    if (parseObject.containsKey("speedConfig")) {
                        a(parseObject.getJSONObject("speedConfig"));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c94e79f", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 1) {
            Toast.makeText(this, "所有开关全开，重启生效", 0).show();
        } else if (i == 2) {
            Toast.makeText(this, "所有开关全关，重启生效", 0).show();
        } else if (i == 3) {
            Toast.makeText(this, "恢复正常线上的状态，重启生效", 0).show();
        }
        TBSpeed.updateTopLevelStatus(this, i);
    }
}
