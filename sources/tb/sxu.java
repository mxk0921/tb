package tb;

import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.UltronDeltaProtocol;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.cij;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sxu extends gz<UMFRuleIO, UMFParseIO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public qio c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements x3e<k4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFRuleIO f28346a;

        public a(sxu sxuVar, UMFRuleIO uMFRuleIO) {
            this.f28346a = uMFRuleIO;
        }

        /* renamed from: b */
        public void a(k4e k4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35214445", new Object[]{this, k4eVar});
            } else {
                k4eVar.H0(this.f28346a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements x3e<k4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFRuleIO f28347a;
        public final /* synthetic */ hz b;

        public b(UMFRuleIO uMFRuleIO, hz hzVar) {
            this.f28347a = uMFRuleIO;
            this.b = hzVar;
        }

        /* renamed from: b */
        public void a(k4e k4eVar) {
            UltronDeltaProtocol b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35214445", new Object[]{this, k4eVar});
            } else if (this.f28347a.getActions() != null && (b = sxu.e(sxu.this).b(this.f28347a.getActions(), null, k4eVar)) != null) {
                UMFParseIO uMFParseIO = new UMFParseIO();
                uMFParseIO.dataProtocol = (JSONObject) JSON.toJSON(b);
                ((cij.a) this.b).b(uMFParseIO);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements x3e<k4e> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UMFParseIO f28348a;

        public c(sxu sxuVar, UMFParseIO uMFParseIO) {
            this.f28348a = uMFParseIO;
        }

        /* renamed from: b */
        public void a(k4e k4eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35214445", new Object[]{this, k4eVar});
            } else {
                k4eVar.H(this.f28348a);
            }
        }
    }

    static {
        t2o.a(80740687);
    }

    public sxu() {
        f();
    }

    public static /* synthetic */ qio e(sxu sxuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qio) ipChange.ipc$dispatch("f5a60453", new Object[]{sxuVar});
        }
        return sxuVar.c;
    }

    public static /* synthetic */ Object ipc$super(sxu sxuVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 846308095) {
            super.onAfterExecute((UMFBaseIO) objArr[0], (txu) objArr[1]);
            return null;
        } else if (hashCode == 1938185630) {
            super.onBeforeExecute((UMFBaseIO) objArr[0], (txu) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/umf/node/service/data/rule/UMFRulesService");
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            this.c = new qio();
        }
    }

    /* renamed from: g */
    public void onAfterExecute(UMFParseIO uMFParseIO, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e506f913", new Object[]{this, uMFParseIO, txuVar});
            return;
        }
        super.onAfterExecute(uMFParseIO, txuVar);
        a(k4e.class, new c(this, uMFParseIO));
    }

    /* renamed from: h */
    public void onBeforeExecute(UMFRuleIO uMFRuleIO, txu txuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c3d210a", new Object[]{this, uMFRuleIO, txuVar});
            return;
        }
        super.onBeforeExecute(uMFRuleIO, txuVar);
        a(k4e.class, new a(this, uMFRuleIO));
    }

    /* renamed from: i */
    public void onExecute(UMFRuleIO uMFRuleIO, txu txuVar, hz<UMFParseIO> hzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ef869b", new Object[]{this, uMFRuleIO, txuVar, hzVar});
            return;
        }
        List list = (List) a(k4e.class, new b(uMFRuleIO, hzVar)).a();
        if (list == null || list.isEmpty()) {
            ((cij.a) hzVar).a(new axu("-1", "没有注册IUMFRuleExtension，请检查配置"));
        }
    }

    @Override // tb.gz, com.alibaba.android.umf.node.service.IUMFService
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            super.onDestroy();
        }
    }
}
