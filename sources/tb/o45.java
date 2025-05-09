package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.n45;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o45 extends n45 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final n45.a e;
    public final n45.a f;
    public final n45.a g;
    public final n45.a h;
    public final Map<String, n45.a> i;
    public ArrayList<String> j;

    static {
        t2o.a(1034944703);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o45(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L_0x00fb
            int r0 = r5.size()
            if (r0 > 0) goto L_0x000d
            goto L_0x00fb
        L_0x000d:
            java.lang.String r0 = "eid"
            java.lang.Object r0 = r5.get(r0)
            r1 = 0
            if (r0 == 0) goto L_0x002c
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x0021
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x002d
        L_0x0021:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L_0x002c
            java.lang.Long r0 = (java.lang.Long) r0
            int r0 = r0.intValue()
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            r4.f24498a = r0
            java.lang.String r0 = "owner_id"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.b = r0
            java.lang.String r0 = "batch"
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L_0x0057
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x004d
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r1 = r0.intValue()
            goto L_0x0057
        L_0x004d:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L_0x0057
            java.lang.Long r0 = (java.lang.Long) r0
            int r1 = r0.intValue()
        L_0x0057:
            r4.c = r1
            java.lang.String r0 = "pg"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x006f
            tb.n45$a r1 = new tb.n45$a
            r1.<init>(r0)
            r4.e = r1
        L_0x006f:
            java.lang.String r0 = "arg1"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0084
            tb.n45$a r1 = new tb.n45$a
            r1.<init>(r0)
            r4.f = r1
        L_0x0084:
            java.lang.String r0 = "arg2"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0099
            tb.n45$a r1 = new tb.n45$a
            r1.<init>(r0)
            r4.g = r1
        L_0x0099:
            java.lang.String r0 = "arg3"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00ae
            tb.n45$a r1 = new tb.n45$a
            r1.<init>(r0)
            r4.h = r1
        L_0x00ae:
            java.lang.String r0 = "args"
            java.lang.Object r5 = r5.get(r0)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L_0x00fb
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x00fb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.i = r0
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00cd:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00fb
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00e6
            goto L_0x00cd
        L_0x00e6:
            java.util.Map<java.lang.String, tb.n45$a> r1 = r4.i
            java.lang.Object r2 = r0.getKey()
            tb.n45$a r3 = new tb.n45$a
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.<init>(r0)
            r1.put(r2, r3)
            goto L_0x00cd
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o45.<init>(java.util.Map):void");
    }

    public static /* synthetic */ Object ipc$super(o45 o45Var, String str, Object... objArr) {
        if (str.hashCode() == -759562652) {
            return super.c((UserTrackDO) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/model/DAIModelTriggerUTData");
    }

    @Override // tb.n45
    public ArrayList<String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a8bff31e", new Object[]{this});
        }
        ArrayList<String> arrayList = this.j;
        if (arrayList != null) {
            return arrayList;
        }
        this.j = new ArrayList<>();
        n45.a aVar = this.e;
        if (aVar == null || aVar.b()) {
            ArrayList<String> arrayList2 = this.j;
            arrayList2.add("" + this.f24498a);
        } else {
            ArrayList<String> arrayList3 = this.j;
            arrayList3.add("" + this.f24498a + "#" + this.e.a());
        }
        return this.j;
    }

    @Override // tb.n45
    public TriggerMatchResult c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TriggerMatchResult) ipChange.ipc$dispatch("d2b9fe64", new Object[]{this, userTrackDO});
        }
        TriggerMatchResult c = super.c(userTrackDO);
        if (!super.c(userTrackDO).f14216a) {
            return c;
        }
        n45.a aVar = this.e;
        if (!(aVar == null || aVar.c(userTrackDO.getPageName()))) {
            return TriggerMatchResult.b(TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_PAGE_NOT_MATCH, "page not match");
        }
        n45.a aVar2 = this.f;
        if (aVar2 == null || aVar2.c(userTrackDO.getArg1())) {
            n45.a aVar3 = this.g;
            if (aVar3 == null || aVar3.c(userTrackDO.getArg2())) {
                n45.a aVar4 = this.h;
                if (aVar4 == null || aVar4.c(userTrackDO.getArg3())) {
                    if (!(this.i == null || userTrackDO.getArgs() == null)) {
                        if (((HashMap) this.i).size() > userTrackDO.getArgs().size()) {
                            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
                            return TriggerMatchResult.b(triggerMatchResultCode, "args not match required size " + ((HashMap) this.i).size() + " but ut size is " + userTrackDO.getArgs().size());
                        }
                        for (Map.Entry entry : ((HashMap) this.i).entrySet()) {
                            if (!((n45.a) entry.getValue()).c(userTrackDO.getArgs().get(entry.getKey()))) {
                                TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode2 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
                                return TriggerMatchResult.b(triggerMatchResultCode2, "args not match for key " + ((String) entry.getKey()) + "  required " + ((n45.a) entry.getValue()).a() + " but found" + userTrackDO.getArgs().get(entry.getKey()));
                            }
                        }
                    }
                    return TriggerMatchResult.c();
                }
                TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode3 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG3_NOT_MATCH;
                return TriggerMatchResult.b(triggerMatchResultCode3, "arg2 not match required" + this.h.a() + " but found" + userTrackDO.getArg3());
            }
            TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode4 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG2_NOT_MATCH;
            return TriggerMatchResult.b(triggerMatchResultCode4, "arg2 not match required" + this.g.a() + " but found" + userTrackDO.getArg2());
        }
        TriggerMatchResult.TriggerMatchResultCode triggerMatchResultCode5 = TriggerMatchResult.TriggerMatchResultCode.TRIGGER_MATCH_RESULT_CODE_UT_ARG1_NOT_MATCH;
        return TriggerMatchResult.b(triggerMatchResultCode5, "arg1 not match required" + this.f.a() + " but found" + userTrackDO.getArg1());
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("{");
        sb.append(super.toString());
        String str5 = "";
        sb.append(str5);
        if (this.e != null) {
            str = ", pageName=" + this.e;
        } else {
            str = str5;
        }
        sb.append(str);
        if (this.f != null) {
            str2 = ", arg1=" + this.f;
        } else {
            str2 = str5;
        }
        sb.append(str2);
        if (this.g != null) {
            str3 = ", arg2=" + this.g;
        } else {
            str3 = str5;
        }
        sb.append(str3);
        if (this.h != null) {
            str4 = ", arg3=" + this.h;
        } else {
            str4 = str5;
        }
        sb.append(str4);
        if (this.i != null) {
            str5 = ", args=" + this.i;
        }
        sb.append(str5);
        sb.append('}');
        return sb.toString();
    }
}
