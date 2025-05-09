package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hd5 implements oub {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_AUTO_ID = 1000;
    public static final int EVENTCHAIN_MINOR_VERSION = 7;
    public static final String FILE_START_TAG = "ALIDX";
    public static final int MAJOR_VERSION = 3;
    public static final int MINOR_VERSION_0 = 0;
    public static final int MINOR_VERSION_1 = 1;
    public static final int MINOR_VERSION_10 = 10;
    public static final int MINOR_VERSION_12 = 12;
    public static final int MINOR_VERSION_13 = 13;
    public static final int MINOR_VERSION_8 = 8;
    public static final int MINOR_VERSION_9 = 9;
    public static final int STATE_continue = 0;
    public static final int STATE_failed = 2;
    public static final int STATE_successful = 1;
    public static final short TYPE_ADAPTIVE_UNIT = 32;
    public static final short TYPE_BIG_STRING = 2048;
    public static final short TYPE_COLOR = 16;
    public static final short TYPE_DOUBLE = 4;
    public static final short TYPE_ENUM = 512;
    public static final short TYPE_INT = 1;
    public static final short TYPE_LIST = 128;
    public static final short TYPE_LONG = 2;
    public static final short TYPE_MAP = 256;
    public static final short TYPE_NATIVE_UNIT = 64;
    public static final short TYPE_OBJECT = 1024;
    public static final short TYPE_STRING = 8;

    /* renamed from: a  reason: collision with root package name */
    public int f20558a;
    public final id6 c;
    public final bw5 e;
    public final dv5 f;
    public final pv5 h;
    public final xw5 m;
    public final Stack<DXWidgetNode> k = new Stack<>();
    public int o = 1000;
    public final id6 b = new id6();
    public final wk6 d = new wk6();
    public final kw5 i = new kw5();
    public final qb6 j = new qb6();
    public final fg5 g = new fg5();
    public final gd5 l = new gd5();
    public final c56 n = new c56();

    static {
        t2o.a(444597014);
        t2o.a(444598016);
    }

    public hd5() {
        id6 id6Var = new id6();
        this.c = id6Var;
        this.e = new bw5(id6Var);
        this.f = new dv5(id6Var);
        xw5 xw5Var = new xw5();
        this.m = xw5Var;
        this.h = new pv5(xw5Var);
    }

    @Override // tb.oub
    public DXWidgetNode b(byte[] bArr, DXRuntimeContext dXRuntimeContext, Context context, boolean z) {
        tv5 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5dc142fa", new Object[]{this, bArr, dXRuntimeContext, context, new Boolean(z)});
        }
        if (bArr == null) {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EMPTY));
            la6.b("DXBinaryLoader loadFromBuffer null == buf");
            return null;
        }
        lg5 f = f(bArr, dXRuntimeContext, z, context);
        DXWidgetNode e = e(f, dXRuntimeContext, context);
        if (e == null) {
            la6.b("DXBinaryLoader loadFromBuffer dxWidgetNode == null!");
            return null;
        }
        if (this.f20558a >= 7 && (d = d(f, dXRuntimeContext, context)) != null) {
            e.setDxEventChains(d);
        }
        if (this.f20558a >= 8) {
            e.setDxExprBytes(this.i.a());
            if (!(this.i.a() == null || this.i.a().length <= 0 || dXRuntimeContext.s().d() == null)) {
                dXRuntimeContext.s().d().b(dXRuntimeContext.p().d(), this.i.a(), 0);
            }
            this.j.a(dXRuntimeContext, z);
        }
        if (this.f20558a >= 8 && z) {
            h(e, e);
        }
        if (this.f20558a >= 9) {
            e.setCodeMap(this.e.b());
        }
        return e;
    }

    /* renamed from: c */
    public oub<oub> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oub) ipChange.ipc$dispatch("dc6382b", new Object[]{this});
        }
        return new hd5();
    }

    public final tv5 d(lg5 lg5Var, DXRuntimeContext dXRuntimeContext, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tv5) ipChange.ipc$dispatch("1a0c304a", new Object[]{this, lg5Var, dXRuntimeContext, context});
        }
        if (lg5Var == null) {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_CREATE_EVENTCHIAN_READER_EMPTY));
            return null;
        }
        try {
            return this.h.a(lg5Var, dXRuntimeContext);
        } catch (Exception e) {
            if (DinamicXEngine.j0()) {
                e.printStackTrace();
            }
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_CREATE_EVENT_CHAIN_ERROR, xv5.a(e)));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x04f6 A[Catch: Exception -> 0x00bd, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05cf A[Catch: Exception -> 0x00bd, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0640 A[Catch: Exception -> 0x00bd, LOOP:4: B:224:0x063e->B:225:0x0640, LOOP_END, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x043b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a A[Catch: Exception -> 0x00bd, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0164 A[Catch: Exception -> 0x00bd, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cc A[Catch: Exception -> 0x00bd, TRY_ENTER, TryCatch #1 {Exception -> 0x00bd, blocks: (B:14:0x0088, B:17:0x009b, B:20:0x00c0, B:22:0x00c8, B:24:0x00e1, B:26:0x00eb, B:28:0x0106, B:38:0x0132, B:40:0x0138, B:42:0x013e, B:44:0x0154, B:46:0x015a, B:49:0x0164, B:51:0x016c, B:53:0x01a6, B:55:0x01c0, B:59:0x01cc, B:83:0x0205, B:85:0x0216, B:87:0x0222, B:89:0x0251, B:90:0x0255, B:92:0x0267, B:93:0x026b, B:96:0x0287, B:98:0x028d, B:101:0x0293, B:104:0x02cc, B:105:0x02d1, B:108:0x02ed, B:110:0x02f3, B:113:0x02f9, B:116:0x0324, B:117:0x0329, B:119:0x0340, B:120:0x0345, B:122:0x0364, B:124:0x0370, B:125:0x037d, B:127:0x038f, B:128:0x0394, B:130:0x03a6, B:132:0x03b2, B:134:0x03e1, B:135:0x03e6, B:137:0x03f8, B:138:0x03fd, B:140:0x0410, B:141:0x0415, B:143:0x0428, B:144:0x042d, B:147:0x0443, B:150:0x0449, B:152:0x0452, B:153:0x0498, B:155:0x04ae, B:157:0x04b4, B:158:0x04bb, B:162:0x04d3, B:164:0x04d9, B:165:0x04de, B:168:0x04e6, B:170:0x04ec, B:173:0x04f6, B:175:0x0501, B:177:0x050a, B:181:0x0520, B:183:0x0526, B:185:0x0530, B:187:0x0561, B:189:0x0571, B:191:0x0579, B:193:0x0585, B:195:0x058b, B:196:0x058e, B:199:0x05a6, B:200:0x05b4, B:203:0x05c3, B:205:0x05c9, B:208:0x05cf, B:210:0x05d9, B:212:0x05e1, B:214:0x061a, B:217:0x0628, B:218:0x062c, B:220:0x0632, B:223:0x063a, B:225:0x0640, B:232:0x067f, B:236:0x068f, B:247:0x06cd, B:106:0x02e1, B:94:0x027b), top: B:253:0x0088, inners: #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.DXWidgetNode e(tb.lg5 r25, com.taobao.android.dinamicx.DXRuntimeContext r26, android.content.Context r27) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hd5.e(tb.lg5, com.taobao.android.dinamicx.DXRuntimeContext, android.content.Context):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48f81579", new Object[]{this})).booleanValue();
        }
        if (this.n.a().a() == null && this.n.c().a() == null && this.n.b().c() == null && this.n.d().a() == null) {
            return false;
        }
        return true;
    }

    public void h(DXWidgetNode dXWidgetNode, DXWidgetNode dXWidgetNode2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb68bcee", new Object[]{this, dXWidgetNode, dXWidgetNode2});
        } else if (dXWidgetNode2 != null) {
            if (dXWidgetNode2 instanceof bi6) {
                bi6 bi6Var = (bi6) dXWidgetNode2;
                if (bi6Var.H() == 2) {
                    dXWidgetNode = this.g.a(bi6Var.getName() + "_" + bi6Var.getVersion());
                    if (dXWidgetNode != null) {
                        if (!zg5.u2()) {
                            bi6Var.addChild(dXWidgetNode, false);
                        } else if (eb5.y()) {
                            bi6Var.addChild(dXWidgetNode.deepCloneForEmbed(dXWidgetNode.getDXRuntimeContext()), false);
                        } else {
                            bi6Var.addChild(dXWidgetNode.deepClone(dXWidgetNode.getDXRuntimeContext()), false);
                        }
                    }
                } else if (bi6Var.H() != 1) {
                    bi6Var.isRemote();
                } else if (bi6Var.getChildrenCount() != 1) {
                    h36.g(h36.TAG, "内联的子模版有问题，其getChildrenCount() != 1");
                } else {
                    DXWidgetNode childAt = bi6Var.getChildAt(0);
                    childAt.setDxEventChains(dXWidgetNode.getDxEventChains());
                    childAt.setAnimation(dXWidgetNode.getAnimation());
                    childAt.setDxExprBytes(dXWidgetNode.getDxExprBytes());
                    dXWidgetNode = childAt;
                }
            }
            if ((dXWidgetNode2 instanceof j) || dXWidgetNode2.getChildrenCount() > 0) {
                for (int i = 0; i < dXWidgetNode2.getChildrenCount(); i++) {
                    h(dXWidgetNode, dXWidgetNode2.getChildAt(i));
                }
            }
        }
    }

    public final lg5 f(byte[] bArr, DXRuntimeContext dXRuntimeContext, boolean z, Context context) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lg5) ipChange.ipc$dispatch("cf406806", new Object[]{this, bArr, dXRuntimeContext, new Boolean(z), context});
        }
        lg5 lg5Var = new lg5();
        String str = new String(bArr, 0, 5);
        if (!FILE_START_TAG.equals(str)) {
            Log.e("BinaryLoader_TMTEST", "loadFromBuffer failed tag is invalidate:".concat(str));
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_TAG_ERROR));
            if (zg5.o5()) {
                uh6.v(dXRuntimeContext.c(), dXRuntimeContext.p(), "remove loadFromBuffer failed tag is invalidate:");
            }
            return null;
        }
        lg5Var.m(bArr);
        lg5Var.l(5);
        if (lg5Var.e() != 3) {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_MAJOR_VERSION_ERROR));
            return null;
        }
        this.f20558a = lg5Var.j();
        short j = lg5Var.j();
        String str2 = new String(lg5Var.a(), lg5Var.c(), (int) j);
        lg5Var.l(j);
        lg5Var.n(lg5Var.j());
        int h = lg5Var.h();
        int h2 = lg5Var.h();
        int h3 = lg5Var.h();
        int h4 = lg5Var.h();
        int h5 = lg5Var.h();
        int h6 = lg5Var.h();
        int h7 = lg5Var.h();
        int h8 = lg5Var.h();
        int h9 = lg5Var.h();
        int h10 = lg5Var.h();
        int i2 = this.f20558a;
        if (i2 >= 7) {
            this.h.k(i2);
            this.h.f(lg5Var.h());
            this.h.e(lg5Var.h());
            this.h.j(lg5Var.h());
            this.h.i(lg5Var.h());
            this.h.h(lg5Var.h());
            this.h.g(lg5Var.h());
        }
        if (this.f20558a >= 8) {
            this.i.d(lg5Var.h());
            this.i.c(lg5Var.h());
            this.g.d(lg5Var.h());
            this.g.c(lg5Var.h());
        }
        if (this.f20558a >= 10) {
            int h11 = lg5Var.h();
            i = h7;
            this.l.c(lg5Var.h());
            this.l.d(h11);
        } else {
            i = h7;
        }
        if (this.f20558a >= 12) {
            this.m.e(lg5Var.h());
            this.m.d(lg5Var.h());
        }
        if (this.f20558a >= 13) {
            this.n.g(lg5Var.h());
            this.n.f(lg5Var.h());
        }
        try {
            if (this.f20558a >= 13) {
                this.n.e(lg5Var);
            }
        } catch (Throwable th) {
            xv5.b(th);
        }
        if (this.f20558a >= 10) {
            this.l.b(lg5Var, dXRuntimeContext);
        }
        if (this.f20558a >= 12) {
            this.m.b(lg5Var, dXRuntimeContext);
        }
        if (this.f20558a >= 8) {
            this.g.b(lg5Var, dXRuntimeContext, context);
        }
        if (lg5Var.k(h)) {
            this.d.b(str2, h2, lg5Var);
            if (lg5Var.c() != h3) {
                List<f.a> list = dXRuntimeContext.m().c;
                ((ArrayList) list).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_STRING_LOADER_POSITION_ERROR, "string pos error:" + h3 + "  read pos:" + lg5Var.c()));
            } else if (!this.b.b(h4, lg5Var, dXRuntimeContext)) {
                la6.b("string loadFromBuffer error!");
            }
            if (lg5Var.c() != h5) {
                List<f.a> list2 = dXRuntimeContext.m().c;
                ((ArrayList) list2).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_VARSTRING_LOADER_POSITION_ERROR, "var string pos error:" + h3 + "  read pos:" + lg5Var.c()));
            } else if (!this.c.b(h6, lg5Var, dXRuntimeContext)) {
                la6.b("var string loadFromBuffer error!");
            }
            if (lg5Var.c() != i) {
                List<f.a> list3 = dXRuntimeContext.m().c;
                ((ArrayList) list3).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EXPR_LOADER_POSITION_ERROR, "expr pos error:" + i + "  read pos:" + lg5Var.c()));
            } else if (!this.e.d(h8, lg5Var, dXRuntimeContext)) {
                la6.b("expr loadFromBuffer error!");
            }
            if (lg5Var.c() != h9) {
                ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_ENUM_LOADER_POSITION_ERROR, "enum pos error:" + i + "  read pos:" + lg5Var.c()));
            } else if (!this.f.b(h10, lg5Var, dXRuntimeContext)) {
                la6.b("enum loadFromBuffer error!");
            }
        } else {
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_BINARY_FILE_UI_LOADER_POSITION_ERROR));
        }
        try {
            if (this.f20558a >= 7 && !this.h.d(lg5Var, dXRuntimeContext)) {
                la6.b("event chain loadFromBuffer error!");
            }
        } catch (Exception e) {
            xv5.b(e);
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Event_Chain_Binary", f.DXERROR_PIPELINE_BINARY_FILE_EVENT_CHAIN_LOADER_EVENTCHIAN, xv5.a(e)));
        }
        try {
            if (this.f20558a >= 8 && !this.i.b(lg5Var, dXRuntimeContext)) {
                la6.b("Expr Script loadFromBuffer error!");
            }
        } catch (Throwable th2) {
            xv5.b(th2);
            ((ArrayList) dXRuntimeContext.m().c).add(new f.a("Pipeline", "Pipeline_Stage_Load_Binary", f.DXERROR_PIPELINE_CREATE_LOAD_DX_EXPR_SCRIPT, xv5.a(th2)));
        }
        lg5Var.k(h);
        return lg5Var;
    }
}
