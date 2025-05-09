package kotlinx.coroutines.channels;

import androidx.exifinterface.media.ExifInterface;
import com.alibaba.security.realidentity.l1;
import com.alibaba.security.realidentity.o;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.loc.at;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.ScoreLevel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.c;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import tb.a07;
import tb.ar4;
import tb.bj3;
import tb.bmi;
import tb.bmv;
import tb.ckf;
import tb.d1a;
import tb.dkf;
import tb.dv6;
import tb.f9p;
import tb.g1a;
import tb.g9f;
import tb.g9p;
import tb.gk2;
import tb.h30;
import tb.h9p;
import tb.i9p;
import tb.jv6;
import tb.k9p;
import tb.kqu;
import tb.lca;
import tb.pg1;
import tb.q23;
import tb.qln;
import tb.qww;
import tb.rgq;
import tb.rww;
import tb.s23;
import tb.se4;
import tb.sm8;
import tb.te4;
import tb.u1a;
import tb.u1r;
import tb.v8p;
import tb.vu4;
import tb.w08;
import tb.w1a;
import tb.x8p;
import tb.xhv;
import tb.y1a;
import tb.zi3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003¬\u0001LB3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJZ\u0010 \u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0082\b¢\u0006\u0004\b \u0010!JG\u0010%\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&JG\u0010'\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010)\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0011H\u0003¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0011H\u0002¢\u0006\u0004\b,\u0010*J\u001b\u0010-\u001a\u00020#*\u00020\"2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J1\u00100\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b0\u00101J)\u00102\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u0010\u0017J\u001d\u00103\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b3\u00104J@\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0011H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b6\u00101J&\u00107\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b7\u00104Jù\u0001\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u001082\b\u0010\u001c\u001a\u0004\u0018\u00010\"2!\u0010;\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00010\u00052Q\u0010?\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u00010<2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2S\b\u0002\u0010@\u001aM\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(/\u0012\u0004\u0012\u00028\u00010<H\u0082\b¢\u0006\u0004\bA\u0010BJg\u0010C\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00152!\u0010;\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0082\b¢\u0006\u0004\bC\u0010DJ9\u0010E\u001a\u0004\u0018\u00010\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bE\u0010FJ9\u0010G\u001a\u0004\u0018\u00010\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bG\u0010FJ)\u0010H\u001a\u00020#*\u00020\"2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0006H\u0002¢\u0006\u0004\bJ\u0010KJ-\u0010M\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010NJ\u0019\u0010Q\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u0011H\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\n\u0010T\u001a\u0006\u0012\u0002\b\u00030SH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010Y\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bY\u0010ZJ%\u0010[\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030S2\b\u0010W\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b[\u0010\\J\u001b\u0010]\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030SH\u0002¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b_\u0010ZJ%\u0010`\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b`\u0010ZJ%\u0010a\u001a\u0004\u0018\u00010\"2\b\u0010W\u001a\u0004\u0018\u00010\"2\b\u0010X\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\ba\u0010ZJ\u000f\u0010b\u001a\u00020\u0006H\u0002¢\u0006\u0004\bb\u0010KJ\u000f\u0010c\u001a\u00020\u0006H\u0002¢\u0006\u0004\bc\u0010KJ\u000f\u0010d\u001a\u00020\u0006H\u0002¢\u0006\u0004\bd\u0010KJ\u000f\u0010e\u001a\u00020\u0006H\u0002¢\u0006\u0004\be\u0010KJ\u000f\u0010f\u001a\u00020\u0006H\u0002¢\u0006\u0004\bf\u0010KJ\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010g\u001a\u00020\u0011H\u0002¢\u0006\u0004\bh\u0010iJ\u0017\u0010j\u001a\u00020\u00062\u0006\u0010g\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010RJ\u0015\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b8\u0010kJ\u001d\u0010m\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ\u001d\u0010o\u001a\u00020\u00062\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010pJ%\u0010r\u001a\u00020\u00062\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010q\u001a\u00020\u0011H\u0002¢\u0006\u0004\br\u0010sJ\u0013\u0010t\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bt\u0010uJ\u0013\u0010v\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\bv\u0010uJ\u001b\u0010x\u001a\u00020\u0006*\u00020\u00152\u0006\u0010w\u001a\u00020#H\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010|\u001a\u00020#2\u0006\u0010z\u001a\u00020\u00112\u0006\u0010{\u001a\u00020#H\u0002¢\u0006\u0004\b|\u0010}J-\u0010\u007f\u001a\u00020#2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010~\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u007f\u0010NJ2\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\u00112\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J2\u0010\u0084\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\u00112\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J;\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\u00112\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J*\u0010\u0088\u0001\u001a\u00020\u00062\u0007\u0010\u0080\u0001\u001a\u00020\u00112\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001a\u0010\u008b\u0001\u001a\u00020\u00062\u0007\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008b\u0001\u0010RJ\u001a\u0010\u008c\u0001\u001a\u00020\u00062\u0007\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008c\u0001\u0010RJ\u001d\u0010\u008d\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0005\b\u008d\u0001\u0010\rJ)\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006052\u0006\u0010\u000b\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001d\u0010\u0090\u0001\u001a\u00020#2\u0006\u0010\u000b\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0005\b\u0090\u0001\u0010\rJñ\u0001\u0010\u0093\u0001\u001a\u00028\u0001\"\u0004\b\u0001\u001082\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2=\u0010?\u001a9\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0004\u0012\u00028\u00010\u0091\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d2i\b\u0002\u0010@\u001ac\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(=\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(>\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u0092\u0001H\u0084\b¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0012\u0010\u0095\u0001\u001a\u00020#H\u0010¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0011\u0010\u0097\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0097\u0001\u0010KJ\u0011\u0010\u0098\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0098\u0001\u0010KJ\u0016\u0010\u0099\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J#\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0005\b>\u0010\u009a\u0001J!\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009d\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u009e\u0001\u0010RJ\u0019\u0010\u009f\u0001\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u009f\u0001\u0010RJ'\u0010 \u0001\u001a\u00020\u00062\n\u0010T\u001a\u0006\u0012\u0002\b\u00030S2\b\u0010\u000b\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0005\b \u0001\u0010\\J\u001a\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¡\u0001H\u0096\u0002¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0011\u0010¤\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b¤\u0001\u0010KJ\u001c\u0010\u0012\u001a\u00020#2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0016¢\u0006\u0005\b\u0012\u0010§\u0001J\u001c\u0010¨\u0001\u001a\u00020#2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001¢\u0006\u0006\b¨\u0001\u0010§\u0001J\u000f\u0010©\u0001\u001a\u00020\u0006¢\u0006\u0005\b©\u0001\u0010KJ#\u0010¬\u0001\u001a\u00020\u00062\u0011\u0010¦\u0001\u001a\f\u0018\u00010ª\u0001j\u0005\u0018\u0001`«\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001e\u0010®\u0001\u001a\u00020#2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u0001H\u0010¢\u0006\u0006\b®\u0001\u0010§\u0001J'\u0010°\u0001\u001a\u00020#2\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00012\u0007\u0010¯\u0001\u001a\u00020#H\u0014¢\u0006\u0006\b°\u0001\u0010±\u0001J:\u0010³\u0001\u001a\u00020\u00062&\u0010²\u0001\u001a!\u0012\u0017\u0012\u0015\u0018\u00010¥\u0001¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(¦\u0001\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0012\u0010µ\u0001\u001a\u00020#H\u0000¢\u0006\u0006\bµ\u0001\u0010\u0096\u0001J\u0013\u0010·\u0001\u001a\u00030¶\u0001H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u0013\u0010¹\u0001\u001a\u00030¶\u0001H\u0000¢\u0006\u0006\b¹\u0001\u0010¸\u0001J\u000f\u0010º\u0001\u001a\u00020\u0006¢\u0006\u0005\bº\u0001\u0010KR\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010»\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\bL\u0010¼\u0001R\u0083\u0001\u0010Ã\u0001\u001ag\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030S¢\u0006\f\b9\u0012\b\b:\u0012\u0004\b\b(T\u0012\u0016\u0012\u0014\u0018\u00010\"¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(½\u0001\u0012\u0016\u0012\u0014\u0018\u00010\"¢\u0006\r\b9\u0012\t\b:\u0012\u0005\b\b(¾\u0001\u0012\u0011\u0012\u000f\u0012\u0005\u0012\u00030¥\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010<j\u0005\u0018\u0001`¿\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÀ\u0001\u0010Á\u0001\u0012\u0005\bÂ\u0001\u0010KR\u0017\u0010Æ\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0017\u0010È\u0001\u001a\u00020#8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010\u0096\u0001R0\u0010Ì\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000É\u00018VX\u0096\u0004¢\u0006\u000e\u0012\u0005\bË\u0001\u0010K\u001a\u0005\bL\u0010Ê\u0001R%\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000Í\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÏ\u0001\u0010K\u001a\u0006\bÀ\u0001\u0010Î\u0001R.\u0010Ó\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000050Í\u00018VX\u0096\u0004ø\u0001\u0000¢\u0006\u000f\u0012\u0005\bÒ\u0001\u0010K\u001a\u0006\bÑ\u0001\u0010Î\u0001R'\u0010Ö\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000Í\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÕ\u0001\u0010K\u001a\u0006\bÔ\u0001\u0010Î\u0001R\u0018\u0010Ù\u0001\u001a\u00030¥\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u001e\u0010Ü\u0001\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÛ\u0001\u0010K\u001a\u0006\bÚ\u0001\u0010\u0096\u0001R\u001a\u0010Þ\u0001\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010*R\u001d\u0010{\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bà\u0001\u0010K\u001a\u0006\bß\u0001\u0010\u0096\u0001R\u001a\u0010â\u0001\u001a\u00020#*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010*R\u001e\u0010å\u0001\u001a\u00020#8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bä\u0001\u0010K\u001a\u0006\bã\u0001\u0010\u0096\u0001R\u0016\u0010q\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010Å\u0001R\u0017\u0010è\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010Å\u0001R\u001a\u0010ê\u0001\u001a\u0005\u0018\u00010¥\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010Ø\u0001R\u0018\u0010ì\u0001\u001a\u00030¥\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010Ø\u0001R\u0017\u0010î\u0001\u001a\u00020#8TX\u0094\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010\u0096\u0001R\u0014\u0010ï\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004R\f\u0010ð\u0001\u001a\u00020\"8\u0002X\u0082\u0004R\u0018\u0010ñ\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\"8\u0002X\u0082\u0004R\u0014\u0010ò\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004R\f\u0010ó\u0001\u001a\u00020\"8\u0002X\u0082\u0004R\u0018\u0010ô\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\"8\u0002X\u0082\u0004R\f\u0010õ\u0001\u001a\u00020\"8\u0002X\u0082\u0004R\u0018\u0010ö\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\"8\u0002X\u0082\u0004R\f\u0010÷\u0001\u001a\u00020\"8\u0002X\u0082\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006ø\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/c;", "", "capacity", "Lkotlin/Function1;", "Ltb/xhv;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILtb/g1a;)V", "element", "P0", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Ltb/zi3;", "segment", "index", "", "s", com.alipay.sdk.m.f.b.c, "(Ltb/zi3;ILjava/lang/Object;JLtb/ar4;)Ljava/lang/Object;", "Ltb/qww;", "V0", "(Ltb/qww;Ltb/zi3;I)V", "Ltb/q23;", "cont", "Q0", "(Ljava/lang/Object;Ltb/q23;)V", "waiter", "Lkotlin/Function0;", "onRendezvousOrBuffered", "onClosed", "u1", "(Ltb/zi3;ILjava/lang/Object;JLtb/qww;Ltb/d1a;Ltb/d1a;)V", "", "", IDecisionResult.STATE_CLOSED, "G1", "(Ltb/zi3;ILjava/lang/Object;JLjava/lang/Object;Z)I", "H1", "curSendersAndCloseStatus", "w1", "(J)Z", "curSenders", "L", "z1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "h1", "(Ltb/zi3;IJLtb/ar4;)Ljava/lang/Object;", "U0", "M0", "(Ltb/q23;)V", "Lkotlinx/coroutines/channels/e;", "d1", "L0", "R", "Lkotlin/ParameterName;", "name", "onElementRetrieved", "Lkotlin/Function3;", "segm", bmv.MSGTYPE_INTERVAL, "onSuspend", "onNoWaiterSuspend", "e1", "(Ljava/lang/Object;Ltb/g1a;Ltb/w1a;Ltb/d1a;Ltb/w1a;)Ljava/lang/Object;", "g1", "(Ltb/zi3;IJLtb/qww;Ltb/g1a;Ltb/d1a;)V", "E1", "(Ltb/zi3;IJLjava/lang/Object;)Ljava/lang/Object;", "F1", "A1", "(Ljava/lang/Object;Ltb/zi3;I)Z", "X", "()V", TplMsg.VALUE_T_NATIVE_RETURN, "C1", "(Ltb/zi3;IJ)Z", "D1", "nAttempts", "p0", "(J)V", "Ltb/k9p;", ThemisConfig.SCENE_SELECT, "O0", "(Ljava/lang/Object;Ltb/k9p;)V", "ignoredParam", "selectResult", "Z0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "j1", "(Ltb/k9p;Ljava/lang/Object;)V", ScoreLevel.N0, "(Ltb/k9p;)V", "W0", "Y0", "X0", "r0", "I0", "H0", "G0", "V", "sendersCur", "U", "(J)Ltb/zi3;", "T", "()Ltb/zi3;", "lastSegment", "F0", "(Ltb/zi3;)J", l1.f, "(Ltb/zi3;)V", "sendersCounter", "P", "(Ltb/zi3;J)V", "m1", "(Ltb/qww;)V", "n1", bmi.KEY_RECEIVER, "o1", "(Ltb/qww;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", lca.STAGE_T0, "(JZ)Z", "globalIndex", "s0", "id", "startFrom", "a0", "(JLtb/zi3;)Ltb/zi3;", "Z", "currentBufferEndCounter", "Y", "(JLtb/zi3;J)Ltb/zi3;", "J0", "(JLtb/zi3;)V", "value", "J1", "I1", "d", "m", "(Ljava/lang/Object;)Ljava/lang/Object;", "q1", "Lkotlin/Function2;", "Lkotlin/Function4;", "s1", "(Ljava/lang/Object;Ljava/lang/Object;Ltb/d1a;Ltb/u1a;Ltb/d1a;Ltb/y1a;)Ljava/lang/Object;", "x1", "()Z", "S0", "R0", "a1", "(Ltb/ar4;)Ljava/lang/Object;", o.b, "()Ljava/lang/Object;", "globalCellIndex", "W", "K1", "k1", "Lkotlinx/coroutines/channels/ChannelIterator;", pg1.ATOM_EXT_iterator, "()Lkotlinx/coroutines/channels/ChannelIterator;", "K0", "", "cause", "(Ljava/lang/Throwable;)Z", "N", "M", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "a", "(Ljava/util/concurrent/CancellationException;)V", "O", "cancel", ExifInterface.LATITUDE_SOUTH, "(Ljava/lang/Throwable;Z)Z", "handler", at.k, "(Ltb/g1a;)V", "o0", "", "toString", "()Ljava/lang/String;", "y1", "Q", TLogTracker.LEVEL_INFO, "Ltb/g1a;", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", at.j, "Ltb/w1a;", "j0", "onUndeliveredElementReceiveCancellationConstructor", "c0", "()J", "bufferEndCounter", "C0", "isRendezvousOrUnlimited", "Ltb/h9p;", "()Ltb/h9p;", "i0", "onSend", "Ltb/f9p;", "()Ltb/f9p;", "e0", "onReceive", "n", "f0", "onReceiveCatching", "g0", "h0", "onReceiveOrNull", "k0", "()Ljava/lang/Throwable;", "receiveException", "f", "x0", "isClosedForSend", "y0", "isClosedForSend0", "u0", "v0", "w0", "isClosedForReceive0", "A0", "B0", "isEmpty", "n0", "l0", "receiversCounter", "d0", "closeCause", "m0", "sendException", "z0", "isConflatedDropOldest", "_closeCause", "bufferEnd", "bufferEndSegment", "closeHandler", "completedExpandBuffersAndPauseFlag", "receiveSegment", "receivers", "sendSegment", "sendersAndCloseStatus", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class BufferedChannel<E> implements c<E> {
    private static final AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "c");
    private static final AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "d");
    private static final AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "e");
    private static final AtomicLongFieldUpdater p = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "f");
    private static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, at.f);
    private static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "h");
    private static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, bmv.MSGTYPE_INTERVAL);
    private static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, at.k);
    private static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "l");

    /* renamed from: a  reason: collision with root package name */
    private final int f15251a;
    public final g1a<E, xhv> b;
    @Volatile
    private volatile long c;
    @Volatile
    private volatile long d;
    @Volatile
    private volatile long e;
    @Volatile
    private volatile long f;
    @Volatile
    private volatile Object g;
    @Volatile
    private volatile Object h;
    @Volatile
    private volatile Object i;
    private final w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> j;
    @Volatile
    private volatile Object k;
    @Volatile
    private volatile Object l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a implements ChannelIterator<E>, qww {

        /* renamed from: a  reason: collision with root package name */
        public Object f15252a;
        public c<? super Boolean> b;

        public a() {
            u1r u1rVar;
            u1rVar = BufferedChannelKt.n;
            this.f15252a = u1rVar;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object a(ar4<? super Boolean> ar4Var) {
            zi3<E> zi3Var;
            u1r u1rVar;
            u1r u1rVar2;
            u1r u1rVar3;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.r;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            zi3<E> zi3Var2 = (zi3) atomicReferenceFieldUpdater.get(bufferedChannel);
            while (!bufferedChannel.u0()) {
                long andIncrement = BufferedChannel.n.getAndIncrement(bufferedChannel);
                long j = BufferedChannelKt.SEGMENT_SIZE;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (zi3Var2.e != j2) {
                    zi3<E> Z = bufferedChannel.Z(j2, zi3Var2);
                    if (Z == null) {
                        continue;
                    } else {
                        zi3Var = Z;
                    }
                } else {
                    zi3Var = zi3Var2;
                }
                Object E1 = bufferedChannel.E1(zi3Var, i, andIncrement, null);
                u1rVar = BufferedChannelKt.k;
                if (E1 != u1rVar) {
                    u1rVar2 = BufferedChannelKt.m;
                    if (E1 == u1rVar2) {
                        if (andIncrement < bufferedChannel.n0()) {
                            zi3Var.b();
                        }
                        zi3Var2 = zi3Var;
                    } else {
                        u1rVar3 = BufferedChannelKt.l;
                        if (E1 == u1rVar3) {
                            return f(zi3Var, i, andIncrement, ar4Var);
                        }
                        zi3Var.b();
                        this.f15252a = E1;
                        return gk2.a(true);
                    }
                } else {
                    throw new IllegalStateException("unreachable");
                }
            }
            g();
            return gk2.a(false);
        }

        @Override // tb.qww
        public void c(v8p<?> v8pVar, int i) {
            c<? super Boolean> cVar = this.b;
            if (cVar != null) {
                cVar.c(v8pVar, i);
            }
        }

        public final Object f(zi3<E> zi3Var, int i, long j, ar4<? super Boolean> ar4Var) {
            u1r u1rVar;
            u1r u1rVar2;
            Boolean a2;
            u1r u1rVar3;
            u1r u1rVar4;
            u1r u1rVar5;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            c b = s23.b(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var));
            try {
                this.b = b;
                Object E1 = bufferedChannel.E1(zi3Var, i, j, this);
                u1rVar = BufferedChannelKt.k;
                if (E1 == u1rVar) {
                    bufferedChannel.U0(this, zi3Var, i);
                } else {
                    u1rVar2 = BufferedChannelKt.m;
                    g1a<Throwable, xhv> g1aVar = null;
                    if (E1 == u1rVar2) {
                        if (j < bufferedChannel.n0()) {
                            zi3Var.b();
                        }
                        zi3 zi3Var2 = (zi3) BufferedChannel.r.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.u0()) {
                                h();
                                break;
                            }
                            long andIncrement = BufferedChannel.n.getAndIncrement(bufferedChannel);
                            long j2 = BufferedChannelKt.SEGMENT_SIZE;
                            long j3 = andIncrement / j2;
                            int i2 = (int) (andIncrement % j2);
                            if (zi3Var2.e != j3) {
                                zi3 Z = bufferedChannel.Z(j3, zi3Var2);
                                if (Z != null) {
                                    zi3Var2 = Z;
                                }
                            }
                            Object E12 = bufferedChannel.E1(zi3Var2, i2, andIncrement, this);
                            u1rVar3 = BufferedChannelKt.k;
                            if (E12 == u1rVar3) {
                                bufferedChannel.U0(this, zi3Var2, i2);
                                break;
                            }
                            u1rVar4 = BufferedChannelKt.m;
                            if (E12 != u1rVar4) {
                                u1rVar5 = BufferedChannelKt.l;
                                if (E12 != u1rVar5) {
                                    zi3Var2.b();
                                    this.f15252a = E12;
                                    this.b = null;
                                    a2 = gk2.a(true);
                                    g1a<E, xhv> g1aVar2 = bufferedChannel.b;
                                    if (g1aVar2 != null) {
                                        g1aVar = OnUndeliveredElementKt.a(g1aVar2, E12, b.getContext());
                                    }
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            } else if (andIncrement < bufferedChannel.n0()) {
                                zi3Var2.b();
                            }
                        }
                    } else {
                        zi3Var.b();
                        this.f15252a = E1;
                        this.b = null;
                        a2 = gk2.a(true);
                        g1a<E, xhv> g1aVar3 = bufferedChannel.b;
                        if (g1aVar3 != null) {
                            g1aVar = OnUndeliveredElementKt.a(g1aVar3, E1, b.getContext());
                        }
                    }
                    b.l(a2, g1aVar);
                }
                Object A = b.A();
                if (A == dkf.d()) {
                    jv6.c(ar4Var);
                }
                return A;
            } catch (Throwable th) {
                b.S();
                throw th;
            }
        }

        public final boolean g() {
            this.f15252a = BufferedChannelKt.z();
            Throwable d0 = BufferedChannel.this.d0();
            if (d0 == null) {
                return false;
            }
            throw rgq.j(d0);
        }

        public final void h() {
            c<? super Boolean> cVar = this.b;
            ckf.d(cVar);
            this.b = null;
            this.f15252a = BufferedChannelKt.z();
            Throwable d0 = BufferedChannel.this.d0();
            if (d0 == null) {
                cVar.resumeWith(Result.m1108constructorimpl(Boolean.FALSE));
                return;
            }
            if (dv6.c()) {
                d0 = rgq.i(d0, cVar);
            }
            cVar.resumeWith(Result.m1108constructorimpl(kotlin.b.a(d0)));
        }

        public final boolean i(E e) {
            boolean B;
            c<? super Boolean> cVar = this.b;
            ckf.d(cVar);
            g1a<Throwable, xhv> g1aVar = null;
            this.b = null;
            this.f15252a = e;
            Boolean bool = Boolean.TRUE;
            g1a<E, xhv> g1aVar2 = BufferedChannel.this.b;
            if (g1aVar2 != null) {
                g1aVar = OnUndeliveredElementKt.a(g1aVar2, e, cVar.getContext());
            }
            B = BufferedChannelKt.B(cVar, bool, g1aVar);
            return B;
        }

        public final void j() {
            c<? super Boolean> cVar = this.b;
            ckf.d(cVar);
            this.b = null;
            this.f15252a = BufferedChannelKt.z();
            Throwable d0 = BufferedChannel.this.d0();
            if (d0 == null) {
                cVar.resumeWith(Result.m1108constructorimpl(Boolean.FALSE));
                return;
            }
            if (dv6.c()) {
                d0 = rgq.i(d0, cVar);
            }
            cVar.resumeWith(Result.m1108constructorimpl(kotlin.b.a(d0)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            u1r u1rVar;
            u1r u1rVar2;
            E e = (E) this.f15252a;
            u1rVar = BufferedChannelKt.n;
            if (e != u1rVar) {
                u1rVar2 = BufferedChannelKt.n;
                this.f15252a = u1rVar2;
                if (e != BufferedChannelKt.z()) {
                    return e;
                }
                throw rgq.j(BufferedChannel.this.k0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b implements qww {

        /* renamed from: a  reason: collision with root package name */
        public final q23<Boolean> f15253a;
        public final /* synthetic */ c<Boolean> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(q23<? super Boolean> q23Var) {
            this.f15253a = q23Var;
            ckf.e(q23Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.b = (c) q23Var;
        }

        public final q23<Boolean> a() {
            return this.f15253a;
        }

        @Override // tb.qww
        public void c(v8p<?> v8pVar, int i) {
            this.b.c(v8pVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, g1a<? super E, xhv> g1aVar) {
        long A;
        u1r u1rVar;
        this.f15251a = i;
        this.b = g1aVar;
        if (i >= 0) {
            A = BufferedChannelKt.A(i);
            this.e = A;
            this.f = c0();
            zi3 zi3Var = new zi3(0L, null, this, 3);
            this.g = zi3Var;
            this.h = zi3Var;
            if (C0()) {
                zi3Var = BufferedChannelKt.f15254a;
                ckf.e(zi3Var, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.i = zi3Var;
            this.j = g1aVar != 0 ? new BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1(this) : null;
            u1rVar = BufferedChannelKt.q;
            this.k = u1rVar;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    private final boolean A1(Object obj, zi3<E> zi3Var, int i) {
        if (obj instanceof q23) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.C((q23) obj, xhv.INSTANCE, null, 2, null);
        } else if (obj instanceof k9p) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            TrySelectDetailedResult y = ((SelectImplementation) obj).y(this, xhv.INSTANCE);
            if (y == TrySelectDetailedResult.REREGISTER) {
                zi3Var.s(i);
            }
            if (y == TrySelectDetailedResult.SUCCESSFUL) {
                return true;
            }
            return false;
        } else if (obj instanceof b) {
            return BufferedChannelKt.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    private final void B1(AtomicLongFieldUpdater atomicLongFieldUpdater, g1a<? super Long, Long> g1aVar, Object obj) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, g1aVar.invoke(Long.valueOf(j)).longValue()));
    }

    private final boolean C0() {
        long c0 = c0();
        if (c0 == 0 || c0 == Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    private final boolean C1(zi3<E> zi3Var, int i, long j) {
        u1r u1rVar;
        u1r u1rVar2;
        Object w = zi3Var.w(i);
        if ((w instanceof qww) && j >= n.get(this)) {
            u1rVar = BufferedChannelKt.e;
            if (zi3Var.r(i, w, u1rVar)) {
                if (A1(w, zi3Var, i)) {
                    zi3Var.A(i, BufferedChannelKt.BUFFERED);
                    return true;
                }
                u1rVar2 = BufferedChannelKt.h;
                zi3Var.A(i, u1rVar2);
                zi3Var.x(i, false);
                return false;
            }
        }
        return D1(zi3Var, i, j);
    }

    private final void D0(AtomicLongFieldUpdater atomicLongFieldUpdater, g1a<? super Long, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final boolean D1(zi3<E> zi3Var, int i, long j) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        u1r u1rVar6;
        u1r u1rVar7;
        u1r u1rVar8;
        while (true) {
            Object w = zi3Var.w(i);
            if (!(w instanceof qww)) {
                u1rVar3 = BufferedChannelKt.h;
                if (w != u1rVar3) {
                    if (w != null) {
                        if (w != BufferedChannelKt.BUFFERED) {
                            u1rVar5 = BufferedChannelKt.f;
                            if (w == u1rVar5) {
                                break;
                            }
                            u1rVar6 = BufferedChannelKt.g;
                            if (w == u1rVar6) {
                                break;
                            }
                            u1rVar7 = BufferedChannelKt.i;
                            if (w == u1rVar7 || w == BufferedChannelKt.z()) {
                                return true;
                            }
                            u1rVar8 = BufferedChannelKt.d;
                            if (w != u1rVar8) {
                                throw new IllegalStateException(("Unexpected cell state: " + w).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        u1rVar4 = BufferedChannelKt.c;
                        if (zi3Var.r(i, w, u1rVar4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j >= n.get(this)) {
                u1rVar = BufferedChannelKt.e;
                if (zi3Var.r(i, w, u1rVar)) {
                    if (A1(w, zi3Var, i)) {
                        zi3Var.A(i, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    u1rVar2 = BufferedChannelKt.h;
                    zi3Var.A(i, u1rVar2);
                    zi3Var.x(i, false);
                    return false;
                }
            } else if (zi3Var.r(i, w, new rww((qww) w))) {
                return true;
            }
        }
    }

    private final void E0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E1(zi3<E> zi3Var, int i, long j, Object obj) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        Object w = zi3Var.w(i);
        if (w == null) {
            if (j >= (m.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    u1rVar3 = BufferedChannelKt.l;
                    return u1rVar3;
                } else if (zi3Var.r(i, w, obj)) {
                    X();
                    u1rVar2 = BufferedChannelKt.k;
                    return u1rVar2;
                }
            }
        } else if (w == BufferedChannelKt.BUFFERED) {
            u1rVar = BufferedChannelKt.g;
            if (zi3Var.r(i, w, u1rVar)) {
                X();
                return zi3Var.y(i);
            }
        }
        return F1(zi3Var, i, j, obj);
    }

    private final long F0(zi3<E> zi3Var) {
        u1r u1rVar;
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (zi3Var.e * BufferedChannelKt.SEGMENT_SIZE) + i;
                    if (j >= l0()) {
                        while (true) {
                            Object w = zi3Var.w(i);
                            if (w != null) {
                                u1rVar = BufferedChannelKt.c;
                                if (w != u1rVar) {
                                    if (w == BufferedChannelKt.BUFFERED) {
                                        return j;
                                    }
                                }
                            }
                            if (zi3Var.r(i, w, BufferedChannelKt.z())) {
                                zi3Var.p();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                } else {
                    zi3Var = (zi3) zi3Var.g();
                }
            }
        } while (zi3Var != null);
        return -1L;
    }

    private final Object F1(zi3<E> zi3Var, int i, long j, Object obj) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        u1r u1rVar6;
        u1r u1rVar7;
        u1r u1rVar8;
        u1r u1rVar9;
        u1r u1rVar10;
        u1r u1rVar11;
        u1r u1rVar12;
        u1r u1rVar13;
        u1r u1rVar14;
        u1r u1rVar15;
        u1r u1rVar16;
        while (true) {
            Object w = zi3Var.w(i);
            if (w != null) {
                u1rVar5 = BufferedChannelKt.c;
                if (w != u1rVar5) {
                    if (w == BufferedChannelKt.BUFFERED) {
                        u1rVar6 = BufferedChannelKt.g;
                        if (zi3Var.r(i, w, u1rVar6)) {
                            X();
                            return zi3Var.y(i);
                        }
                    } else {
                        u1rVar7 = BufferedChannelKt.h;
                        if (w == u1rVar7) {
                            u1rVar8 = BufferedChannelKt.m;
                            return u1rVar8;
                        }
                        u1rVar9 = BufferedChannelKt.f;
                        if (w == u1rVar9) {
                            u1rVar10 = BufferedChannelKt.m;
                            return u1rVar10;
                        } else if (w == BufferedChannelKt.z()) {
                            X();
                            u1rVar11 = BufferedChannelKt.m;
                            return u1rVar11;
                        } else {
                            u1rVar12 = BufferedChannelKt.e;
                            if (w != u1rVar12) {
                                u1rVar13 = BufferedChannelKt.d;
                                if (zi3Var.r(i, w, u1rVar13)) {
                                    boolean z = w instanceof rww;
                                    if (z) {
                                        w = ((rww) w).f27656a;
                                    }
                                    if (A1(w, zi3Var, i)) {
                                        u1rVar16 = BufferedChannelKt.g;
                                        zi3Var.A(i, u1rVar16);
                                        X();
                                        return zi3Var.y(i);
                                    }
                                    u1rVar14 = BufferedChannelKt.h;
                                    zi3Var.A(i, u1rVar14);
                                    zi3Var.x(i, false);
                                    if (z) {
                                        X();
                                    }
                                    u1rVar15 = BufferedChannelKt.m;
                                    return u1rVar15;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (j < (m.get(this) & 1152921504606846975L)) {
                u1rVar = BufferedChannelKt.f;
                if (zi3Var.r(i, w, u1rVar)) {
                    X();
                    u1rVar2 = BufferedChannelKt.m;
                    return u1rVar2;
                }
            } else if (obj == null) {
                u1rVar3 = BufferedChannelKt.l;
                return u1rVar3;
            } else if (zi3Var.r(i, w, obj)) {
                X();
                u1rVar4 = BufferedChannelKt.k;
                return u1rVar4;
            }
        }
    }

    private final void G0() {
        long j;
        long w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) == 0) {
                w = BufferedChannelKt.w(1152921504606846975L & j, 1);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G1(zi3<E> zi3Var, int i, E e, long j, Object obj, boolean z) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        zi3Var.B(i, e);
        if (z) {
            return H1(zi3Var, i, e, j, obj, z);
        }
        Object w = zi3Var.w(i);
        if (w == null) {
            if (L(j)) {
                if (zi3Var.r(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (zi3Var.r(i, null, obj)) {
                    return 2;
                }
            }
        } else if (w instanceof qww) {
            zi3Var.s(i);
            if (z1(w, e)) {
                u1rVar3 = BufferedChannelKt.g;
                zi3Var.A(i, u1rVar3);
                return 0;
            }
            u1rVar = BufferedChannelKt.i;
            Object t2 = zi3Var.t(i, u1rVar);
            u1rVar2 = BufferedChannelKt.i;
            if (t2 != u1rVar2) {
                zi3Var.x(i, true);
            }
            return 5;
        }
        return H1(zi3Var, i, e, j, obj, z);
    }

    private final void H0() {
        long j;
        long w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        do {
            j = atomicLongFieldUpdater.get(this);
            w = BufferedChannelKt.w(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w));
    }

    private final int H1(zi3<E> zi3Var, int i, E e, long j, Object obj, boolean z) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        u1r u1rVar6;
        u1r u1rVar7;
        while (true) {
            Object w = zi3Var.w(i);
            if (w != null) {
                u1rVar2 = BufferedChannelKt.c;
                if (w != u1rVar2) {
                    u1rVar3 = BufferedChannelKt.i;
                    if (w == u1rVar3) {
                        zi3Var.s(i);
                        return 5;
                    }
                    u1rVar4 = BufferedChannelKt.f;
                    if (w == u1rVar4) {
                        zi3Var.s(i);
                        return 5;
                    } else if (w == BufferedChannelKt.z()) {
                        zi3Var.s(i);
                        V();
                        return 4;
                    } else {
                        String str = dv6.DEBUG_PROPERTY_NAME;
                        zi3Var.s(i);
                        if (w instanceof rww) {
                            w = ((rww) w).f27656a;
                        }
                        if (z1(w, e)) {
                            u1rVar7 = BufferedChannelKt.g;
                            zi3Var.A(i, u1rVar7);
                            return 0;
                        }
                        u1rVar5 = BufferedChannelKt.i;
                        Object t2 = zi3Var.t(i, u1rVar5);
                        u1rVar6 = BufferedChannelKt.i;
                        if (t2 != u1rVar6) {
                            zi3Var.x(i, true);
                        }
                        return 5;
                    }
                } else if (zi3Var.r(i, w, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else if (!L(j) || z) {
                if (z) {
                    u1rVar = BufferedChannelKt.h;
                    if (zi3Var.r(i, null, u1rVar)) {
                        zi3Var.x(i, false);
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (zi3Var.r(i, null, obj)) {
                        return 2;
                    }
                }
            } else if (zi3Var.r(i, null, BufferedChannelKt.BUFFERED)) {
                return 1;
            }
        }
    }

    private final void I0() {
        long j;
        long w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                w = BufferedChannelKt.w(j & 1152921504606846975L, 2);
            } else if (i == 1) {
                w = BufferedChannelKt.w(j & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, w));
    }

    private final void I1(long j) {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = n;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
        } while (!n.compareAndSet(this, j2, j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void J0(long r6, tb.zi3<E> r8) {
        /*
            r5 = this;
        L_0x0000:
            long r0 = r8.e
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0011
            tb.te4 r0 = r8.e()
            tb.zi3 r0 = (tb.zi3) r0
            if (r0 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r8 = r0
            goto L_0x0000
        L_0x0011:
            boolean r6 = r8.h()
            if (r6 == 0) goto L_0x0022
            tb.te4 r6 = r8.e()
            tb.zi3 r6 = (tb.zi3) r6
            if (r6 != 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r8 = r6
            goto L_0x0011
        L_0x0022:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.channels.BufferedChannel.s
        L_0x0024:
            java.lang.Object r7 = r6.get(r5)
            tb.v8p r7 = (tb.v8p) r7
            long r0 = r7.e
            long r2 = r8.e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0033
            goto L_0x0049
        L_0x0033:
            boolean r0 = r8.q()
            if (r0 != 0) goto L_0x003a
            goto L_0x0011
        L_0x003a:
            boolean r0 = tb.h30.a(r6, r5, r7, r8)
            if (r0 == 0) goto L_0x004a
            boolean r6 = r7.m()
            if (r6 == 0) goto L_0x0049
            r7.k()
        L_0x0049:
            return
        L_0x004a:
            boolean r7 = r8.m()
            if (r7 == 0) goto L_0x0024
            r8.k()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.J0(long, tb.zi3):void");
    }

    private final void J1(long j) {
        long j2;
        long w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            long j3 = 1152921504606846975L & j2;
            if (j3 < j) {
                w = BufferedChannelKt.w(j3, (int) (j2 >> 60));
            } else {
                return;
            }
        } while (!m.compareAndSet(this, j2, w));
    }

    private final boolean L(long j) {
        if (j < c0() || j < l0() + this.f15251a) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(q23<? super e<? extends E>> q23Var) {
        q23Var.resumeWith(Result.m1108constructorimpl(e.a(e.Companion.a(d0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(q23<? super E> q23Var) {
        q23Var.resumeWith(Result.m1108constructorimpl(kotlin.b.a(k0())));
    }

    private final void N0(k9p<?> k9pVar) {
        k9pVar.b(BufferedChannelKt.z());
    }

    private final void O0(E e, k9p<?> k9pVar) {
        g1a<E, xhv> g1aVar = this.b;
        if (g1aVar != null) {
            OnUndeliveredElementKt.b(g1aVar, e, k9pVar.getContext());
        }
        k9pVar.b(BufferedChannelKt.z());
    }

    private final void P(zi3<E> zi3Var, long j) {
        u1r u1rVar;
        Object a2 = g9f.a(null, 1, null);
        loop0: while (zi3Var != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((zi3Var.e * BufferedChannelKt.SEGMENT_SIZE) + i < j) {
                    break loop0;
                }
                while (true) {
                    Object w = zi3Var.w(i);
                    if (w != null) {
                        u1rVar = BufferedChannelKt.c;
                        if (w != u1rVar) {
                            if (w instanceof rww) {
                                if (zi3Var.r(i, w, BufferedChannelKt.z())) {
                                    a2 = g9f.b(a2, ((rww) w).f27656a);
                                    zi3Var.x(i, true);
                                    break;
                                }
                            } else if (!(w instanceof qww)) {
                                break;
                            } else if (zi3Var.r(i, w, BufferedChannelKt.z())) {
                                a2 = g9f.b(a2, w);
                                zi3Var.x(i, true);
                                break;
                            }
                        }
                    }
                    if (zi3Var.r(i, w, BufferedChannelKt.z())) {
                        zi3Var.p();
                        break;
                    }
                }
            }
            zi3Var = (zi3) zi3Var.g();
        }
        if (a2 == null) {
            return;
        }
        if (!(a2 instanceof ArrayList)) {
            m1((qww) a2);
            return;
        }
        ArrayList arrayList = (ArrayList) a2;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            m1((qww) arrayList.get(size));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object P0(E e, ar4<? super xhv> ar4Var) {
        Throwable d;
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        g1a<E, xhv> g1aVar = this.b;
        if (g1aVar == null || (d = OnUndeliveredElementKt.d(g1aVar, e, null, 2, null)) == null) {
            Throwable m0 = m0();
            if (dv6.c()) {
                m0 = rgq.i(m0, cVar);
            }
            cVar.resumeWith(Result.m1108constructorimpl(kotlin.b.a(m0)));
        } else {
            sm8.a(d, m0());
            if (dv6.c()) {
                d = rgq.i(d, cVar);
            }
            cVar.resumeWith(Result.m1108constructorimpl(kotlin.b.a(d)));
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(E e, q23<? super xhv> q23Var) {
        g1a<E, xhv> g1aVar = this.b;
        if (g1aVar != null) {
            OnUndeliveredElementKt.b(g1aVar, e, q23Var.getContext());
        }
        Throwable m0 = m0();
        if (dv6.c() && (q23Var instanceof vu4)) {
            m0 = rgq.i(m0, (vu4) q23Var);
        }
        q23Var.resumeWith(Result.m1108constructorimpl(kotlin.b.a(m0)));
    }

    private final zi3<E> R() {
        zi3 zi3Var = s.get(this);
        zi3 zi3Var2 = (zi3) q.get(this);
        if (zi3Var2.e > ((zi3) zi3Var).e) {
            zi3Var = zi3Var2;
        }
        zi3 zi3Var3 = (zi3) r.get(this);
        if (zi3Var3.e > ((zi3) zi3Var).e) {
            zi3Var = zi3Var3;
        }
        return (zi3) se4.a((te4) zi3Var);
    }

    private final void T(long j) {
        l1(U(j));
    }

    private final zi3<E> U(long j) {
        zi3<E> R = R();
        if (z0()) {
            long F0 = F0(R);
            if (F0 != -1) {
                W(F0);
            }
        }
        P(R, j);
        return R;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(qww qwwVar, zi3<E> zi3Var, int i) {
        qwwVar.c(zi3Var, i);
    }

    private final void V() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(qww qwwVar, zi3<E> zi3Var, int i) {
        qwwVar.c(zi3Var, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return obj2;
        }
        throw k0();
    }

    private final void X() {
        if (!C0()) {
            zi3<E> zi3Var = (zi3) s.get(this);
            while (true) {
                long andIncrement = o.getAndIncrement(this);
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j = andIncrement / i;
                if (n0() <= andIncrement) {
                    if (zi3Var.e < j && zi3Var.e() != 0) {
                        J0(j, zi3Var);
                    }
                    q0(this, 0L, 1, null);
                    return;
                }
                if (zi3Var.e != j) {
                    zi3<E> Y = Y(j, zi3Var, andIncrement);
                    if (Y == null) {
                        continue;
                    } else {
                        zi3Var = Y;
                    }
                }
                if (C1(zi3Var, (int) (andIncrement % i), andIncrement)) {
                    q0(this, 0L, 1, null);
                    return;
                }
                q0(this, 0L, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X0(Object obj, Object obj2) {
        if (obj2 == BufferedChannelKt.z()) {
            obj2 = e.Companion.a(d0());
        } else {
            e.Companion.b(obj2);
        }
        return e.a(obj2);
    }

    private final zi3<E> Y(long j, zi3<E> zi3Var, long j2) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s;
        u1a u1aVar = (u1a) BufferedChannelKt.y();
        loop0: while (true) {
            b2 = se4.b(zi3Var, j, u1aVar);
            if (x8p.b(b2)) {
                break;
            }
            v8p a2 = x8p.a(b2);
            while (true) {
                v8p v8pVar = (v8p) atomicReferenceFieldUpdater.get(this);
                if (v8pVar.e >= a2.e) {
                    break loop0;
                } else if (!a2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater, this, v8pVar, a2)) {
                    if (v8pVar.m()) {
                        v8pVar.k();
                    }
                } else if (a2.m()) {
                    a2.k();
                }
            }
        }
        if (x8p.b(b2)) {
            V();
            J0(j, zi3Var);
            q0(this, 0L, 1, null);
            return null;
        }
        zi3<E> zi3Var2 = (zi3) x8p.a(b2);
        long j3 = zi3Var2.e;
        if (j3 > j) {
            long j4 = j3 * BufferedChannelKt.SEGMENT_SIZE;
            if (o.compareAndSet(this, j2 + 1, j4)) {
                p0(j4 - j2);
                return null;
            }
            q0(this, 0L, 1, null);
            return null;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        return zi3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return obj2;
        }
        if (d0() == null) {
            return null;
        }
        throw k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zi3<E> Z(long j, zi3<E> zi3Var) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
        u1a u1aVar = (u1a) BufferedChannelKt.y();
        loop0: while (true) {
            b2 = se4.b(zi3Var, j, u1aVar);
            if (x8p.b(b2)) {
                break;
            }
            v8p a2 = x8p.a(b2);
            while (true) {
                v8p v8pVar = (v8p) atomicReferenceFieldUpdater.get(this);
                if (v8pVar.e >= a2.e) {
                    break loop0;
                } else if (!a2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater, this, v8pVar, a2)) {
                    if (v8pVar.m()) {
                        v8pVar.k();
                    }
                } else if (a2.m()) {
                    a2.k();
                }
            }
        }
        if (x8p.b(b2)) {
            V();
            if (zi3Var.e * BufferedChannelKt.SEGMENT_SIZE >= n0()) {
                return null;
            }
            zi3Var.b();
            return null;
        }
        zi3<E> zi3Var2 = (zi3) x8p.a(b2);
        boolean C0 = C0();
        long j2 = zi3Var2.e;
        if (!C0 && j <= c0() / BufferedChannelKt.SEGMENT_SIZE) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s;
            while (true) {
                v8p v8pVar2 = (v8p) atomicReferenceFieldUpdater2.get(this);
                if (v8pVar2.e >= j2 || !zi3Var2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater2, this, v8pVar2, zi3Var2)) {
                    if (v8pVar2.m()) {
                        v8pVar2.k();
                    }
                } else if (zi3Var2.m()) {
                    zi3Var2.k();
                }
            }
        }
        if (j2 > j) {
            long j3 = j2 * BufferedChannelKt.SEGMENT_SIZE;
            I1(j3);
            if (j3 >= n0()) {
                return null;
            }
            zi3Var2.b();
            return null;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        return zi3Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z0(Object obj, Object obj2) {
        if (obj2 != BufferedChannelKt.z()) {
            return this;
        }
        throw m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zi3<E> a0(long j, zi3<E> zi3Var) {
        Object b2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q;
        u1a u1aVar = (u1a) BufferedChannelKt.y();
        loop0: while (true) {
            b2 = se4.b(zi3Var, j, u1aVar);
            if (x8p.b(b2)) {
                break;
            }
            v8p a2 = x8p.a(b2);
            while (true) {
                v8p v8pVar = (v8p) atomicReferenceFieldUpdater.get(this);
                if (v8pVar.e >= a2.e) {
                    break loop0;
                } else if (!a2.q()) {
                    break;
                } else if (h30.a(atomicReferenceFieldUpdater, this, v8pVar, a2)) {
                    if (v8pVar.m()) {
                        v8pVar.k();
                    }
                } else if (a2.m()) {
                    a2.k();
                }
            }
        }
        if (x8p.b(b2)) {
            V();
            if (zi3Var.e * BufferedChannelKt.SEGMENT_SIZE >= l0()) {
                return null;
            }
            zi3Var.b();
            return null;
        }
        zi3<E> zi3Var2 = (zi3) x8p.a(b2);
        long j2 = zi3Var2.e;
        if (j2 > j) {
            long j3 = j2 * BufferedChannelKt.SEGMENT_SIZE;
            J1(j3);
            if (j3 >= l0()) {
                return null;
            }
            zi3Var2.b();
            return null;
        }
        String str = dv6.DEBUG_PROPERTY_NAME;
        return zi3Var2;
    }

    private final Object b0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, ? extends Object> g1aVar, Object obj) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!h30.a(atomicReferenceFieldUpdater, obj, obj2, g1aVar.invoke(obj2)));
        return obj2;
    }

    public static /* synthetic */ <E> Object b1(BufferedChannel<E> bufferedChannel, ar4<? super E> ar4Var) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        zi3<E> zi3Var = (zi3) r.get(bufferedChannel);
        while (!bufferedChannel.u0()) {
            long andIncrement = n.getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / i;
            int i2 = (int) (andIncrement % i);
            if (zi3Var.e != j) {
                zi3<E> Z = bufferedChannel.Z(j, zi3Var);
                if (Z == null) {
                    continue;
                } else {
                    zi3Var = Z;
                }
            }
            Object E1 = bufferedChannel.E1(zi3Var, i2, andIncrement, null);
            u1rVar = BufferedChannelKt.k;
            if (E1 != u1rVar) {
                u1rVar2 = BufferedChannelKt.m;
                if (E1 != u1rVar2) {
                    u1rVar3 = BufferedChannelKt.l;
                    if (E1 == u1rVar3) {
                        return bufferedChannel.h1(zi3Var, i2, andIncrement, ar4Var);
                    }
                    zi3Var.b();
                    return E1;
                } else if (andIncrement < bufferedChannel.n0()) {
                    zi3Var.b();
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw rgq.j(bufferedChannel.k0());
    }

    private final long c0() {
        return o.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object c1(kotlinx.coroutines.channels.BufferedChannel<E> r13, tb.ar4<? super kotlinx.coroutines.channels.e<? extends E>> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.label = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1
            r0.<init>(r13, r14)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r14 = r6.result
            java.lang.Object r0 = tb.dkf.d()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x003a
            if (r1 != r2) goto L_0x0032
            kotlin.b.b(r14)
            kotlinx.coroutines.channels.e r14 = (kotlinx.coroutines.channels.e) r14
            java.lang.Object r13 = r14.j()
            goto L_0x00b1
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            kotlin.b.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = l()
            java.lang.Object r14 = r14.get(r13)
            tb.zi3 r14 = (tb.zi3) r14
        L_0x0047:
            boolean r1 = r13.u0()
            if (r1 == 0) goto L_0x0058
            kotlinx.coroutines.channels.e$b r14 = kotlinx.coroutines.channels.e.Companion
            java.lang.Throwable r13 = r13.d0()
            java.lang.Object r13 = r14.a(r13)
            goto L_0x00b1
        L_0x0058:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p()
            long r4 = r1.getAndIncrement(r13)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.e
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0076
            tb.zi3 r1 = e(r13, r9, r14)
            if (r1 != 0) goto L_0x0075
            goto L_0x0047
        L_0x0075:
            r14 = r1
        L_0x0076:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = J(r7, r8, r9, r10, r12)
            tb.u1r r7 = kotlinx.coroutines.channels.BufferedChannelKt.r()
            if (r1 == r7) goto L_0x00b2
            tb.u1r r7 = kotlinx.coroutines.channels.BufferedChannelKt.h()
            if (r1 != r7) goto L_0x0097
            long r7 = r13.n0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0047
            r14.b()
            goto L_0x0047
        L_0x0097:
            tb.u1r r7 = kotlinx.coroutines.channels.BufferedChannelKt.s()
            if (r1 != r7) goto L_0x00a8
            r6.label = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.d1(r2, r3, r4, r6)
            if (r13 != r0) goto L_0x00b1
            return r0
        L_0x00a8:
            r14.b()
            kotlinx.coroutines.channels.e$b r13 = kotlinx.coroutines.channels.e.Companion
            r13.b(r1)
            r13 = r1
        L_0x00b1:
            return r13
        L_0x00b2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.c1(kotlinx.coroutines.channels.BufferedChannel, tb.ar4):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d1(tb.zi3<E> r11, int r12, long r13, tb.ar4<? super kotlinx.coroutines.channels.e<? extends E>> r15) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.d1(tb.zi3, int, long, tb.ar4):java.lang.Object");
    }

    private final <R> R e1(Object obj, g1a<? super E, ? extends R> g1aVar, w1a<? super zi3<E>, ? super Integer, ? super Long, ? extends R> w1aVar, d1a<? extends R> d1aVar, w1a<? super zi3<E>, ? super Integer, ? super Long, ? extends R> w1aVar2) {
        zi3 zi3Var;
        u1r u1rVar;
        qww qwwVar;
        u1r u1rVar2;
        u1r u1rVar3;
        zi3 zi3Var2 = (zi3) r.get(this);
        while (!u0()) {
            long andIncrement = n.getAndIncrement(this);
            long j = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (zi3Var2.e != j2) {
                zi3 Z = Z(j2, zi3Var2);
                if (Z == null) {
                    continue;
                } else {
                    zi3Var = Z;
                }
            } else {
                zi3Var = zi3Var2;
            }
            Object obj2 = (Object) E1(zi3Var, i, andIncrement, obj);
            u1rVar = BufferedChannelKt.k;
            if (obj2 == u1rVar) {
                if (obj instanceof qww) {
                    qwwVar = (qww) obj;
                } else {
                    qwwVar = null;
                }
                if (qwwVar != null) {
                    U0(qwwVar, zi3Var, i);
                }
                return (R) w1aVar.invoke(zi3Var, Integer.valueOf(i), Long.valueOf(andIncrement));
            }
            u1rVar2 = BufferedChannelKt.m;
            if (obj2 == u1rVar2) {
                if (andIncrement < n0()) {
                    zi3Var.b();
                }
                zi3Var2 = zi3Var;
            } else {
                u1rVar3 = BufferedChannelKt.l;
                if (obj2 == u1rVar3) {
                    return (R) w1aVar2.invoke(zi3Var, Integer.valueOf(i), Long.valueOf(andIncrement));
                }
                zi3Var.b();
                return (R) g1aVar.invoke(obj2);
            }
        }
        return (R) d1aVar.invoke();
    }

    public static /* synthetic */ Object f1(BufferedChannel bufferedChannel, Object obj, g1a g1aVar, w1a w1aVar, d1a d1aVar, w1a w1aVar2, int i, Object obj2) {
        u1r u1rVar;
        qww qwwVar;
        u1r u1rVar2;
        u1r u1rVar3;
        if (obj2 == null) {
            if ((i & 16) != 0) {
                w1aVar2 = BufferedChannel$receiveImpl$1.INSTANCE;
            }
            zi3 zi3Var = (zi3) r.get(bufferedChannel);
            while (!bufferedChannel.u0()) {
                long andIncrement = n.getAndIncrement(bufferedChannel);
                long j = BufferedChannelKt.SEGMENT_SIZE;
                long j2 = andIncrement / j;
                int i2 = (int) (andIncrement % j);
                if (zi3Var.e != j2) {
                    zi3 Z = bufferedChannel.Z(j2, zi3Var);
                    if (Z == null) {
                        continue;
                    } else {
                        zi3Var = Z;
                    }
                }
                Object E1 = bufferedChannel.E1(zi3Var, i2, andIncrement, obj);
                u1rVar = BufferedChannelKt.k;
                if (E1 == u1rVar) {
                    if (obj instanceof qww) {
                        qwwVar = (qww) obj;
                    } else {
                        qwwVar = null;
                    }
                    if (qwwVar != null) {
                        bufferedChannel.U0(qwwVar, zi3Var, i2);
                    }
                    return w1aVar.invoke(zi3Var, Integer.valueOf(i2), Long.valueOf(andIncrement));
                }
                u1rVar2 = BufferedChannelKt.m;
                if (E1 != u1rVar2) {
                    u1rVar3 = BufferedChannelKt.l;
                    if (E1 == u1rVar3) {
                        return w1aVar2.invoke(zi3Var, Integer.valueOf(i2), Long.valueOf(andIncrement));
                    }
                    zi3Var.b();
                    return g1aVar.invoke(E1);
                } else if (andIncrement < bufferedChannel.n0()) {
                    zi3Var.b();
                }
            }
            return d1aVar.invoke();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    private final void g1(zi3<E> zi3Var, int i, long j, qww qwwVar, g1a<? super E, xhv> g1aVar, d1a<xhv> d1aVar) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        Object obj = (Object) E1(zi3Var, i, j, qwwVar);
        u1rVar = BufferedChannelKt.k;
        if (obj == u1rVar) {
            U0(qwwVar, zi3Var, i);
            return;
        }
        u1rVar2 = BufferedChannelKt.m;
        if (obj == u1rVar2) {
            if (j < n0()) {
                zi3Var.b();
            }
            zi3 zi3Var2 = (zi3) r.get(this);
            while (!u0()) {
                long andIncrement = n.getAndIncrement(this);
                long j2 = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = andIncrement / j2;
                int i2 = (int) (andIncrement % j2);
                if (zi3Var2.e != j3) {
                    zi3 Z = Z(j3, zi3Var2);
                    if (Z == null) {
                        continue;
                    } else {
                        zi3Var2 = Z;
                    }
                }
                Object obj2 = (Object) E1(zi3Var2, i2, andIncrement, qwwVar);
                u1rVar3 = BufferedChannelKt.k;
                if (obj2 == u1rVar3) {
                    if (!(qwwVar instanceof qww)) {
                        qwwVar = null;
                    }
                    if (qwwVar != null) {
                        U0(qwwVar, zi3Var2, i2);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    return;
                }
                u1rVar4 = BufferedChannelKt.m;
                if (obj2 != u1rVar4) {
                    u1rVar5 = BufferedChannelKt.l;
                    if (obj2 != u1rVar5) {
                        zi3Var2.b();
                        g1aVar.invoke(obj2);
                        return;
                    }
                    throw new IllegalStateException("unexpected");
                } else if (andIncrement < n0()) {
                    zi3Var2.b();
                }
            }
            d1aVar.invoke();
            return;
        }
        zi3Var.b();
        g1aVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h1(zi3<E> zi3Var, int i, long j, ar4<? super E> ar4Var) {
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        c b2 = s23.b(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var));
        try {
            Object E1 = E1(zi3Var, i, j, b2);
            u1rVar = BufferedChannelKt.k;
            if (E1 == u1rVar) {
                U0(b2, zi3Var, i);
            } else {
                u1rVar2 = BufferedChannelKt.m;
                g1a<Throwable, xhv> g1aVar = null;
                if (E1 == u1rVar2) {
                    if (j < n0()) {
                        zi3Var.b();
                    }
                    zi3 zi3Var2 = (zi3) r.get(this);
                    while (true) {
                        if (u0()) {
                            M0(b2);
                            break;
                        }
                        long andIncrement = n.getAndIncrement(this);
                        long j2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j3 = andIncrement / j2;
                        int i2 = (int) (andIncrement % j2);
                        if (zi3Var2.e != j3) {
                            zi3 Z = Z(j3, zi3Var2);
                            if (Z != null) {
                                zi3Var2 = Z;
                            }
                        }
                        E1 = E1(zi3Var2, i2, andIncrement, b2);
                        u1rVar3 = BufferedChannelKt.k;
                        if (E1 == u1rVar3) {
                            U0(b2, zi3Var2, i2);
                            break;
                        }
                        u1rVar4 = BufferedChannelKt.m;
                        if (E1 != u1rVar4) {
                            u1rVar5 = BufferedChannelKt.l;
                            if (E1 != u1rVar5) {
                                zi3Var2.b();
                                g1a<E, xhv> g1aVar2 = this.b;
                                if (g1aVar2 != null) {
                                    g1aVar = OnUndeliveredElementKt.a(g1aVar2, E1, b2.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else if (andIncrement < n0()) {
                            zi3Var2.b();
                        }
                    }
                } else {
                    zi3Var.b();
                    g1a<E, xhv> g1aVar3 = this.b;
                    if (g1aVar3 != null) {
                        g1aVar = OnUndeliveredElementKt.a(g1aVar3, E1, b2.getContext());
                    }
                }
                b2.l(E1, g1aVar);
            }
            Object A = b2.A();
            if (A == dkf.d()) {
                jv6.c(ar4Var);
            }
            return A;
        } catch (Throwable th) {
            b2.S();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1(k9p<?> k9pVar, Object obj) {
        u1r u1rVar;
        qww qwwVar;
        u1r u1rVar2;
        u1r u1rVar3;
        zi3 zi3Var = (zi3) r.get(this);
        while (!u0()) {
            long andIncrement = n.getAndIncrement(this);
            long j = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / j;
            int i = (int) (andIncrement % j);
            if (zi3Var.e != j2) {
                zi3 Z = Z(j2, zi3Var);
                if (Z == null) {
                    continue;
                } else {
                    zi3Var = Z;
                }
            }
            Object E1 = E1(zi3Var, i, andIncrement, k9pVar);
            u1rVar = BufferedChannelKt.k;
            if (E1 == u1rVar) {
                if (k9pVar instanceof qww) {
                    qwwVar = (qww) k9pVar;
                } else {
                    qwwVar = null;
                }
                if (qwwVar != null) {
                    U0(qwwVar, zi3Var, i);
                    return;
                }
                return;
            }
            u1rVar2 = BufferedChannelKt.m;
            if (E1 != u1rVar2) {
                u1rVar3 = BufferedChannelKt.l;
                if (E1 != u1rVar3) {
                    zi3Var.b();
                    k9pVar.b(E1);
                    return;
                }
                throw new IllegalStateException("unexpected");
            } else if (andIncrement < n0()) {
                zi3Var.b();
            }
        }
        N0(k9pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable k0() {
        Throwable d0 = d0();
        if (d0 == null) {
            return new ClosedReceiveChannelException(bj3.DEFAULT_CLOSE_MESSAGE);
        }
        return d0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r13 = (tb.zi3) r13.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l1(tb.zi3<E> r13) {
        /*
            r12 = this;
            tb.g1a<E, tb.xhv> r0 = r12.b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = tb.g9f.a(r1, r2, r1)
        L_0x0008:
            int r4 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b4
            long r6 = r13.e
            int r8 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0017:
            java.lang.Object r8 = r13.w(r4)
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.f()
            if (r8 == r9) goto L_0x00bc
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED
            if (r8 != r9) goto L_0x0049
            long r9 = r12.l0()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0041
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.c(r0, r5, r1)
        L_0x0041:
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x0049:
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.k()
            if (r8 == r9) goto L_0x00a3
            if (r8 != 0) goto L_0x0052
            goto L_0x00a3
        L_0x0052:
            boolean r9 = r8 instanceof tb.qww
            if (r9 != 0) goto L_0x006f
            boolean r9 = r8 instanceof tb.rww
            if (r9 == 0) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r8 == r9) goto L_0x00bc
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.q()
            if (r8 != r9) goto L_0x0068
            goto L_0x00bc
        L_0x0068:
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.p()
            if (r8 == r9) goto L_0x0017
            goto L_0x00b0
        L_0x006f:
            long r9 = r12.l0()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00bc
            boolean r9 = r8 instanceof tb.rww
            if (r9 == 0) goto L_0x0081
            r9 = r8
            tb.rww r9 = (tb.rww) r9
            tb.qww r9 = r9.f27656a
            goto L_0x0084
        L_0x0081:
            r9 = r8
            tb.qww r9 = (tb.qww) r9
        L_0x0084:
            tb.u1r r10 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0098
            java.lang.Object r5 = r13.v(r4)
            kotlinx.coroutines.internal.UndeliveredElementException r1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.c(r0, r5, r1)
        L_0x0098:
            java.lang.Object r3 = tb.g9f.b(r3, r9)
            r13.s(r4)
            r13.p()
            goto L_0x00b0
        L_0x00a3:
            tb.u1r r9 = kotlinx.coroutines.channels.BufferedChannelKt.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            r13.p()
        L_0x00b0:
            int r4 = r4 + (-1)
            goto L_0x000b
        L_0x00b4:
            tb.te4 r13 = r13.g()
            tb.zi3 r13 = (tb.zi3) r13
            if (r13 != 0) goto L_0x0008
        L_0x00bc:
            if (r3 == 0) goto L_0x00dd
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x00c8
            tb.qww r3 = (tb.qww) r3
            r12.n1(r3)
            goto L_0x00dd
        L_0x00c8:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        L_0x00cf:
            if (r5 >= r13) goto L_0x00dd
            java.lang.Object r0 = r3.get(r13)
            tb.qww r0 = (tb.qww) r0
            r12.n1(r0)
            int r13 = r13 + (-1)
            goto L_0x00cf
        L_0x00dd:
            if (r1 != 0) goto L_0x00e0
            return
        L_0x00e0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.l1(tb.zi3):void");
    }

    private final void m1(qww qwwVar) {
        o1(qwwVar, true);
    }

    private final void n1(qww qwwVar) {
        o1(qwwVar, false);
    }

    private final void o1(qww qwwVar, boolean z) {
        Throwable th;
        if (qwwVar instanceof b) {
            ((b) qwwVar).a().resumeWith(Result.m1108constructorimpl(Boolean.FALSE));
        } else if (qwwVar instanceof q23) {
            ar4 ar4Var = (ar4) qwwVar;
            if (z) {
                th = k0();
            } else {
                th = m0();
            }
            ar4Var.resumeWith(Result.m1108constructorimpl(kotlin.b.a(th)));
        } else if (qwwVar instanceof qln) {
            ((qln) qwwVar).f26816a.resumeWith(Result.m1108constructorimpl(e.a(e.Companion.a(d0()))));
        } else if (qwwVar instanceof a) {
            ((a) qwwVar).j();
        } else if (qwwVar instanceof k9p) {
            ((k9p) qwwVar).e(this, BufferedChannelKt.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + qwwVar).toString());
        }
    }

    private final void p0(long j) {
        if ((p.addAndGet(this, j) & 4611686018427387904L) != 0) {
            do {
            } while ((p.get(this) & 4611686018427387904L) != 0);
        }
    }

    public static /* synthetic */ <E> Object p1(BufferedChannel<E> bufferedChannel, E e, ar4<? super xhv> ar4Var) {
        zi3<E> zi3Var = (zi3) q.get(bufferedChannel);
        while (true) {
            long andIncrement = m.getAndIncrement(bufferedChannel);
            long j = 1152921504606846975L & andIncrement;
            boolean y0 = bufferedChannel.y0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (zi3Var.e != j2) {
                zi3<E> a0 = bufferedChannel.a0(j2, zi3Var);
                if (a0 != null) {
                    zi3Var = a0;
                } else if (y0) {
                    Object P0 = bufferedChannel.P0(e, ar4Var);
                    if (P0 == dkf.d()) {
                        return P0;
                    }
                }
            }
            int G1 = bufferedChannel.G1(zi3Var, i2, e, j, null, y0);
            if (G1 == 0) {
                zi3Var.b();
                break;
            } else if (G1 == 1) {
                break;
            } else if (G1 != 2) {
                if (G1 == 3) {
                    Object v1 = bufferedChannel.v1(zi3Var, i2, e, j, ar4Var);
                    if (v1 == dkf.d()) {
                        return v1;
                    }
                } else if (G1 == 4) {
                    if (j < bufferedChannel.l0()) {
                        zi3Var.b();
                    }
                    Object P02 = bufferedChannel.P0(e, ar4Var);
                    if (P02 == dkf.d()) {
                        return P02;
                    }
                } else if (G1 == 5) {
                    zi3Var.b();
                }
            } else if (y0) {
                zi3Var.p();
                Object P03 = bufferedChannel.P0(e, ar4Var);
                if (P03 == dkf.d()) {
                    return P03;
                }
            } else {
                String str = dv6.DEBUG_PROPERTY_NAME;
            }
        }
        return xhv.INSTANCE;
    }

    public static /* synthetic */ void q0(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = 1;
            }
            bufferedChannel.p0(j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void r0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!h30.a(atomicReferenceFieldUpdater, this, obj, obj == null ? BufferedChannelKt.o : BufferedChannelKt.p));
        if (obj != null) {
            kqu.e(obj, 1);
            ((g1a) obj).invoke(d0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
        r9.resumeWith(kotlin.Result.m1108constructorimpl(tb.gk2.a(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <E> java.lang.Object r1(kotlinx.coroutines.channels.BufferedChannel<E> r18, E r19, tb.ar4<? super java.lang.Boolean> r20) {
        /*
            r8 = r18
            kotlinx.coroutines.c r9 = new kotlinx.coroutines.c
            tb.ar4 r0 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.c(r20)
            r10 = 1
            r9.<init>(r0, r10)
            r9.E()
            tb.g1a<E, tb.xhv> r0 = r8.b
            if (r0 != 0) goto L_0x00c4
            kotlinx.coroutines.channels.BufferedChannel$b r11 = new kotlinx.coroutines.channels.BufferedChannel$b
            r11.<init>(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = q()
            java.lang.Object r0 = r0.get(r8)
            tb.zi3 r0 = (tb.zi3) r0
        L_0x0022:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = r()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r12 = r1 & r3
            boolean r14 = t(r8, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r1
            long r3 = r12 / r1
            long r1 = r12 % r1
            int r15 = (int) r1
            long r1 = r0.e
            r16 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x005c
            tb.zi3 r1 = g(r8, r3, r0)
            if (r1 != 0) goto L_0x005a
            if (r14 == 0) goto L_0x0022
        L_0x004d:
            java.lang.Boolean r0 = tb.gk2.a(r16)
            java.lang.Object r0 = kotlin.Result.m1108constructorimpl(r0)
            r9.resumeWith(r0)
            goto L_0x00b6
        L_0x005a:
            r7 = r1
            goto L_0x005d
        L_0x005c:
            r7 = r0
        L_0x005d:
            r0 = r18
            r1 = r7
            r2 = r15
            r3 = r19
            r4 = r12
            r6 = r11
            r17 = r7
            r7 = r14
            int r0 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            if (r0 == r10) goto L_0x00a4
            r1 = 2
            if (r0 == r1) goto L_0x0098
            r1 = 3
            if (r0 == r1) goto L_0x008f
            r1 = 4
            if (r0 == r1) goto L_0x0083
            r1 = 5
            if (r0 == r1) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            r17.b()
        L_0x0080:
            r0 = r17
            goto L_0x0022
        L_0x0083:
            long r0 = r18.l0()
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x004d
            r17.b()
            goto L_0x004d
        L_0x008f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L_0x0098:
            if (r14 == 0) goto L_0x009e
            r17.p()
            goto L_0x004d
        L_0x009e:
            r0 = r17
            A(r8, r11, r0, r15)
            goto L_0x00b6
        L_0x00a4:
            java.lang.Boolean r0 = tb.gk2.a(r10)
            java.lang.Object r0 = kotlin.Result.m1108constructorimpl(r0)
            r9.resumeWith(r0)
            goto L_0x00b6
        L_0x00b0:
            r0 = r17
            r0.b()
            goto L_0x00a4
        L_0x00b6:
            java.lang.Object r0 = r9.A()
            java.lang.Object r1 = tb.dkf.d()
            if (r0 != r1) goto L_0x00c3
            tb.jv6.c(r20)
        L_0x00c3:
            return r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.r1(kotlinx.coroutines.channels.BufferedChannel, java.lang.Object, tb.ar4):java.lang.Object");
    }

    private final boolean s0(zi3<E> zi3Var, int i, long j) {
        Object w;
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        u1r u1rVar4;
        u1r u1rVar5;
        u1r u1rVar6;
        u1r u1rVar7;
        do {
            w = zi3Var.w(i);
            if (w != null) {
                u1rVar2 = BufferedChannelKt.c;
                if (w != u1rVar2) {
                    if (w == BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    u1rVar3 = BufferedChannelKt.h;
                    if (w == u1rVar3 || w == BufferedChannelKt.z()) {
                        return false;
                    }
                    u1rVar4 = BufferedChannelKt.g;
                    if (w == u1rVar4) {
                        return false;
                    }
                    u1rVar5 = BufferedChannelKt.f;
                    if (w == u1rVar5) {
                        return false;
                    }
                    u1rVar6 = BufferedChannelKt.e;
                    if (w == u1rVar6) {
                        return true;
                    }
                    u1rVar7 = BufferedChannelKt.d;
                    if (w != u1rVar7 && j == l0()) {
                        return true;
                    }
                    return false;
                }
            }
            u1rVar = BufferedChannelKt.f;
        } while (!zi3Var.r(i, w, u1rVar));
        X();
        return false;
    }

    private final boolean t0(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            U(j & 1152921504606846975L);
            if (z && o0()) {
                return false;
            }
        } else if (i == 3) {
            T(j & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    public static /* synthetic */ Object t1(BufferedChannel bufferedChannel, Object obj, Object obj2, d1a d1aVar, u1a u1aVar, d1a d1aVar2, y1a y1aVar, int i, Object obj3) {
        BufferedChannel$sendImpl$1 bufferedChannel$sendImpl$1;
        zi3 zi3Var;
        qww qwwVar;
        if (obj3 == null) {
            if ((i & 32) != 0) {
                bufferedChannel$sendImpl$1 = BufferedChannel$sendImpl$1.INSTANCE;
            } else {
                bufferedChannel$sendImpl$1 = y1aVar;
            }
            zi3 zi3Var2 = (zi3) q.get(bufferedChannel);
            while (true) {
                long andIncrement = m.getAndIncrement(bufferedChannel);
                long j = andIncrement & 1152921504606846975L;
                boolean y0 = bufferedChannel.y0(andIncrement);
                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                long j2 = j / i2;
                int i3 = (int) (j % i2);
                if (zi3Var2.e != j2) {
                    zi3 a0 = bufferedChannel.a0(j2, zi3Var2);
                    if (a0 != null) {
                        zi3Var = a0;
                    } else if (y0) {
                        return d1aVar2.invoke();
                    }
                } else {
                    zi3Var = zi3Var2;
                }
                int G1 = bufferedChannel.G1(zi3Var, i3, obj, j, obj2, y0);
                if (G1 == 0) {
                    zi3Var.b();
                    return d1aVar.invoke();
                } else if (G1 == 1) {
                    return d1aVar.invoke();
                } else {
                    if (G1 != 2) {
                        if (G1 == 3) {
                            return bufferedChannel$sendImpl$1.invoke(zi3Var, Integer.valueOf(i3), obj, Long.valueOf(j));
                        }
                        if (G1 != 4) {
                            if (G1 == 5) {
                                zi3Var.b();
                            }
                            zi3Var2 = zi3Var;
                        } else {
                            if (j < bufferedChannel.l0()) {
                                zi3Var.b();
                            }
                            return d1aVar2.invoke();
                        }
                    } else if (y0) {
                        zi3Var.p();
                        return d1aVar2.invoke();
                    } else {
                        if (obj2 instanceof qww) {
                            qwwVar = (qww) obj2;
                        } else {
                            qwwVar = null;
                        }
                        if (qwwVar != null) {
                            bufferedChannel.V0(qwwVar, zi3Var, i3);
                        }
                        return u1aVar.invoke(zi3Var, Integer.valueOf(i3));
                    }
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    private final void u1(zi3<E> zi3Var, int i, E e, long j, qww qwwVar, d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
        zi3 zi3Var2;
        qww qwwVar2 = qwwVar;
        int G1 = G1(zi3Var, i, e, j, qwwVar, false);
        if (G1 == 0) {
            zi3Var.b();
            d1aVar.invoke();
        } else if (G1 == 1) {
            d1aVar.invoke();
        } else if (G1 == 2) {
            V0(qwwVar2, zi3Var, i);
        } else if (G1 == 4) {
            if (j < l0()) {
                zi3Var.b();
            }
            d1aVar2.invoke();
        } else if (G1 == 5) {
            zi3Var.b();
            zi3 zi3Var3 = (zi3) q.get(this);
            while (true) {
                long andIncrement = m.getAndIncrement(this);
                long j2 = andIncrement & 1152921504606846975L;
                boolean y0 = y0(andIncrement);
                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = j2 / i2;
                int i3 = (int) (j2 % i2);
                if (zi3Var3.e != j3) {
                    zi3 a0 = a0(j3, zi3Var3);
                    if (a0 != null) {
                        zi3Var2 = a0;
                    } else if (y0) {
                        d1aVar2.invoke();
                        return;
                    }
                } else {
                    zi3Var2 = zi3Var3;
                }
                int G12 = G1(zi3Var2, i3, e, j2, qwwVar, y0);
                if (G12 == 0) {
                    zi3Var2.b();
                    d1aVar.invoke();
                    return;
                } else if (G12 == 1) {
                    d1aVar.invoke();
                    return;
                } else if (G12 != 2) {
                    if (G12 == 3) {
                        throw new IllegalStateException("unexpected");
                    } else if (G12 != 4) {
                        if (G12 == 5) {
                            zi3Var2.b();
                        }
                        zi3Var3 = zi3Var2;
                    } else {
                        if (j2 < l0()) {
                            zi3Var2.b();
                        }
                        d1aVar2.invoke();
                        return;
                    }
                } else if (y0) {
                    zi3Var2.p();
                    d1aVar2.invoke();
                    return;
                } else {
                    if (!(qwwVar2 instanceof qww)) {
                        qwwVar2 = null;
                    }
                    if (qwwVar2 != null) {
                        V0(qwwVar2, zi3Var2, i3);
                    }
                    xhv xhvVar = xhv.INSTANCE;
                    return;
                }
            }
        } else {
            throw new IllegalStateException("unexpected");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v1(tb.zi3<E> r21, int r22, E r23, long r24, tb.ar4<? super tb.xhv> r26) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.v1(tb.zi3, int, java.lang.Object, long, tb.ar4):java.lang.Object");
    }

    private final boolean w0(long j) {
        return t0(j, true);
    }

    private final boolean w1(long j) {
        if (y0(j)) {
            return false;
        }
        return !L(j & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y0(long j) {
        return t0(j, false);
    }

    private final boolean z1(Object obj, E e) {
        boolean B;
        boolean B2;
        if (obj instanceof k9p) {
            return ((k9p) obj).e(this, e);
        }
        g1a<Throwable, xhv> g1aVar = null;
        if (obj instanceof qln) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            qln qlnVar = (qln) obj;
            c<e<? extends E>> cVar = qlnVar.f26816a;
            e.Companion.b(e);
            e a2 = e.a(e);
            g1a<E, xhv> g1aVar2 = this.b;
            if (g1aVar2 != null) {
                g1aVar = OnUndeliveredElementKt.a(g1aVar2, e, qlnVar.f26816a.getContext());
            }
            B2 = BufferedChannelKt.B(cVar, a2, g1aVar);
            return B2;
        } else if (obj instanceof a) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e);
        } else if (obj instanceof q23) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            q23 q23Var = (q23) obj;
            g1a<E, xhv> g1aVar3 = this.b;
            if (g1aVar3 != null) {
                g1aVar = OnUndeliveredElementKt.a(g1aVar3, e, q23Var.getContext());
            }
            B = BufferedChannelKt.B(q23Var, e, g1aVar);
            return B;
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public boolean A0() {
        if (!u0() && !o0()) {
            return !u0();
        }
        return false;
    }

    public final void K1(long j) {
        int i;
        long j2;
        long v;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        long v2;
        long j3;
        long v3;
        if (!C0()) {
            do {
            } while (c0() <= j);
            i = BufferedChannelKt.b;
            for (int i2 = 0; i2 < i; i2++) {
                long c0 = c0();
                if (c0 == (p.get(this) & w08.MAX_MILLIS) && c0 == c0()) {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = p;
            do {
                j2 = atomicLongFieldUpdater2.get(this);
                v = BufferedChannelKt.v(j2 & w08.MAX_MILLIS, true);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, v));
            while (true) {
                long c02 = c0();
                atomicLongFieldUpdater = p;
                long j4 = atomicLongFieldUpdater.get(this);
                long j5 = j4 & w08.MAX_MILLIS;
                if ((4611686018427387904L & j4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(c02 == j5 && c02 == c0())) {
                    if (!z) {
                        v2 = BufferedChannelKt.v(j5, true);
                        atomicLongFieldUpdater.compareAndSet(this, j4, v2);
                    }
                }
            }
            do {
                j3 = atomicLongFieldUpdater.get(this);
                v3 = BufferedChannelKt.v(j3 & w08.MAX_MILLIS, false);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, v3));
        }
    }

    public final void M() {
        O(null);
    }

    public final boolean N(Throwable th) {
        return O(th);
    }

    public boolean O(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return S(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be A[LOOP:2: B:28:0x00be->B:87:0x01d0, LOOP_START, PHI: r1 
      PHI: (r1v13 tb.zi3) = (r1v10 tb.zi3), (r1v15 tb.zi3) binds: [B:27:0x00bc, B:87:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.Q():void");
    }

    public boolean S(Throwable th, boolean z) {
        u1r u1rVar;
        if (z) {
            G0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t;
        u1rVar = BufferedChannelKt.q;
        boolean a2 = h30.a(atomicReferenceFieldUpdater, this, u1rVar, th);
        if (z) {
            H0();
        } else {
            I0();
        }
        V();
        if (a2) {
            r0();
        }
        return a2;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E T0() {
        return (E) c.a.b(this);
    }

    public final void W(long j) {
        u1r u1rVar;
        UndeliveredElementException d;
        String str = dv6.DEBUG_PROPERTY_NAME;
        zi3<E> zi3Var = (zi3) r.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = n;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j >= Math.max(this.f15251a + j2, c0())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                    int i = BufferedChannelKt.SEGMENT_SIZE;
                    long j3 = j2 / i;
                    int i2 = (int) (j2 % i);
                    if (zi3Var.e != j3) {
                        zi3<E> Z = Z(j3, zi3Var);
                        if (Z == null) {
                            continue;
                        } else {
                            zi3Var = Z;
                        }
                    }
                    Object E1 = E1(zi3Var, i2, j2, null);
                    u1rVar = BufferedChannelKt.m;
                    if (E1 != u1rVar) {
                        zi3Var.b();
                        g1a<E, xhv> g1aVar = this.b;
                        if (!(g1aVar == null || (d = OnUndeliveredElementKt.d(g1aVar, E1, null, 2, null)) == null)) {
                            throw d;
                        }
                    } else if (j2 < n0()) {
                        zi3Var.b();
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void a(CancellationException cancellationException) {
        O(cancellationException);
    }

    public Object a1(ar4<? super E> ar4Var) {
        return b1(this, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.i
    public h9p<E, BufferedChannel<E>> b() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        ckf.e(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(bufferedChannel$onSend$1, 3);
        BufferedChannel$onSend$1 bufferedChannel$onSend$12 = bufferedChannel$onSend$1;
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        ckf.e(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kqu.e(bufferedChannel$onSend$2, 3);
        return new i9p(this, bufferedChannel$onSend$12, bufferedChannel$onSend$2, null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.i
    public Object d(E e, ar4<? super xhv> ar4Var) {
        return p1(this, e, ar4Var);
    }

    public final Throwable d0() {
        return (Throwable) t.get(this);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean f() {
        return y0(m.get(this));
    }

    public f9p<E> g0() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        ckf.e(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(bufferedChannel$onReceiveOrNull$1, 3);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        ckf.e(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kqu.e(bufferedChannel$onReceiveOrNull$2, 3);
        return new g9p(this, bufferedChannel$onReceiveOrNull$1, bufferedChannel$onReceiveOrNull$2, this.j);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object i(ar4<? super e<? extends E>> ar4Var) {
        return c1(this, ar4Var);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public Object i1(ar4<? super E> ar4Var) {
        return c.a.c(this, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new a();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public f9p<E> j() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        ckf.e(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(bufferedChannel$onReceive$1, 3);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        ckf.e(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kqu.e(bufferedChannel$onReceive$2, 3);
        return new g9p(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.j);
    }

    @Override // kotlinx.coroutines.channels.i
    public void k(g1a<? super Throwable, xhv> g1aVar) {
        u1r u1rVar;
        u1r u1rVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1r u1rVar3;
        u1r u1rVar4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u;
        if (!h30.a(atomicReferenceFieldUpdater2, this, null, g1aVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater2.get(this);
                u1rVar = BufferedChannelKt.o;
                if (obj == u1rVar) {
                    atomicReferenceFieldUpdater = u;
                    u1rVar3 = BufferedChannelKt.o;
                    u1rVar4 = BufferedChannelKt.p;
                } else {
                    u1rVar2 = BufferedChannelKt.p;
                    if (obj == u1rVar2) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!h30.a(atomicReferenceFieldUpdater, this, u1rVar3, u1rVar4));
            g1aVar.invoke(d0());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
        r14.b(tb.xhv.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k1(tb.k9p<?> r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = q()
            java.lang.Object r0 = r0.get(r13)
            tb.zi3 r0 = (tb.zi3) r0
        L_0x000a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = r()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r1 = t(r13, r1)
            int r2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r5 = (long) r2
            long r5 = r3 / r5
            long r7 = (long) r2
            long r7 = r3 % r7
            int r2 = (int) r7
            long r7 = r0.e
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0039
            tb.zi3 r5 = g(r13, r5, r0)
            if (r5 != 0) goto L_0x0038
            if (r1 == 0) goto L_0x000a
        L_0x0033:
            r13.O0(r15, r14)
            goto L_0x008d
        L_0x0038:
            r0 = r5
        L_0x0039:
            r5 = r13
            r6 = r0
            r7 = r2
            r8 = r15
            r9 = r3
            r11 = r14
            r12 = r1
            int r5 = K(r5, r6, r7, r8, r9, r11, r12)
            if (r5 == 0) goto L_0x0089
            r6 = 1
            if (r5 == r6) goto L_0x0083
            r6 = 2
            if (r5 == r6) goto L_0x006f
            r1 = 3
            if (r5 == r1) goto L_0x0066
            r1 = 4
            if (r5 == r1) goto L_0x005a
            r1 = 5
            if (r5 == r1) goto L_0x0056
            goto L_0x000a
        L_0x0056:
            r0.b()
            goto L_0x000a
        L_0x005a:
            long r1 = r13.l0()
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0033
            r0.b()
            goto L_0x0033
        L_0x0066:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "unexpected"
            r14.<init>(r15)
            throw r14
        L_0x006f:
            if (r1 == 0) goto L_0x0075
            r0.p()
            goto L_0x0033
        L_0x0075:
            boolean r15 = r14 instanceof tb.qww
            if (r15 == 0) goto L_0x007c
            tb.qww r14 = (tb.qww) r14
            goto L_0x007d
        L_0x007c:
            r14 = 0
        L_0x007d:
            if (r14 == 0) goto L_0x008d
            A(r13, r14, r0, r2)
            goto L_0x008d
        L_0x0083:
            tb.xhv r15 = tb.xhv.INSTANCE
            r14.b(r15)
            goto L_0x008d
        L_0x0089:
            r0.b()
            goto L_0x0083
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.k1(tb.k9p, java.lang.Object):void");
    }

    public final long l0() {
        return n.get(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        r0 = kotlinx.coroutines.channels.e.Companion;
        r9 = tb.xhv.INSTANCE;
        r0.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return r9;
     */
    @Override // kotlinx.coroutines.channels.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(E r17) {
        /*
            r16 = this;
            r8 = r16
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.m
            long r0 = r0.get(r8)
            boolean r0 = r8.w1(r0)
            kotlinx.coroutines.channels.e$c r9 = kotlinx.coroutines.channels.e.b
            if (r0 == 0) goto L_0x0016
            kotlinx.coroutines.channels.e$b r0 = kotlinx.coroutines.channels.e.Companion
            r0.getClass()
            return r9
        L_0x0016:
            tb.u1r r10 = kotlinx.coroutines.channels.BufferedChannelKt.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = q()
            java.lang.Object r0 = r0.get(r8)
            tb.zi3 r0 = (tb.zi3) r0
        L_0x0024:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = r()
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r11 = r1 & r3
            boolean r13 = t(r8, r1)
            int r1 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE
            long r1 = (long) r1
            long r3 = r11 / r1
            long r1 = r11 % r1
            int r14 = (int) r1
            long r1 = r0.e
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x005b
            tb.zi3 r1 = g(r8, r3, r0)
            if (r1 != 0) goto L_0x0059
            if (r13 == 0) goto L_0x0024
        L_0x004d:
            kotlinx.coroutines.channels.e$b r0 = kotlinx.coroutines.channels.e.Companion
            java.lang.Throwable r1 = r16.m0()
            java.lang.Object r9 = r0.a(r1)
            goto L_0x00bd
        L_0x0059:
            r15 = r1
            goto L_0x005c
        L_0x005b:
            r15 = r0
        L_0x005c:
            r0 = r16
            r1 = r15
            r2 = r14
            r3 = r17
            r4 = r11
            r6 = r10
            r7 = r13
            int r0 = K(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b9
            r1 = 1
            if (r0 == r1) goto L_0x00b1
            r1 = 2
            if (r0 == r1) goto L_0x0095
            r1 = 3
            if (r0 == r1) goto L_0x008c
            r1 = 4
            if (r0 == r1) goto L_0x0080
            r1 = 5
            if (r0 == r1) goto L_0x007b
            goto L_0x007e
        L_0x007b:
            r15.b()
        L_0x007e:
            r0 = r15
            goto L_0x0024
        L_0x0080:
            long r0 = r16.l0()
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x004d
            r15.b()
            goto L_0x004d
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)
            throw r0
        L_0x0095:
            if (r13 == 0) goto L_0x009b
            r15.p()
            goto L_0x004d
        L_0x009b:
            boolean r0 = r10 instanceof tb.qww
            if (r0 == 0) goto L_0x00a2
            tb.qww r10 = (tb.qww) r10
            goto L_0x00a3
        L_0x00a2:
            r10 = 0
        L_0x00a3:
            if (r10 == 0) goto L_0x00a8
            A(r8, r10, r15, r14)
        L_0x00a8:
            r15.p()
            kotlinx.coroutines.channels.e$b r0 = kotlinx.coroutines.channels.e.Companion
            r0.getClass()
            goto L_0x00bd
        L_0x00b1:
            kotlinx.coroutines.channels.e$b r0 = kotlinx.coroutines.channels.e.Companion
            tb.xhv r9 = tb.xhv.INSTANCE
            r0.b(r9)
            goto L_0x00bd
        L_0x00b9:
            r15.b()
            goto L_0x00b1
        L_0x00bd:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.m(java.lang.Object):java.lang.Object");
    }

    public final Throwable m0() {
        Throwable d0 = d0();
        if (d0 == null) {
            return new ClosedSendChannelException(bj3.DEFAULT_CLOSE_MESSAGE);
        }
        return d0;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public f9p<e<E>> n() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        ckf.e(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(bufferedChannel$onReceiveCatching$1, 3);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        ckf.e(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kqu.e(bufferedChannel$onReceiveCatching$2, 3);
        return new g9p(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.j);
    }

    public final long n0() {
        return m.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object o() {
        u1r u1rVar;
        Object obj;
        qww qwwVar;
        Object obj2;
        Object obj3;
        long j = n.get(this);
        long j2 = m.get(this);
        if (w0(j2)) {
            return e.Companion.a(d0());
        }
        Object obj4 = e.b;
        if (j >= (j2 & 1152921504606846975L)) {
            e.Companion.getClass();
            return obj4;
        }
        u1rVar = BufferedChannelKt.i;
        zi3 zi3Var = (zi3) r.get(this);
        while (!u0()) {
            long andIncrement = n.getAndIncrement(this);
            long j3 = BufferedChannelKt.SEGMENT_SIZE;
            long j4 = andIncrement / j3;
            int i = (int) (andIncrement % j3);
            if (zi3Var.e != j4) {
                zi3 Z = Z(j4, zi3Var);
                if (Z == null) {
                    continue;
                } else {
                    zi3Var = Z;
                }
            }
            Object E1 = E1(zi3Var, i, andIncrement, u1rVar);
            obj = BufferedChannelKt.k;
            if (E1 == obj) {
                if (u1rVar instanceof qww) {
                    qwwVar = (qww) u1rVar;
                } else {
                    qwwVar = null;
                }
                if (qwwVar != null) {
                    U0(qwwVar, zi3Var, i);
                }
                K1(andIncrement);
                zi3Var.p();
                e.Companion.getClass();
            } else {
                obj2 = BufferedChannelKt.m;
                if (E1 != obj2) {
                    obj3 = BufferedChannelKt.l;
                    if (E1 != obj3) {
                        zi3Var.b();
                        e.Companion.b(E1);
                        obj4 = E1;
                    } else {
                        throw new IllegalStateException("unexpected");
                    }
                } else if (andIncrement < n0()) {
                    zi3Var.b();
                }
            }
            return obj4;
        }
        return e.Companion.a(d0());
    }

    public final boolean o0() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r;
            zi3<E> zi3Var = (zi3) atomicReferenceFieldUpdater.get(this);
            long l0 = l0();
            if (n0() <= l0) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = l0 / i;
            if (zi3Var.e == j || (zi3Var = Z(j, zi3Var)) != null) {
                zi3Var.b();
                if (s0(zi3Var, (int) (l0 % i), l0)) {
                    return true;
                }
                n.compareAndSet(this, l0, l0 + 1);
            } else if (((zi3) atomicReferenceFieldUpdater.get(this)).e < j) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.i
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return c.a.a(this, e);
    }

    public Object q1(E e, ar4<? super Boolean> ar4Var) {
        return r1(this, e, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean s(Throwable th) {
        return S(th, false);
    }

    public final <R> R s1(E e, Object obj, d1a<? extends R> d1aVar, u1a<? super zi3<E>, ? super Integer, ? extends R> u1aVar, d1a<? extends R> d1aVar2, y1a<? super zi3<E>, ? super Integer, ? super E, ? super Long, ? extends R> y1aVar) {
        zi3 zi3Var;
        qww qwwVar;
        zi3 zi3Var2 = (zi3) q.get(this);
        while (true) {
            long andIncrement = m.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean y0 = y0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / i;
            int i2 = (int) (j % i);
            if (zi3Var2.e != j2) {
                zi3 a0 = a0(j2, zi3Var2);
                if (a0 != null) {
                    zi3Var = a0;
                } else if (y0) {
                    return (R) d1aVar2.invoke();
                }
            } else {
                zi3Var = zi3Var2;
            }
            int G1 = G1(zi3Var, i2, e, j, obj, y0);
            if (G1 == 0) {
                zi3Var.b();
                return (R) d1aVar.invoke();
            } else if (G1 == 1) {
                return (R) d1aVar.invoke();
            } else {
                if (G1 != 2) {
                    if (G1 == 3) {
                        return (R) y1aVar.invoke(zi3Var, Integer.valueOf(i2), e, Long.valueOf(j));
                    }
                    if (G1 != 4) {
                        if (G1 == 5) {
                            zi3Var.b();
                        }
                        zi3Var2 = zi3Var;
                    } else {
                        if (j < l0()) {
                            zi3Var.b();
                        }
                        return (R) d1aVar2.invoke();
                    }
                } else if (y0) {
                    zi3Var.p();
                    return (R) d1aVar2.invoke();
                } else {
                    if (obj instanceof qww) {
                        qwwVar = (qww) obj;
                    } else {
                        qwwVar = null;
                    }
                    if (qwwVar != null) {
                        V0(qwwVar, zi3Var, i2);
                    }
                    return (R) u1aVar.invoke(zi3Var, Integer.valueOf(i2));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01dc, code lost:
        r3 = (tb.zi3) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e3, code lost:
        if (r3 != null) goto L_0x0205;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01dc A[EDGE_INSN: B:107:0x01dc->B:89:0x01dc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.toString():java.lang.String");
    }

    public boolean u0() {
        return w0(m.get(this));
    }

    public boolean x1() {
        return w1(m.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String y1() {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.BufferedChannel.y1():java.lang.String");
    }

    public boolean z0() {
        return false;
    }

    public /* synthetic */ BufferedChannel(int i, g1a g1aVar, int i2, a07 a07Var) {
        this(i, (i2 & 2) != 0 ? null : g1aVar);
    }

    public static /* synthetic */ void B0() {
    }

    public static /* synthetic */ void e0() {
    }

    public static /* synthetic */ void f0() {
    }

    public static /* synthetic */ void h0() {
    }

    public static /* synthetic */ void i0() {
    }

    private static /* synthetic */ void j0() {
    }

    public static /* synthetic */ void v0() {
    }

    public static /* synthetic */ void x0() {
    }

    public void K0() {
    }

    public void R0() {
    }

    public void S0() {
    }
}
