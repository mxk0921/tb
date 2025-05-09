package com.taobao.tbpoplayer.util;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import tb.o78;
import tb.rgm;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBPositionMgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public PositionInfo f13409a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class PosBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(790626508);
        }

        public PosBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(PosBroadcastReceiver posBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/util/TBPositionMgr$PosBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", "TBPositionMgr.PosBroadcastReceiver get action");
            if (TBPositionMgr.a(TBPositionMgr.this, context)) {
                StringBuilder sb = new StringBuilder("TBPositionMgr.current EditionPosition code=");
                if (TBPositionMgr.b(TBPositionMgr.this) != null) {
                    str = TBPositionMgr.b(TBPositionMgr.this).editionCode;
                } else {
                    str = "empty";
                }
                sb.append(str);
                wdm.f(wdm.CATEGORY_TRIGGER_EVENT, "", sb.toString());
                try {
                    Intent intent2 = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                    intent2.putExtra("event", InternalTriggerController.getCurUri());
                    intent2.putExtra("param", "switchMode:clean");
                    intent2.putExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS, "switchMode:clean");
                    intent2.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "positionSwitch");
                    LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent2);
                } catch (Throwable th) {
                    wdm.h("updatePositionInfo error.", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TBPositionMgr f13411a = new TBPositionMgr();

        static {
            t2o.a(790626509);
        }

        public static /* synthetic */ TBPositionMgr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPositionMgr) ipChange.ipc$dispatch("57d609cc", new Object[0]);
            }
            return f13411a;
        }
    }

    static {
        t2o.a(790626506);
    }

    public static /* synthetic */ boolean a(TBPositionMgr tBPositionMgr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ff46f06", new Object[]{tBPositionMgr, context})).booleanValue();
        }
        return tBPositionMgr.g(context);
    }

    public static /* synthetic */ PositionInfo b(TBPositionMgr tBPositionMgr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("4e9bc39e", new Object[]{tBPositionMgr});
        }
        return tBPositionMgr.f13409a;
    }

    public static TBPositionMgr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPositionMgr) ipChange.ipc$dispatch("23d9d847", new Object[0]);
        }
        return b.a();
    }

    public final PositionInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("69624dbf", new Object[]{this});
        }
        if (this.f13409a == null) {
            this.f13409a = o78.i(PopLayer.getReference().getApp());
        }
        return this.f13409a;
    }

    public void d(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
            intentFilter.addAction(o78.ACTION_LOCATION_CHANGED);
            application.registerReceiver(new PosBroadcastReceiver(), intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean f(BaseConfigItem baseConfigItem) {
        PositionInfo c;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fb6545f", new Object[]{this, baseConfigItem})).booleanValue();
        }
        if (baseConfigItem == null) {
            return false;
        }
        if (baseConfigItem.extra == null || (c = c()) == null) {
            return true;
        }
        try {
            JSONObject parseObject = JSON.parseObject(baseConfigItem.extra);
            if (parseObject.containsKey("positions") && (jSONArray = parseObject.getJSONArray("positions")) != null) {
                int size = jSONArray.size();
                for (int i = 0; i < size; i++) {
                    if (jSONArray.get(i).toString().equals(c.editionCode)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            wdm.h("TBPositionMgr.isValidConfig.error.", th);
        }
        return true;
    }

    public final boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a63dbd9", new Object[]{this, context})).booleanValue();
        }
        wdm.d("TBPositionMgr.updatePosInfoIfNeed", new Object[0]);
        if (this.f13409a == null) {
            this.f13409a = o78.i(context);
        } else {
            PositionInfo i = o78.i(context);
            if (this.f13409a.equals(i)) {
                return false;
            }
            PositionInfo positionInfo = this.f13409a;
            this.f13409a = i;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourceEditionCode", (Object) positionInfo.editionCode);
            jSONObject.put("targetEditionCode", (Object) this.f13409a.editionCode);
            rgm.h().p("PopLayer", rgm.PAGE_EVENT_EDITION_SWITCHED, jSONObject, new JSONObject());
        }
        return true;
    }
}
