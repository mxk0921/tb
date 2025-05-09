package com.taobao.android.diagnose.scene.engine.action;

import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.cio;
import tb.ff9;
import tb.hf9;
import tb.i90;
import tb.idh;
import tb.mq1;
import tb.oto;
import tb.t2o;
import tb.tx8;
import tb.uk7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UploadTLogAction extends mq1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Object g = new Object();
    public final TLogActionConfig e;
    public boolean f = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class TLogActionConfig {
        public boolean needWifi = true;
        public long uploadScope = 30;
        public int actionInterval = 5;

        static {
            t2o.a(615514188);
        }
    }

    static {
        t2o.a(615514186);
    }

    public UploadTLogAction(int i, String str, int i2) {
        super(i, str, i2);
        this.e = null;
        try {
            TLogActionConfig tLogActionConfig = (TLogActionConfig) JSON.parseObject(str, TLogActionConfig.class);
            this.e = tLogActionConfig;
            if (tLogActionConfig == null) {
                this.e = new TLogActionConfig();
            }
        } catch (Exception e) {
            idh.c("UploadTLogAction", "parse TLogActionConfig failed", e);
        }
    }

    public static /* synthetic */ Object ipc$super(UploadTLogAction uploadTLogAction, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/scene/engine/action/UploadTLogAction");
    }

    @Override // tb.x80
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e70e4212", new Object[]{this});
        }
        return i90.ACTION_TLOG_UPLOAD;
    }

    @Override // tb.x80
    public void c(tx8 tx8Var, cio cioVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0ae2bf", new Object[]{this, tx8Var, cioVar});
            return;
        }
        idh.b("UploadTLogAction", "Execute Action: " + b());
        try {
            synchronized (g) {
                if (this.f) {
                    idh.b("UploadTLogAction", "In scene upload process!");
                } else if (!oto.c(this.f24228a, cioVar.e(), this, this.e)) {
                    idh.b("UploadTLogAction", "Can't execute tlog upload");
                } else {
                    this.f = true;
                    Long l = (Long) tx8Var.c("triggerTime");
                    if (l == null) {
                        l = Long.valueOf(System.currentTimeMillis());
                    }
                    long longValue = l.longValue() - (this.e.uploadScope * 60000);
                    Object c = tx8Var.c("pageName");
                    if (c != null) {
                        str = String.valueOf(c);
                    } else {
                        str = "";
                    }
                    e(cioVar, longValue, l.longValue(), str);
                }
            }
        } catch (Exception e) {
            idh.c("UploadTLogAction", "Execute tlog action exception.", e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ff9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cio f7249a;
        public final /* synthetic */ long b;

        public a(UploadTLogAction uploadTLogAction, cio cioVar, long j) {
            this.f7249a = cioVar;
            this.b = j;
        }

        @Override // tb.ff9
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b47bc65d", new Object[]{this, str, str2});
            } else {
                idh.b("UploadTLogAction", String.format("uploadTLog %s success for %s, ts=%d", str, this.f7249a.g(), Long.valueOf(this.b)));
            }
        }

        @Override // tb.ff9
        public void onError(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffe51d4e", new Object[]{this, str, str2, str3});
            } else {
                idh.b("UploadTLogAction", String.format("uploadTLog failure for %s , ts=%d! ErrorCode: %s, ErrorMsg: %s", this.f7249a.g(), Long.valueOf(this.b), str2, str3));
            }
        }
    }

    public final void e(cio cioVar, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d9da36", new Object[]{this, cioVar, new Long(j), new Long(j2), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ParamsConstants.Key.PARAM_SCENE_CODE, cioVar.g());
        hashMap.put("sceneRuleCode", cioVar.f());
        hashMap.put("content", "SceneUpload");
        hashMap.put("appVersion", uk7.i().g().c().appVer);
        hashMap.put("pageName", str);
        idh.b("UploadTLogAction", String.format("Upload tlog file for scene. sceneCode=%s, sceneRuleCode=%s, ts=%d-%d, pageName=%s", cioVar.g(), cioVar.f(), Long.valueOf(j), Long.valueOf(j2), str));
        hf9.i("SCENE", "scene_upload", hashMap, new a(this, cioVar, j));
        synchronized (g) {
            oto.i(this.f24228a, cioVar.e(), b());
            this.f = false;
        }
    }
}
