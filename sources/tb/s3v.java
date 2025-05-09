package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s3v implements cgu<UserTrackDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UTTriggerPattern";

    /* renamed from: a  reason: collision with root package name */
    public final n45 f27782a;

    static {
        t2o.a(1034944728);
        t2o.a(1034944727);
    }

    public s3v(n45 n45Var) {
        this.f27782a = n45Var;
    }

    @Override // tb.cgu
    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a8bff31e", new Object[]{this});
        }
        return this.f27782a.b();
    }

    /* renamed from: c */
    public TriggerMatchResult a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("8f74fcb3", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult c = this.f27782a.c(userTrackDO);
        if (!c.f14216a) {
            return c;
        }
        n45 n45Var = this.f27782a;
        int i = n45Var.c;
        if (i <= 1) {
            return TriggerMatchResult.c();
        }
        int i2 = n45Var.d + 1;
        n45Var.d = i2;
        if (i2 >= i) {
            n45Var.d = 0;
            return TriggerMatchResult.c();
        }
        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_BATCH_NOT_MATCH;
        return TriggerMatchResult.b(triggerMatchResultCode, "batch is " + this.f27782a.c + "current is " + this.f27782a.d);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{triggerData:" + this.f27782a + "}";
    }
}
