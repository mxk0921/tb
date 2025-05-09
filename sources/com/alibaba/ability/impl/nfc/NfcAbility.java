package com.alibaba.ability.impl.nfc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.Ndef;
import android.os.Bundle;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.taobao.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import tb.a07;
import tb.ckf;
import tb.cu;
import tb.cwi;
import tb.d3k;
import tb.efb;
import tb.jpu;
import tb.kdb;
import tb.ldb;
import tb.t2o;
import tb.uj3;
import tb.uk0;
import tb.vq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class NfcAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CHECK_STATUS = "checkStatus";
    public static final String API_ON_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unSubscribe";

    /* renamed from: a  reason: collision with root package name */
    public static NfcAdapter f1996a;
    public static vq b;
    public static Activity d;
    public static final c Companion = new c(null);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static final NfcAdapter.ReaderCallback e = b.INSTANCE;
    public static final a f = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            if (ckf.b(activity, NfcAbility.access$getMTargetAct$cp())) {
                c.a(NfcAbility.Companion, activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                ckf.g(activity, "activity");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements NfcAdapter.ReaderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vq access$getMCallback$cp = NfcAbility.access$getMCallback$cp();
                if (access$getMCallback$cp != null) {
                    access$getMCallback$cp.b(new ErrorResult("1003", "当前设备不支持该类型的 NFC 芯片", (Map) null, 4, (a07) null));
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.ability.impl.nfc.NfcAbility$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class RunnableC0049b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ExecutingResult f1997a;

            public RunnableC0049b(ExecutingResult executingResult) {
                this.f1997a = executingResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                vq access$getMCallback$cp = NfcAbility.access$getMCallback$cp();
                if (access$getMCallback$cp != null) {
                    access$getMCallback$cp.d(this.f1997a);
                }
            }
        }

        @Override // android.nfc.NfcAdapter.ReaderCallback
        public final void onTagDiscovered(Tag tag) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f00418e1", new Object[]{this, tag});
                return;
            }
            Ndef ndef = Ndef.get(tag);
            if (ndef == null) {
                MegaUtils.A(a.INSTANCE, 0L, 2, null);
                return;
            }
            ndef.connect();
            c cVar = NfcAbility.Companion;
            ckf.f(tag, AdvanceSetting.NETWORK_TYPE);
            ExecutingResult b = c.b(cVar, tag, ndef);
            if (b != null) {
                MegaUtils.A(new RunnableC0049b(b), 0L, 2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(123731971);
        }

        public c() {
        }

        public static final /* synthetic */ void a(c cVar, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ecff38f", new Object[]{cVar, activity});
            } else {
                cVar.c(activity);
            }
        }

        public static final /* synthetic */ ExecutingResult b(c cVar, Tag tag, Ndef ndef) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutingResult) ipChange.ipc$dispatch("80744304", new Object[]{cVar, tag, ndef});
            }
            return cVar.d(tag, ndef);
        }

        public final void c(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da3ec9a2", new Object[]{this, activity});
                return;
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(NfcAbility.access$getMLifecycleCallback$cp());
            NfcAbility.access$setMTargetAct$cp(null);
            NfcAbility.access$setMNfcAdapter$cp(null);
            NfcAbility.access$setMCallback$cp(null);
            NfcAbility.access$isReaderMode$cp().set(false);
        }

        public /* synthetic */ c(a07 a07Var) {
            this();
        }

        public final ExecutingResult d(Tag tag, Ndef ndef) {
            String str;
            NdefRecord[] records;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutingResult) ipChange.ipc$dispatch("30ad98df", new Object[]{this, tag, ndef});
            }
            d3k d3kVar = d3k.INSTANCE;
            String[] techList = tag.getTechList();
            String b = d3kVar.b(techList != null ? techList[0] : null);
            if (ckf.b(b, "ISO 15693")) {
                Tag tag2 = ndef.getTag();
                ckf.f(tag2, "ndef.tag");
                byte[] id = tag2.getId();
                ckf.f(id, "ndef.tag.id");
                str = d3kVar.a(id);
            } else {
                Tag tag3 = ndef.getTag();
                ckf.f(tag3, "ndef.tag");
                byte[] id2 = tag3.getId();
                ckf.f(id2, "ndef.tag.id");
                str = d3kVar.d(id2);
            }
            ArrayList arrayList = new ArrayList();
            try {
                NdefMessage ndefMessage = ndef.getNdefMessage();
                if (!(ndefMessage == null || (records = ndefMessage.getRecords()) == null)) {
                    for (NdefRecord ndefRecord : records) {
                        ckf.f(ndefRecord, "curMsg");
                        Pair a2 = jpu.a("tnf", String.valueOf((int) ndefRecord.getTnf()));
                        byte[] type = ndefRecord.getType();
                        ckf.f(type, "curMsg.type");
                        Charset charset = uj3.UTF_8;
                        Pair a3 = jpu.a("type", new String(type, charset));
                        byte[] id3 = ndefRecord.getId();
                        ckf.f(id3, "curMsg.id");
                        Pair a4 = jpu.a("id", new String(id3, charset));
                        byte[] payload = ndefRecord.getPayload();
                        ckf.f(payload, "curMsg.payload");
                        arrayList.add(new JSONObject(kotlin.collections.a.k(a2, a3, a4, jpu.a("payload", new String(payload, charset)))));
                    }
                }
                return new ExecutingResult(new JSONObject(kotlin.collections.a.k(jpu.a("id", str), jpu.a("droidType", b), jpu.a("ndefMessage", new JSONArray(arrayList)))), "onReceive");
            } catch (FormatException | TagLostException | IOException unused) {
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements efb {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public d(Activity activity) {
            this.b = activity;
        }

        @Override // tb.efb
        public final void onResult(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9b609d1", new Object[]{this, new Boolean(z)});
            } else if (z) {
                Intent access$getTargetIntent = NfcAbility.access$getTargetIntent(NfcAbility.this, "android.settings.NFC_SETTINGS", this.b);
                access$getTargetIntent.addFlags(268435456);
                this.b.startActivity(access$getTargetIntent);
            }
        }
    }

    static {
        t2o.a(123731970);
    }

    public static final /* synthetic */ vq access$getMCallback$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vq) ipChange.ipc$dispatch("91a96f1e", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ a access$getMLifecycleCallback$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("77dde4c6", new Object[0]);
        }
        return f;
    }

    public static final /* synthetic */ NfcAdapter access$getMNfcAdapter$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NfcAdapter) ipChange.ipc$dispatch("2d7c9460", new Object[0]);
        }
        return f1996a;
    }

    public static final /* synthetic */ Activity access$getMTargetAct$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c149bb1a", new Object[0]);
        }
        return d;
    }

    public static final /* synthetic */ Intent access$getTargetIntent(NfcAbility nfcAbility, String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("6ab5138c", new Object[]{nfcAbility, str, activity});
        }
        return nfcAbility.f(str, activity);
    }

    public static final /* synthetic */ AtomicBoolean access$isReaderMode$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("5775dfc8", new Object[0]);
        }
        return c;
    }

    public static final /* synthetic */ void access$setMCallback$cp(vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f768a54c", new Object[]{vqVar});
        } else {
            b = vqVar;
        }
    }

    public static final /* synthetic */ void access$setMNfcAdapter$cp(NfcAdapter nfcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479283b0", new Object[]{nfcAdapter});
        } else {
            f1996a = nfcAdapter;
        }
    }

    public static final /* synthetic */ void access$setMTargetAct$cp(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc412294", new Object[]{activity});
        } else {
            d = activity;
        }
    }

    public static /* synthetic */ Object ipc$super(NfcAbility nfcAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/nfc/NfcAbility");
    }

    public final ExecuteResult a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("74b4bd2c", new Object[]{this, activity});
        }
        boolean c2 = d3k.INSTANCE.c(activity);
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("isSupportNfc", Boolean.valueOf(c2)), jpu.a("isReadingAvailable", Boolean.valueOf(e(activity) & c2)))), null, 2, null);
    }

    public final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7c80b5", new Object[]{this, activity});
            return;
        }
        NfcAdapter nfcAdapter = f1996a;
        if (nfcAdapter != null) {
            nfcAdapter.disableReaderMode(activity);
        }
    }

    public final void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402392fa", new Object[]{this, activity});
            return;
        }
        NfcAdapter nfcAdapter = f1996a;
        if (nfcAdapter != null) {
            nfcAdapter.enableReaderMode(activity, e, 31, null);
        }
    }

    public final Intent d(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f50579a9", new Object[]{this, activity, str});
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        return intent;
    }

    public final boolean e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("838816e6", new Object[]{this, activity})).booleanValue();
        }
        if (f1996a == null) {
            g(activity);
        }
        cwi cwiVar = cwi.INSTANCE;
        if (cwiVar.d()) {
            return cwiVar.b(activity);
        }
        NfcAdapter nfcAdapter = f1996a;
        if (nfcAdapter == null || !nfcAdapter.isEnabled()) {
            return false;
        }
        return true;
    }

    public final Intent f(String str, Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("3880a5ad", new Object[]{this, str, activity});
        }
        cwi cwiVar = cwi.INSTANCE;
        if (cwiVar.d() && d3k.INSTANCE.e(activity)) {
            intent = cwiVar.a(activity);
        } else {
            intent = new Intent(str);
        }
        if (intent == null) {
            return d(activity, str);
        }
        return intent;
    }

    public final void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e37ee3ed", new Object[]{this, activity});
            return;
        }
        Object systemService = activity.getSystemService("nfc");
        if (!(systemService instanceof NfcManager)) {
            systemService = null;
        }
        NfcManager nfcManager = (NfcManager) systemService;
        if (nfcManager != null) {
            f1996a = nfcManager.getDefaultAdapter();
        }
    }

    public final void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d239dd", new Object[]{this, activity});
        } else {
            new uk0(activity, new d(activity), Localization.q(R.string.app_prompt), Localization.q(R.string.taobao_app_1012_1_21208), Localization.q(R.string.app_know), Localization.q(R.string.taobao_app_1012_1_21209)).c();
        }
    }

    public final void h(Activity activity, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d0688", new Object[]{this, activity, vqVar});
            return;
        }
        AtomicBoolean atomicBoolean = c;
        if (atomicBoolean.get()) {
            vqVar.b(new ErrorResult("1001", "当前页面已有 NFC 阅读器开始工作", (Map) null, 4, (a07) null));
        } else if (!d3k.INSTANCE.c(activity)) {
            vqVar.b(new ErrorResult("1002", "当前设备不支持 NFC 识别能力", (Map) null, 4, (a07) null));
        } else if (!e(activity)) {
            i(activity);
        } else if (atomicBoolean.compareAndSet(false, true)) {
            b = vqVar;
            d = activity;
            activity.getApplication().registerActivityLifecycleCallbacks(f);
            c(activity);
        }
    }

    public final ExecuteResult j(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b200aa35", new Object[]{this, activity});
        }
        if (!c.compareAndSet(true, false)) {
            return new ErrorResult("1004", "当前页面NFC 阅读器未开始工作", (Map) null, 4, (a07) null);
        }
        b(activity);
        c.a(Companion, activity);
        return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("success", Boolean.TRUE))), null, 2, null);
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        ldb a2 = kdbVar.a();
        Context context = a2 != null ? a2.getContext() : null;
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return new ErrorResult("400", "Please set activity to AKAbilityRuntimeContext#context.", (Map) null, 4, (a07) null);
        }
        if (activity.isFinishing()) {
            return new ErrorResult("2002", "当前 Activity 正在销毁", (Map) null, 4, (a07) null);
        }
        int hashCode = str.hashCode();
        if (hashCode != -1707717967) {
            if (hashCode != 514841930) {
                if (hashCode == 768129818 && str.equals("checkStatus")) {
                    return a(activity);
                }
            } else if (str.equals("subscribe")) {
                h(activity, vqVar);
                return null;
            }
        } else if (str.equals(API_UNSUBSCRIBE)) {
            return j(activity);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (a07) null);
    }
}
