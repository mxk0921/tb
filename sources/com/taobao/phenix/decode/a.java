package com.taobao.phenix.decode;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pexode.PexodeOptions;
import com.taobao.phenix.loader.network.IncompleteResponseException;
import tb.fiv;
import tb.fpm;
import tb.fs1;
import tb.kk4;
import tb.p3o;
import tb.s0m;
import tb.t2o;
import tb.ud8;
import tb.uw6;
import tb.vd8;
import tb.wd8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends fs1<uw6, wd8, com.taobao.phenix.request.a> implements p3o<com.taobao.phenix.request.a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757083);
    }

    public a() {
        super(0, 1);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/decode/DecodeProducer");
    }

    public final void Q(kk4<uw6, com.taobao.phenix.request.a> kk4Var, boolean z, wd8 wd8Var, DecodeException decodeException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10fc90b", new Object[]{this, kk4Var, new Boolean(z), wd8Var, decodeException});
        } else if (z) {
            decodeException.setLocalUri(kk4Var.getContext().G().q());
            Throwable th = decodeException;
            if (wd8Var != null) {
                decodeException.dataFromDisk(wd8Var.k);
                th = decodeException;
                if (!wd8Var.k) {
                    th = decodeException;
                    if (!wd8Var.g) {
                        th = decodeException;
                        if (wd8Var.a()) {
                            fiv.y("Decoder", kk4Var.getContext(), "actual decode error=%s, convert to error=IncompleteContentError", decodeException);
                            th = new IncompleteResponseException();
                        }
                    }
                }
            }
            kk4Var.a(th);
        } else {
            fiv.o("Decoder", kk4Var.getContext(), "intermediate result decode error=%s, request not failed yet", decodeException);
        }
    }

    public final wd8 R(wd8 wd8Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wd8) ipChange.ipc$dispatch("f5e001b0", new Object[]{this, wd8Var});
        }
        vd8 p = s0m.B().p();
        if (p == null) {
            return wd8Var;
        }
        ud8 inspectEncodedData = p.inspectEncodedData(wd8Var.i, wd8Var);
        if (inspectEncodedData != null && inspectEncodedData.a()) {
            z = true;
        }
        fpm.b(z, "inspected data cannot be null or not available!");
        if (inspectEncodedData == wd8Var) {
            return wd8Var;
        }
        return wd8Var.d(inspectEncodedData, wd8Var.l).f(true);
    }

    /* renamed from: S */
    public void b(com.taobao.phenix.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe6678f", new Object[]{this, aVar});
            return;
        }
        fiv.p("Phenix", "Decode Cancel.", aVar);
        PexodeOptions P = aVar.P();
        if (P != null) {
            aVar.A0(null);
            fiv.m("Decoder", aVar, "cancelled image decoding, result=%b", Boolean.valueOf(P.requestCancel()));
        }
    }

    @Override // tb.oh3
    public boolean c(kk4<uw6, com.taobao.phenix.request.a> kk4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3214a19", new Object[]{this, kk4Var})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024d A[Catch: all -> 0x022e, UnsatisfiedLinkError -> 0x0236, OutOfMemoryError -> 0x023e, TryCatch #24 {OutOfMemoryError -> 0x023e, UnsatisfiedLinkError -> 0x0236, all -> 0x022e, blocks: (B:62:0x0158, B:64:0x015e, B:99:0x01cf, B:100:0x01e9, B:111:0x0248, B:113:0x024d, B:115:0x0256, B:116:0x025b, B:118:0x025f, B:120:0x0265, B:122:0x0273, B:124:0x0278, B:125:0x027e, B:129:0x0298, B:130:0x029d, B:132:0x02a5, B:137:0x02b9, B:139:0x02cc, B:141:0x02d8, B:145:0x02e1, B:147:0x02f4, B:149:0x02fa), top: B:275:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0256 A[Catch: all -> 0x022e, UnsatisfiedLinkError -> 0x0236, OutOfMemoryError -> 0x023e, TryCatch #24 {OutOfMemoryError -> 0x023e, UnsatisfiedLinkError -> 0x0236, all -> 0x022e, blocks: (B:62:0x0158, B:64:0x015e, B:99:0x01cf, B:100:0x01e9, B:111:0x0248, B:113:0x024d, B:115:0x0256, B:116:0x025b, B:118:0x025f, B:120:0x0265, B:122:0x0273, B:124:0x0278, B:125:0x027e, B:129:0x0298, B:130:0x029d, B:132:0x02a5, B:137:0x02b9, B:139:0x02cc, B:141:0x02d8, B:145:0x02e1, B:147:0x02f4, B:149:0x02fa), top: B:275:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025f A[Catch: all -> 0x022e, UnsatisfiedLinkError -> 0x0236, OutOfMemoryError -> 0x023e, TryCatch #24 {OutOfMemoryError -> 0x023e, UnsatisfiedLinkError -> 0x0236, all -> 0x022e, blocks: (B:62:0x0158, B:64:0x015e, B:99:0x01cf, B:100:0x01e9, B:111:0x0248, B:113:0x024d, B:115:0x0256, B:116:0x025b, B:118:0x025f, B:120:0x0265, B:122:0x0273, B:124:0x0278, B:125:0x027e, B:129:0x0298, B:130:0x029d, B:132:0x02a5, B:137:0x02b9, B:139:0x02cc, B:141:0x02d8, B:145:0x02e1, B:147:0x02f4, B:149:0x02fa), top: B:275:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a5 A[Catch: all -> 0x022e, UnsatisfiedLinkError -> 0x0236, OutOfMemoryError -> 0x023e, TRY_LEAVE, TryCatch #24 {OutOfMemoryError -> 0x023e, UnsatisfiedLinkError -> 0x0236, all -> 0x022e, blocks: (B:62:0x0158, B:64:0x015e, B:99:0x01cf, B:100:0x01e9, B:111:0x0248, B:113:0x024d, B:115:0x0256, B:116:0x025b, B:118:0x025f, B:120:0x0265, B:122:0x0273, B:124:0x0278, B:125:0x027e, B:129:0x0298, B:130:0x029d, B:132:0x02a5, B:137:0x02b9, B:139:0x02cc, B:141:0x02d8, B:145:0x02e1, B:147:0x02f4, B:149:0x02fa), top: B:275:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b9 A[Catch: all -> 0x022e, UnsatisfiedLinkError -> 0x0236, OutOfMemoryError -> 0x023e, TRY_ENTER, TryCatch #24 {OutOfMemoryError -> 0x023e, UnsatisfiedLinkError -> 0x0236, all -> 0x022e, blocks: (B:62:0x0158, B:64:0x015e, B:99:0x01cf, B:100:0x01e9, B:111:0x0248, B:113:0x024d, B:115:0x0256, B:116:0x025b, B:118:0x025f, B:120:0x0265, B:122:0x0273, B:124:0x0278, B:125:0x027e, B:129:0x0298, B:130:0x029d, B:132:0x02a5, B:137:0x02b9, B:139:0x02cc, B:141:0x02d8, B:145:0x02e1, B:147:0x02f4, B:149:0x02fa), top: B:275:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0364 A[Catch: all -> 0x03aa, UnsatisfiedLinkError -> 0x03ad, OutOfMemoryError -> 0x03b0, TRY_LEAVE, TryCatch #23 {OutOfMemoryError -> 0x03b0, UnsatisfiedLinkError -> 0x03ad, all -> 0x03aa, blocks: (B:151:0x0306, B:166:0x035d, B:168:0x0364, B:171:0x0379), top: B:276:0x0306 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x045c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x049b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:294:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v37, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.util.TypedValue] */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 3 */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(tb.kk4<tb.uw6, com.taobao.phenix.request.a> r29, boolean r30, tb.wd8 r31) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.phenix.decode.a.K(tb.kk4, boolean, tb.wd8):void");
    }
}
