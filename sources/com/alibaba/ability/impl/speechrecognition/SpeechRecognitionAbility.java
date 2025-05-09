package com.alibaba.ability.impl.speechrecognition;

import android.content.Context;
import com.alibaba.ability.impl.speechrecognition.nui.SpeechRecognizer;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility;
import java.util.Map;
import tb.a07;
import tb.ckf;
import tb.f0m;
import tb.g1a;
import tb.jbq;
import tb.jdb;
import tb.kdb;
import tb.ldb;
import tb.qrd;
import tb.t2o;
import tb.tao;
import tb.xhv;
import tb.zf4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class SpeechRecognitionAbility extends AbsSpeechRecognitionAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public SpeechRecognizer f2038a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(133169155);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f2039a;

        public b(g1a g1aVar) {
            this.f2039a = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f2039a.invoke(Boolean.TRUE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a f2040a;

        public c(g1a g1aVar) {
            this.f2040a = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f2040a.invoke(Boolean.FALSE);
            }
        }
    }

    static {
        t2o.a(133169154);
    }

    public static final /* synthetic */ SpeechRecognizer access$getSpeechRecognizer$p(SpeechRecognitionAbility speechRecognitionAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpeechRecognizer) ipChange.ipc$dispatch("4f494c55", new Object[]{speechRecognitionAbility});
        }
        return speechRecognitionAbility.f2038a;
    }

    public static final /* synthetic */ void access$setSpeechRecognizer$p(SpeechRecognitionAbility speechRecognitionAbility, SpeechRecognizer speechRecognizer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291c00bd", new Object[]{speechRecognitionAbility, speechRecognizer});
        } else {
            speechRecognitionAbility.f2038a = speechRecognizer;
        }
    }

    public static /* synthetic */ Object ipc$super(SpeechRecognitionAbility speechRecognitionAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/speechrecognition/SpeechRecognitionAbility");
    }

    public final void a(Context context, String str, g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ed163d", new Object[]{this, context, str, g1aVar});
        } else if (f0m.INSTANCE.a(context, "android.permission.RECORD_AUDIO")) {
            g1aVar.invoke(Boolean.TRUE);
        } else {
            com.taobao.runtimepermission.a.c(context, new String[]{"android.permission.RECORD_AUDIO"}).t(str).A(new b(g1aVar)).z(new c(g1aVar)).m();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility
    public tao<Boolean, ErrorResult> isSupport(kdb kdbVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("4b75aaf7", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            return new tao<>(Boolean.FALSE, new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
        }
        return new tao<>(Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.microphone")), null, 2, null);
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        SpeechRecognizer speechRecognizer = this.f2038a;
        if (speechRecognizer != null) {
            speechRecognizer.l();
            this.f2038a = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.Context, T] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showPanel(tb.kdb r10, tb.ibq r11, tb.prd r12) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.speechrecognition.SpeechRecognitionAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "9efd0fbd"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            r10 = 2
            r2[r10] = r11
            r10 = 3
            r2[r10] = r12
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "context"
            tb.ckf.g(r10, r0)
            java.lang.String r0 = "params"
            tb.ckf.g(r11, r0)
            java.lang.String r0 = "callback"
            tb.ckf.g(r12, r0)
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            tb.ldb r1 = r10.l()
            if (r1 == 0) goto L_0x0061
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L_0x0061
            r0.element = r1
            tb.ldb r10 = r10.l()
            java.lang.String r10 = r10.getBusinessID()
            int r1 = r10.length()
            if (r1 <= 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r10 = 0
        L_0x004e:
            if (r10 == 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            java.lang.String r10 = "megability_default"
        L_0x0054:
            T r1 = r0.element
            android.content.Context r1 = (android.content.Context) r1
            com.alibaba.ability.impl.speechrecognition.SpeechRecognitionAbility$showPanel$1 r2 = new com.alibaba.ability.impl.speechrecognition.SpeechRecognitionAbility$showPanel$1
            r2.<init>(r0, r10, r11, r12)
            r9.a(r1, r10, r2)
            return
        L_0x0061:
            com.alibaba.ability.result.ErrorResult r10 = new com.alibaba.ability.result.ErrorResult
            r7 = 4
            r8 = 0
            java.lang.String r4 = "500"
            java.lang.String r5 = "env.getContext is null"
            r6 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r12.O(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.speechrecognition.SpeechRecognitionAbility.showPanel(tb.kdb, tb.ibq, tb.prd):void");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility
    public void start(kdb kdbVar, jbq jbqVar, qrd qrdVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54eba2f8", new Object[]{this, kdbVar, jbqVar, qrdVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jbqVar, "params");
        ckf.g(qrdVar, "callback");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            qrdVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        String businessID = kdbVar.l().getBusinessID();
        if (businessID.length() <= 0) {
            businessID = null;
        }
        if (businessID == null) {
            businessID = "megability_default";
        }
        a(context, businessID, new SpeechRecognitionAbility$start$1(this, context, businessID, jbqVar, qrdVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility
    public void stop(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4b8f2f4", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        SpeechRecognizer speechRecognizer = this.f2038a;
        if (speechRecognizer != null) {
            speechRecognizer.l();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsSpeechRecognitionAbility
    public void prepare(kdb kdbVar, jdb jdbVar) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96b56439", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(jdbVar, "callback");
        ldb l = kdbVar.l();
        if (l == null || (context = l.getContext()) == null) {
            jdbVar.O(new ErrorResult("500", "env.getContext is null", (Map) null, 4, (a07) null));
            return;
        }
        String businessID = kdbVar.l().getBusinessID();
        if (businessID.length() <= 0) {
            businessID = null;
        }
        if (businessID == null) {
            businessID = "megability_default";
        }
        zf4.d(zf4.INSTANCE, context, businessID, null, null, 12, null);
    }
}
