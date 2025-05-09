package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.security.realidentity.f1;
import com.alibaba.security.realidentity.l1;
import com.alibaba.security.realidentity.p1;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.infoflow.taobao.subservice.biz.smartnextpagerequestservice.impl.ScoreLevel;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.ckf;
import tb.d9p;
import tb.dkf;
import tb.dv6;
import tb.e9p;
import tb.f5k;
import tb.f9p;
import tb.fa4;
import tb.g1a;
import tb.g9p;
import tb.gbo;
import tb.h30;
import tb.hbo;
import tb.hr3;
import tb.huf;
import tb.ic8;
import tb.ir3;
import tb.jr3;
import tb.jv6;
import tb.k9p;
import tb.kqu;
import tb.lca;
import tb.o5k;
import tb.ov6;
import tb.pg1;
import tb.quf;
import tb.rgq;
import tb.rr7;
import tb.ruf;
import tb.rxk;
import tb.s23;
import tb.sbp;
import tb.sch;
import tb.sm8;
import tb.suf;
import tb.u1a;
import tb.u1r;
import tb.ukf;
import tb.vkf;
import tb.vql;
import tb.vu4;
import tb.wbp;
import tb.wse;
import tb.xhv;
import tb.yse;

/* compiled from: Taobao */
@Deprecated(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\t}Õ\u0001Ö\u0001×\u0001Ø\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010 \u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\n*\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b)\u0010&J.\u0010+\u001a\u00020\n\"\n\b\u0000\u0010 \u0018\u0001*\u00020*2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0082\b¢\u0006\u0004\b+\u0010&J\u0019\u0010-\u001a\u00020,2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b-\u0010.J@\u00104\u001a\u00020*2'\u00102\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`12\u0006\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u00042\u0006\u00106\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u00107\u001a\u00020*H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020*H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0004H\u0002¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ%\u0010F\u001a\u00020\n2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030C2\b\u0010E\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bJ\u0010KJ\u001b\u0010L\u001a\u0004\u0018\u00010\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bL\u0010IJ\u0019\u0010M\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010O\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bQ\u0010RJ#\u0010S\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0010\u001a\u00020\u001cH\u0002¢\u0006\u0004\bV\u0010WJ*\u0010Y\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020U2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0082\u0010¢\u0006\u0004\bY\u0010ZJ)\u0010\\\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020U2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010_\u001a\u0004\u0018\u00010U*\u00020^H\u0002¢\u0006\u0004\b_\u0010`J\u0019\u0010b\u001a\u00020a2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bb\u0010cJ\u0015\u0010d\u001a\u0004\u0018\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0004\bd\u0010BJ%\u0010e\u001a\u00020\n2\n\u0010D\u001a\u0006\u0012\u0002\b\u00030C2\b\u0010E\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\be\u0010GJ%\u0010g\u001a\u0004\u0018\u00010\t2\b\u0010E\u001a\u0004\u0018\u00010\t2\b\u0010f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bg\u0010RJ\u0019\u0010i\u001a\u00020\n2\b\u0010h\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bi\u0010jJ\r\u0010k\u001a\u00020\u0004¢\u0006\u0004\bk\u0010@J\u000f\u0010l\u001a\u00020\nH\u0014¢\u0006\u0004\bl\u0010mJ\u0011\u0010p\u001a\u00060nj\u0002`o¢\u0006\u0004\bp\u0010qJ#\u0010s\u001a\u00060nj\u0002`o*\u00020\u00152\n\b\u0002\u0010r\u001a\u0004\u0018\u00010aH\u0004¢\u0006\u0004\bs\u0010tJ6\u0010v\u001a\u00020u2'\u00102\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`1¢\u0006\u0004\bv\u0010wJF\u0010y\u001a\u00020u2\u0006\u00103\u001a\u00020\u00042\u0006\u0010x\u001a\u00020\u00042'\u00102\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0\bj\u0002`1¢\u0006\u0004\by\u0010zJ\u0013\u0010{\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b{\u0010BJ\u0017\u0010|\u001a\u00020\n2\u0006\u00107\u001a\u00020*H\u0000¢\u0006\u0004\b|\u0010>J\u001f\u0010}\u001a\u00020\n2\u000e\u0010$\u001a\n\u0018\u00010nj\u0004\u0018\u0001`oH\u0016¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020aH\u0014¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001b\u0010\u0081\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0017¢\u0006\u0005\b\u0081\u0001\u0010(J\u001a\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0085\u0001\u001a\u00020\n2\u0007\u0010\u0084\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0019\u0010\u0087\u0001\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u0087\u0001\u0010(J\u0019\u0010\u0088\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0015¢\u0006\u0005\b\u0088\u0001\u0010(J\u001c\u0010\u0089\u0001\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J,\u0010\u008c\u0001\u001a\u00030\u008b\u00012\n\b\u0002\u0010r\u001a\u0004\u0018\u00010a2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0080\b¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0015\u0010\u008e\u0001\u001a\u00060nj\u0002`oH\u0016¢\u0006\u0005\b\u008e\u0001\u0010qJ\u001c\u0010\u008f\u0001\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u008a\u0001J\u001d\u0010\u0090\u0001\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0005\b\u0090\u0001\u0010IJ\u0019\u0010\u0092\u0001\u001a\u00030\u0091\u00012\u0006\u0010X\u001a\u00020\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020\n2\u0007\u0010\u0094\u0001\u001a\u00020\u0015H\u0010¢\u0006\u0006\b\u0095\u0001\u0010\u0083\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0083\u0001J\u001a\u0010\u0097\u0001\u001a\u00020\u00042\u0007\u0010\u0094\u0001\u001a\u00020\u0015H\u0014¢\u0006\u0005\b\u0097\u0001\u0010(J\u001c\u0010\u0098\u0001\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0006\b\u009a\u0001\u0010\u0099\u0001J\u0012\u0010\u009b\u0001\u001a\u00020aH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0080\u0001J\u0012\u0010\u009c\u0001\u001a\u00020aH\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u0080\u0001J\u0012\u0010\u009d\u0001\u001a\u00020aH\u0010¢\u0006\u0006\b\u009d\u0001\u0010\u0080\u0001J\u0012\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0015¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0014\u0010 \u0001\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0017\u0010¢\u0001\u001a\u0004\u0018\u00010\tH\u0084@ø\u0001\u0000¢\u0006\u0005\b¢\u0001\u0010BR\u001c\u0010§\u0001\u001a\u00030£\u00018F¢\u0006\u000f\u0012\u0005\b¦\u0001\u0010m\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001e\u0010©\u0001\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010KR\u001b\u0010¬\u0001\u001a\u00020\u0004*\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R#\u0010±\u0001\u001a\u0007\u0012\u0002\b\u00030\u00ad\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b°\u0001\u0010m\u001a\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010µ\u0001\u001a\u0007\u0012\u0002\b\u00030²\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R0\u0010»\u0001\u001a\u0005\u0018\u00010\u0091\u00012\n\u0010¶\u0001\u001a\u0005\u0018\u00010\u0091\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010h\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¡\u0001R\u0016\u0010¿\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010@R\u0013\u0010Á\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010@R\u0013\u0010Â\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010@R\u0019\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00158DX\u0084\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u009f\u0001R\u0016\u0010Æ\u0001\u001a\u00020\u00048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010@R\u0016\u0010È\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010@R\u001b\u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010É\u00018F¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u0016\u0010Î\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010@R\u0016\u0010Ð\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010@R\u0013\u0010Ò\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010@R\u0015\u0010Ó\u0001\u001a\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0091\u00010\t8\u0002X\u0082\u0004R\u0014\u0010Ô\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ù\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/m;", "Ltb/jr3;", "Ltb/vql;", "", "active", "<init>", "(Z)V", "Lkotlin/Function1;", "", "Ltb/xhv;", pg1.ATOM_EXT_block, "", "K0", "(Ltb/g1a;)Ljava/lang/Void;", "Lkotlinx/coroutines/JobSupport$c;", "state", "proposedUpdate", "Y", "(Lkotlinx/coroutines/JobSupport$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "k0", "(Lkotlinx/coroutines/JobSupport$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "E", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Ltb/yse;", "update", "m1", "(Ltb/yse;Ljava/lang/Object;)Z", "T", "(Ltb/yse;Ljava/lang/Object;)V", "Ltb/f5k;", "list", "cause", "T0", "(Ltb/f5k;Ljava/lang/Throwable;)V", "Q", "(Ljava/lang/Throwable;)Z", "U0", "Ltb/ruf;", "V0", "", "h1", "(Ljava/lang/Object;)I", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Q0", "(Ltb/g1a;Z)Ltb/ruf;", "expect", "node", TLogTracker.LEVEL_DEBUG, "(Ljava/lang/Object;Ltb/f5k;Ltb/ruf;)Z", "Ltb/ic8;", "c1", "(Ltb/ic8;)V", "d1", "(Ltb/ruf;)V", "H0", "()Z", "I0", "(Ltb/ar4;)Ljava/lang/Object;", "Ltb/k9p;", ThemisConfig.SCENE_SELECT, "ignoredParam", "e1", "(Ltb/k9p;Ljava/lang/Object;)V", "P", "(Ljava/lang/Object;)Ljava/lang/Object;", "V", "(Ljava/lang/Object;)Ljava/lang/Throwable;", ScoreLevel.N0, "s0", "(Ltb/yse;)Ltb/f5k;", "n1", "(Ltb/yse;Ljava/lang/Throwable;)Z", "o1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", p1.d, "(Ltb/yse;Ljava/lang/Object;)Ljava/lang/Object;", "Ltb/ir3;", "a0", "(Ltb/yse;)Ltb/ir3;", "child", "q1", "(Lkotlinx/coroutines/JobSupport$c;Ltb/ir3;Ljava/lang/Object;)Z", "lastChild", "U", "(Lkotlinx/coroutines/JobSupport$c;Ltb/ir3;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "S0", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Ltb/ir3;", "", "i1", "(Ljava/lang/Object;)Ljava/lang/String;", TLogTracker.LEVEL_INFO, "X0", "result", "W0", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT, "y0", "(Lkotlinx/coroutines/m;)V", "start", "a1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u0", "()Ljava/util/concurrent/CancellationException;", "message", "j1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Ltb/rr7;", "D0", "(Ltb/g1a;)Ltb/rr7;", "invokeImmediately", UTConstant.Args.UT_SUCCESS_F, "(ZZLtb/g1a;)Ltb/rr7;", "f0", f1.d, "a", "(Ljava/util/concurrent/CancellationException;)V", "R", "()Ljava/lang/String;", "K", "O", "(Ljava/lang/Throwable;)V", "parentJob", "n0", "(Ltb/vql;)V", ExifInterface.LATITUDE_SOUTH, "M", "N", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/JobCancellationException;", "W", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/JobCancellationException;", "C0", "O0", "P0", "Ltb/hr3;", "B0", "(Ltb/jr3;)Ltb/hr3;", "exception", "x0", "Y0", "w0", "Z0", "(Ljava/lang/Object;)V", "G", "toString", l1.f, "R0", "h0", "()Ljava/lang/Throwable;", "d0", "()Ljava/lang/Object;", "H", "Ltb/d9p;", "q0", "()Ltb/d9p;", "r0", "onJoin", "j0", "exceptionOrNull", "z0", "(Ltb/yse;)Z", "isCancelling", "Ltb/f9p;", "m0", "()Ltb/f9p;", "o0", "onAwaitInternal", "Lkotlin/coroutines/d$c;", "getKey", "()Lkotlin/coroutines/d$c;", "key", "value", lca.STAGE_T0, "()Ltb/hr3;", "g1", "(Ltb/hr3;)V", "parentHandle", "getParent", "()Lkotlinx/coroutines/m;", "v0", "isActive", "A0", "isCompleted", "isCancelled", "e0", "completionCause", "g0", "completionCauseHandled", "p0", "onCancelComplete", "Ltb/sbp;", "b0", "()Ltb/sbp;", "children", "G0", "isScopedCoroutine", "l0", "handlesException", "F0", "isCompletedExceptionally", "_parentHandle", "_state", TplMsg.VALUE_T_NATIVE_RETURN, "c", "d", "e", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class JobSupport implements m, jr3, vql {
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "a");
    private static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);
    @Volatile

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f15247a;
    @Volatile
    private volatile Object b;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/JobSupport$a;", "T", "Lkotlinx/coroutines/c;", "Ltb/ar4;", "delegate", "Lkotlinx/coroutines/JobSupport;", "job", "<init>", "(Ltb/ar4;Lkotlinx/coroutines/JobSupport;)V", "Lkotlinx/coroutines/m;", com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT, "", "y", "(Lkotlinx/coroutines/m;)Ljava/lang/Throwable;", "", "Q", "()Ljava/lang/String;", "l", "Lkotlinx/coroutines/JobSupport;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a<T> extends kotlinx.coroutines.c<T> {
        private final JobSupport l;

        public a(ar4<? super T> ar4Var, JobSupport jobSupport) {
            super(ar4Var, 1);
            this.l = jobSupport;
        }

        @Override // kotlinx.coroutines.c
        public String Q() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.c
        public Throwable y(m mVar) {
            Throwable d;
            Object v0 = this.l.v0();
            if ((v0 instanceof c) && (d = ((c) v0).d()) != null) {
                return d;
            }
            if (v0 instanceof fa4) {
                return ((fa4) v0).f19137a;
            }
            return mVar.u0();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b extends ruf {
        public final JobSupport h;
        public final c i;
        public final ir3 j;
        public final Object k;

        public b(JobSupport jobSupport, c cVar, ir3 ir3Var, Object obj) {
            this.h = jobSupport;
            this.i = cVar;
            this.j = ir3Var;
            this.k = obj;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            p(th);
            return xhv.INSTANCE;
        }

        @Override // tb.ha4
        public void p(Throwable th) {
            this.h.U(this.i, this.j, this.k);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class c implements yse {
        public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(c.class, TplMsg.VALUE_T_NATIVE_RETURN);
        public static final AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "c");
        public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "d");

        /* renamed from: a  reason: collision with root package name */
        public final f5k f15248a;
        @Volatile
        public volatile int b;
        @Volatile
        public volatile Object c;
        @Volatile
        public volatile Object d;

        public c(f5k f5kVar, boolean z, Throwable th) {
            this.f15248a = f5kVar;
            this.b = z ? 1 : 0;
            this.c = th;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable d = d();
            if (d == null) {
                k(th);
            } else if (th != d) {
                Object c = c();
                if (c == null) {
                    j(th);
                } else if (c instanceof Throwable) {
                    if (th != c) {
                        ArrayList<Throwable> b = b();
                        b.add(c);
                        b.add(th);
                        j(b);
                    }
                } else if (c instanceof ArrayList) {
                    ((ArrayList) c).add(th);
                } else {
                    throw new IllegalStateException(("State is " + c).toString());
                }
            }
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public final Object c() {
            return g.get(this);
        }

        public final Throwable d() {
            return (Throwable) f.get(this);
        }

        public final boolean e() {
            if (d() != null) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            if (e.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean g() {
            if (c() == suf.d) {
                return true;
            }
            return false;
        }

        @Override // tb.yse
        public f5k getList() {
            return this.f15248a;
        }

        public final List<Throwable> h(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object c = c();
            if (c == null) {
                arrayList = b();
            } else if (c instanceof Throwable) {
                ArrayList<Throwable> b = b();
                b.add(c);
                arrayList = b;
            } else if (c instanceof ArrayList) {
                arrayList = (ArrayList) c;
            } else {
                throw new IllegalStateException(("State is " + c).toString());
            }
            Throwable d = d();
            if (d != null) {
                arrayList.add(0, d);
            }
            if (th != null && !ckf.b(th, d)) {
                arrayList.add(th);
            }
            j(suf.d);
            return arrayList;
        }

        public final void i(boolean z) {
            e.set(this, z ? 1 : 0);
        }

        @Override // tb.yse
        public boolean isActive() {
            if (d() == null) {
                return true;
            }
            return false;
        }

        public final void j(Object obj) {
            g.set(this, obj);
        }

        public final void k(Throwable th) {
            f.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + getList() + ']';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class d extends ruf {
        public final k9p<?> h;

        public d(k9p<?> k9pVar) {
            this.h = k9pVar;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            p(th);
            return xhv.INSTANCE;
        }

        @Override // tb.ha4
        public void p(Throwable th) {
            JobSupport jobSupport = JobSupport.this;
            Object v0 = jobSupport.v0();
            if (!(v0 instanceof fa4)) {
                v0 = suf.b(v0);
            }
            this.h.e(jobSupport, v0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class e extends ruf {
        public final k9p<?> h;

        public e(k9p<?> k9pVar) {
            this.h = k9pVar;
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
            p(th);
            return xhv.INSTANCE;
        }

        @Override // tb.ha4
        public void p(Throwable th) {
            this.h.e(JobSupport.this, xhv.INSTANCE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class f extends LockFreeLinkedListNode.a {
        public final /* synthetic */ JobSupport e;
        public final /* synthetic */ Object f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.e = jobSupport;
            this.f = obj;
        }

        /* renamed from: f */
        public Object d(LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (this.e.v0() == this.f) {
                return null;
            }
            return sch.f27948a;
        }
    }

    public JobSupport(boolean z) {
        ic8 ic8Var;
        if (z) {
            ic8Var = suf.f;
        } else {
            ic8Var = suf.e;
        }
        this.f15247a = ic8Var;
    }

    private final boolean D(Object obj, f5k f5kVar, ruf rufVar) {
        int o;
        f fVar = new f(rufVar, this, obj);
        do {
            o = f5kVar.j().o(rufVar, f5kVar, fVar);
            if (o == 1) {
                return true;
            }
        } while (o != 2);
        return false;
    }

    private final void E(Throwable th, List<? extends Throwable> list) {
        Throwable th2;
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            if (!dv6.c()) {
                th2 = th;
            } else {
                th2 = rgq.l(th);
            }
            for (Throwable th3 : list) {
                if (dv6.c()) {
                    th3 = rgq.l(th3);
                }
                if (th3 != th && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    sm8.a(th, th3);
                }
            }
        }
    }

    private final boolean H0() {
        Object v0;
        do {
            v0 = v0();
            if (!(v0 instanceof yse)) {
                return false;
            }
        } while (h1(v0) < 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(ar4<Object> ar4Var) {
        a aVar = new a(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), this);
        aVar.E();
        s23.a(aVar, D0(new gbo(aVar)));
        Object A = aVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I0(ar4<? super xhv> ar4Var) {
        kotlinx.coroutines.c cVar = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        s23.a(cVar, D0(new hbo(cVar)));
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    private final void J0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, g1a<Object, xhv> g1aVar, Object obj) {
        while (true) {
            g1aVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final Void K0(g1a<Object, xhv> g1aVar) {
        while (true) {
            g1aVar.invoke(v0());
        }
    }

    private final Object N0(Object obj) {
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object v0 = v0();
            if (v0 instanceof c) {
                synchronized (v0) {
                    try {
                        if (((c) v0).g()) {
                            return suf.c;
                        }
                        boolean e2 = ((c) v0).e();
                        if (obj != null || !e2) {
                            if (th2 == null) {
                                th2 = V(obj);
                            }
                            ((c) v0).a(th2);
                        }
                        Throwable d2 = ((c) v0).d();
                        if (!e2) {
                            th = d2;
                        }
                        if (th != null) {
                            T0(((c) v0).getList(), th);
                        }
                        return suf.f28281a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else if (!(v0 instanceof yse)) {
                return suf.c;
            } else {
                if (th2 == null) {
                    th2 = V(obj);
                }
                yse yseVar = (yse) v0;
                if (!yseVar.isActive()) {
                    Object o1 = o1(v0, new fa4(th2, false, 2, null));
                    if (o1 == suf.f28281a) {
                        throw new IllegalStateException(("Cannot happen in " + v0).toString());
                    } else if (o1 != suf.b) {
                        return o1;
                    }
                } else if (n1(yseVar, th2)) {
                    return suf.f28281a;
                }
            }
        }
    }

    private final Object P(Object obj) {
        Object o1;
        do {
            Object v0 = v0();
            if (!(v0 instanceof yse) || ((v0 instanceof c) && ((c) v0).f())) {
                return suf.f28281a;
            }
            o1 = o1(v0, new fa4(V(obj), false, 2, null));
        } while (o1 == suf.b);
        return o1;
    }

    private final boolean Q(Throwable th) {
        if (G0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        hr3 t0 = t0();
        if (t0 == null || t0 == o5k.INSTANCE) {
            return z;
        }
        if (t0.d(th) || z) {
            return true;
        }
        return false;
    }

    private final ruf Q0(g1a<? super Throwable, xhv> g1aVar, boolean z) {
        ruf rufVar = null;
        if (z) {
            if (g1aVar instanceof huf) {
                rufVar = (huf) g1aVar;
            }
            if (rufVar == null) {
                rufVar = new ukf(g1aVar);
            }
        } else {
            if (g1aVar instanceof ruf) {
                rufVar = (ruf) g1aVar;
            }
            if (rufVar != null) {
                String str = dv6.DEBUG_PROPERTY_NAME;
            } else {
                rufVar = new vkf(g1aVar);
            }
        }
        rufVar.r(this);
        return rufVar;
    }

    private final ir3 S0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.k()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.j();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.i();
            if (!lockFreeLinkedListNode.k()) {
                if (lockFreeLinkedListNode instanceof ir3) {
                    return (ir3) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof f5k) {
                    return null;
                }
            }
        }
    }

    private final void T(yse yseVar, Object obj) {
        fa4 fa4Var;
        hr3 t0 = t0();
        if (t0 != null) {
            t0.dispose();
            g1(o5k.INSTANCE);
        }
        Throwable th = null;
        if (obj instanceof fa4) {
            fa4Var = (fa4) obj;
        } else {
            fa4Var = null;
        }
        if (fa4Var != null) {
            th = fa4Var.f19137a;
        }
        if (yseVar instanceof ruf) {
            try {
                ((ruf) yseVar).p(th);
            } catch (Throwable th2) {
                x0(new CompletionHandlerException("Exception in completion handler " + yseVar + " for " + this, th2));
            }
        } else {
            f5k list = yseVar.getList();
            if (list != null) {
                U0(list, th);
            }
        }
    }

    private final void T0(f5k f5kVar, Throwable th) {
        Y0(th);
        Object h = f5kVar.h();
        ckf.e(h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) h; !ckf.b(lockFreeLinkedListNode, f5kVar); lockFreeLinkedListNode = lockFreeLinkedListNode.i()) {
            if (lockFreeLinkedListNode instanceof huf) {
                ruf rufVar = (ruf) lockFreeLinkedListNode;
                try {
                    rufVar.p(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        sm8.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + rufVar + " for " + this, th2);
                        xhv xhvVar = xhv.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            x0(completionHandlerException);
        }
        Q(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(c cVar, ir3 ir3Var, Object obj) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        ir3 S0 = S0(ir3Var);
        if (S0 == null || !q1(cVar, S0, obj)) {
            G(Y(cVar, obj));
        }
    }

    private final void U0(f5k f5kVar, Throwable th) {
        Object h = f5kVar.h();
        ckf.e(h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) h; !ckf.b(lockFreeLinkedListNode, f5kVar); lockFreeLinkedListNode = lockFreeLinkedListNode.i()) {
            if (lockFreeLinkedListNode instanceof ruf) {
                ruf rufVar = (ruf) lockFreeLinkedListNode;
                try {
                    rufVar.p(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        sm8.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + rufVar + " for " + this, th2);
                        xhv xhvVar = xhv.INSTANCE;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            x0(completionHandlerException);
        }
    }

    private final Throwable V(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(R(), null, this);
            }
            return th;
        }
        ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((vql) obj).C0();
    }

    private final /* synthetic */ <T extends ruf> void V0(f5k f5kVar, Throwable th) {
        Object h = f5kVar.h();
        ckf.e(h, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        if (!ckf.b((LockFreeLinkedListNode) h, f5kVar)) {
            ckf.m(3, "T");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(Object obj, Object obj2) {
        if (!(obj2 instanceof fa4)) {
            return obj2;
        }
        throw ((fa4) obj2).f19137a;
    }

    public static /* synthetic */ JobCancellationException X(JobSupport jobSupport, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = jobSupport.R();
            }
            return new JobCancellationException(str, th, jobSupport);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(k9p<?> k9pVar, Object obj) {
        Object v0;
        do {
            v0 = v0();
            if (!(v0 instanceof yse)) {
                if (!(v0 instanceof fa4)) {
                    v0 = suf.b(v0);
                }
                k9pVar.b(v0);
                return;
            }
        } while (h1(v0) < 0);
        k9pVar.d(D0(new d(k9pVar)));
    }

    private final Object Y(c cVar, Object obj) {
        fa4 fa4Var;
        Throwable th;
        boolean e2;
        Throwable k0;
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (obj instanceof fa4) {
            fa4Var = (fa4) obj;
        } else {
            fa4Var = null;
        }
        if (fa4Var != null) {
            th = fa4Var.f19137a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            e2 = cVar.e();
            List<Throwable> h = cVar.h(th);
            k0 = k0(cVar, h);
            if (k0 != null) {
                E(k0, h);
            }
        }
        if (!(k0 == null || k0 == th)) {
            obj = new fa4(k0, false, 2, null);
        }
        if (k0 != null && (Q(k0) || w0(k0))) {
            ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((fa4) obj).b();
        }
        if (!e2) {
            Y0(k0);
        }
        Z0(obj);
        h30.a(c, this, cVar, suf.a(obj));
        T(cVar, obj);
        return obj;
    }

    private final ir3 a0(yse yseVar) {
        ir3 ir3Var;
        if (yseVar instanceof ir3) {
            ir3Var = (ir3) yseVar;
        } else {
            ir3Var = null;
        }
        if (ir3Var != null) {
            return ir3Var;
        }
        f5k list = yseVar.getList();
        if (list != null) {
            return S0(list);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [tb.wse] */
    private final void c1(ic8 ic8Var) {
        f5k f5kVar = new f5k();
        if (!ic8Var.isActive()) {
            f5kVar = new wse(f5kVar);
        }
        h30.a(c, this, ic8Var, f5kVar);
    }

    private final void d1(ruf rufVar) {
        rufVar.c(new f5k());
        h30.a(c, this, rufVar, rufVar.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(k9p<?> k9pVar, Object obj) {
        if (!H0()) {
            k9pVar.b(xhv.INSTANCE);
        } else {
            k9pVar.d(D0(new e(k9pVar)));
        }
    }

    private final int h1(Object obj) {
        if (obj instanceof ic8) {
            if (((ic8) obj).isActive()) {
                return 0;
            }
            if (!h30.a(c, this, obj, suf.f)) {
                return -1;
            }
            a1();
            return 1;
        } else if (!(obj instanceof wse)) {
            return 0;
        } else {
            if (!h30.a(c, this, obj, ((wse) obj).getList())) {
                return -1;
            }
            a1();
            return 1;
        }
    }

    private final String i1(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.e()) {
                return "Cancelling";
            }
            if (cVar.f()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof yse) {
            if (((yse) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof fa4) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    private final Throwable j0(Object obj) {
        fa4 fa4Var;
        if (obj instanceof fa4) {
            fa4Var = (fa4) obj;
        } else {
            fa4Var = null;
        }
        if (fa4Var != null) {
            return fa4Var.f19137a;
        }
        return null;
    }

    private final Throwable k0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (!list.isEmpty()) {
            List<? extends Throwable> list2 = list;
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                        obj2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) obj2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.e()) {
            return new JobCancellationException(R(), null, this);
        } else {
            return null;
        }
    }

    public static /* synthetic */ CancellationException k1(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return jobSupport.j1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean m1(yse yseVar, Object obj) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (!h30.a(c, this, yseVar, suf.a(obj))) {
            return false;
        }
        Y0(null);
        Z0(obj);
        T(yseVar, obj);
        return true;
    }

    private final boolean n1(yse yseVar, Throwable th) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        f5k s0 = s0(yseVar);
        if (s0 == null) {
            return false;
        }
        if (!h30.a(c, this, yseVar, new c(s0, false, th))) {
            return false;
        }
        T0(s0, th);
        return true;
    }

    private final Object o1(Object obj, Object obj2) {
        if (!(obj instanceof yse)) {
            return suf.f28281a;
        }
        if ((!(obj instanceof ic8) && !(obj instanceof ruf)) || (obj instanceof ir3) || (obj2 instanceof fa4)) {
            return p1((yse) obj, obj2);
        }
        if (m1((yse) obj, obj2)) {
            return obj2;
        }
        return suf.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p1(tb.yse r7, java.lang.Object r8) {
        /*
            r6 = this;
            tb.f5k r0 = r6.s0(r7)
            if (r0 != 0) goto L_0x0009
            tb.u1r r7 = tb.suf.b
            return r7
        L_0x0009:
            boolean r1 = r7 instanceof kotlinx.coroutines.JobSupport.c
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r1 = r7
            kotlinx.coroutines.JobSupport$c r1 = (kotlinx.coroutines.JobSupport.c) r1
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            if (r1 != 0) goto L_0x001b
            kotlinx.coroutines.JobSupport$c r1 = new kotlinx.coroutines.JobSupport$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001b:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.f()     // Catch: all -> 0x003d
            if (r4 == 0) goto L_0x002b
            tb.u1r r7 = tb.suf.f28281a     // Catch: all -> 0x003d
            monitor-exit(r1)
            return r7
        L_0x002b:
            r4 = 1
            r1.i(r4)     // Catch: all -> 0x003d
            if (r1 == r7) goto L_0x003f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.JobSupport.c     // Catch: all -> 0x003d
            boolean r4 = tb.h30.a(r4, r6, r7, r1)     // Catch: all -> 0x003d
            if (r4 != 0) goto L_0x003f
            tb.u1r r7 = tb.suf.b     // Catch: all -> 0x003d
            monitor-exit(r1)
            return r7
        L_0x003d:
            r7 = move-exception
            goto L_0x007a
        L_0x003f:
            java.lang.String r4 = tb.dv6.DEBUG_PROPERTY_NAME     // Catch: all -> 0x003d
            boolean r4 = r1.e()     // Catch: all -> 0x003d
            boolean r5 = r8 instanceof tb.fa4     // Catch: all -> 0x003d
            if (r5 == 0) goto L_0x004d
            r5 = r8
            tb.fa4 r5 = (tb.fa4) r5     // Catch: all -> 0x003d
            goto L_0x004e
        L_0x004d:
            r5 = r2
        L_0x004e:
            if (r5 == 0) goto L_0x0055
            java.lang.Throwable r5 = r5.f19137a     // Catch: all -> 0x003d
            r1.a(r5)     // Catch: all -> 0x003d
        L_0x0055:
            java.lang.Throwable r5 = r1.d()     // Catch: all -> 0x003d
            if (r4 != 0) goto L_0x005c
            r2 = r5
        L_0x005c:
            r3.element = r2     // Catch: all -> 0x003d
            tb.xhv r3 = tb.xhv.INSTANCE     // Catch: all -> 0x003d
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0066
            r6.T0(r0, r2)
        L_0x0066:
            tb.ir3 r7 = r6.a0(r7)
            if (r7 == 0) goto L_0x0075
            boolean r7 = r6.q1(r1, r7, r8)
            if (r7 == 0) goto L_0x0075
            tb.u1r r7 = tb.suf.COMPLETING_WAITING_CHILDREN
            return r7
        L_0x0075:
            java.lang.Object r7 = r6.Y(r1, r8)
            return r7
        L_0x007a:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.p1(tb.yse, java.lang.Object):java.lang.Object");
    }

    private final boolean q1(c cVar, ir3 ir3Var, Object obj) {
        while (m.a.e(ir3Var.h, false, false, new b(this, cVar, ir3Var, obj), 1, null) == o5k.INSTANCE) {
            ir3Var = S0(ir3Var);
            if (ir3Var == null) {
                return false;
            }
        }
        return true;
    }

    private final f5k s0(yse yseVar) {
        f5k list = yseVar.getList();
        if (list != null) {
            return list;
        }
        if (yseVar instanceof ic8) {
            return new f5k();
        }
        if (yseVar instanceof ruf) {
            d1((ruf) yseVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + yseVar).toString());
    }

    private final boolean z0(yse yseVar) {
        if (!(yseVar instanceof c) || !((c) yseVar).e()) {
            return false;
        }
        return true;
    }

    public final boolean A0() {
        return !(v0() instanceof yse);
    }

    @Override // kotlinx.coroutines.m
    public final hr3 B0(jr3 jr3Var) {
        rr7 e2 = m.a.e(this, true, false, new ir3(jr3Var), 2, null);
        ckf.e(e2, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (hr3) e2;
    }

    @Override // tb.vql
    public CancellationException C0() {
        Throwable th;
        Object v0 = v0();
        CancellationException cancellationException = null;
        if (v0 instanceof c) {
            th = ((c) v0).d();
        } else if (v0 instanceof fa4) {
            th = ((fa4) v0).f19137a;
        } else if (!(v0 instanceof yse)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + v0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            return new JobCancellationException("Parent job is ".concat(i1(v0)), th, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.m
    public final rr7 D0(g1a<? super Throwable, xhv> g1aVar) {
        return F(false, true, g1aVar);
    }

    @Override // kotlinx.coroutines.m
    public final rr7 F(boolean z, boolean z2, g1a<? super Throwable, xhv> g1aVar) {
        fa4 fa4Var;
        ruf Q0 = Q0(g1aVar, z);
        while (true) {
            Object v0 = v0();
            if (v0 instanceof ic8) {
                ic8 ic8Var = (ic8) v0;
                if (!ic8Var.isActive()) {
                    c1(ic8Var);
                } else if (h30.a(c, this, v0, Q0)) {
                    return Q0;
                }
            } else {
                Throwable th = null;
                if (v0 instanceof yse) {
                    f5k list = ((yse) v0).getList();
                    if (list == null) {
                        ckf.e(v0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        d1((ruf) v0);
                    } else {
                        rr7 rr7Var = o5k.INSTANCE;
                        if (z && (v0 instanceof c)) {
                            synchronized (v0) {
                                try {
                                    th = ((c) v0).d();
                                    if (th != null) {
                                        if ((g1aVar instanceof ir3) && !((c) v0).f()) {
                                        }
                                        xhv xhvVar = xhv.INSTANCE;
                                    }
                                    if (D(v0, list, Q0)) {
                                        if (th == null) {
                                            return Q0;
                                        }
                                        rr7Var = Q0;
                                        xhv xhvVar2 = xhv.INSTANCE;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                g1aVar.invoke(th);
                            }
                            return rr7Var;
                        } else if (D(v0, list, Q0)) {
                            return Q0;
                        }
                    }
                } else {
                    if (z2) {
                        if (v0 instanceof fa4) {
                            fa4Var = (fa4) v0;
                        } else {
                            fa4Var = null;
                        }
                        if (fa4Var != null) {
                            th = fa4Var.f19137a;
                        }
                        g1aVar.invoke(th);
                    }
                    return o5k.INSTANCE;
                }
            }
        }
    }

    public final boolean F0() {
        return v0() instanceof fa4;
    }

    public boolean G0() {
        return false;
    }

    public final Object H(ar4<Object> ar4Var) {
        Object v0;
        Throwable i;
        do {
            v0 = v0();
            if (!(v0 instanceof yse)) {
                if (!(v0 instanceof fa4)) {
                    return suf.b(v0);
                }
                Throwable th = ((fa4) v0).f19137a;
                if (!dv6.c()) {
                    throw th;
                } else if (!(ar4Var instanceof vu4)) {
                    throw th;
                } else {
                    i = rgq.i(th, (vu4) ar4Var);
                    throw i;
                }
            }
        } while (h1(v0) < 0);
        return I(ar4Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void J() {
        a(null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean K(Throwable th) {
        Throwable th2;
        if (th != null) {
            th2 = k1(this, th, null, 1, null);
        } else {
            th2 = new JobCancellationException(R(), null, this);
        }
        O(th2);
        return true;
    }

    public final boolean M(Throwable th) {
        return N(th);
    }

    public final boolean N(Object obj) {
        Object obj2;
        u1r u1rVar = suf.f28281a;
        if (p0()) {
            obj2 = P(obj);
            if (obj2 == suf.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } else {
            obj2 = u1rVar;
        }
        if (obj2 == u1rVar) {
            obj2 = N0(obj);
        }
        if (obj2 == u1rVar || obj2 == suf.COMPLETING_WAITING_CHILDREN) {
            return true;
        }
        if (obj2 == suf.c) {
            return false;
        }
        G(obj2);
        return true;
    }

    public void O(Throwable th) {
        N(th);
    }

    public final boolean O0(Object obj) {
        Object o1;
        do {
            o1 = o1(v0(), obj);
            if (o1 == suf.f28281a) {
                return false;
            }
            if (o1 == suf.COMPLETING_WAITING_CHILDREN) {
                return true;
            }
        } while (o1 == suf.b);
        G(o1);
        return true;
    }

    public final Object P0(Object obj) {
        Object o1;
        do {
            o1 = o1(v0(), obj);
            if (o1 == suf.f28281a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, j0(obj));
            }
        } while (o1 == suf.b);
        return o1;
    }

    public String R() {
        return "Job was cancelled";
    }

    public String R0() {
        return ov6.a(this);
    }

    public boolean S(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!N(th) || !l0()) {
            return false;
        }
        return true;
    }

    public final JobCancellationException W(String str, Throwable th) {
        if (str == null) {
            str = R();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // kotlinx.coroutines.m
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        O(cancellationException);
    }

    public final sbp<m> b0() {
        return wbp.b(new JobSupport$children$1(this, null));
    }

    public final Object d0() {
        Object v0 = v0();
        if (v0 instanceof yse) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(v0 instanceof fa4)) {
            return suf.b(v0);
        } else {
            throw ((fa4) v0).f19137a;
        }
    }

    public final Throwable e0() {
        Object v0 = v0();
        if (v0 instanceof c) {
            Throwable d2 = ((c) v0).d();
            if (d2 != null) {
                return d2;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (v0 instanceof yse) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (v0 instanceof fa4) {
            return ((fa4) v0).f19137a;
        } else {
            return null;
        }
    }

    @Override // kotlinx.coroutines.m
    public final Object f0(ar4<? super xhv> ar4Var) {
        if (!H0()) {
            quf.f(ar4Var.getContext());
            return xhv.INSTANCE;
        }
        Object I0 = I0(ar4Var);
        if (I0 == dkf.d()) {
            return I0;
        }
        return xhv.INSTANCE;
    }

    public final void f1(ruf rufVar) {
        Object v0;
        do {
            v0 = v0();
            if (v0 instanceof ruf) {
                if (v0 != rufVar) {
                    return;
                }
            } else if ((v0 instanceof yse) && ((yse) v0).getList() != null) {
                rufVar.l();
                return;
            } else {
                return;
            }
        } while (!h30.a(c, this, v0, suf.f));
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
        return (R) m.a.c(this, r, u1aVar);
    }

    public final boolean g0() {
        Object v0 = v0();
        if (!(v0 instanceof fa4) || !((fa4) v0).a()) {
            return false;
        }
        return true;
    }

    public final void g1(hr3 hr3Var) {
        d.set(this, hr3Var);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        return (E) m.a.d(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return m.Key;
    }

    @Override // kotlinx.coroutines.m
    public m getParent() {
        hr3 t0 = t0();
        if (t0 != null) {
            return t0.getParent();
        }
        return null;
    }

    public final Throwable h0() {
        Object v0 = v0();
        if (!(v0 instanceof yse)) {
            return j0(v0);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // kotlinx.coroutines.m
    public boolean isActive() {
        Object v0 = v0();
        if (!(v0 instanceof yse) || !((yse) v0).isActive()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.m
    public final boolean isCancelled() {
        Object v0 = v0();
        if ((v0 instanceof fa4) || ((v0 instanceof c) && ((c) v0).e())) {
            return true;
        }
        return false;
    }

    public final CancellationException j1(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = R();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public boolean l0() {
        return true;
    }

    public final String l1() {
        return R0() + '{' + i1(v0()) + '}';
    }

    public final f9p<?> m0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.INSTANCE;
        ckf.e(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(jobSupport$onAwaitInternal$1, 3);
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.INSTANCE;
        ckf.e(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        kqu.e(jobSupport$onAwaitInternal$2, 3);
        return new g9p(this, jobSupport$onAwaitInternal$1, jobSupport$onAwaitInternal$2, null, 8, null);
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return m.a.f(this, cVar);
    }

    @Override // tb.jr3
    public final void n0(vql vqlVar) {
        N(vqlVar);
    }

    public boolean p0() {
        return false;
    }

    @Override // kotlin.coroutines.d
    public kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return m.a.g(this, dVar);
    }

    public final d9p q0() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.INSTANCE;
        ckf.e(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(jobSupport$onJoin$1, 3);
        return new e9p(this, jobSupport$onJoin$1, null, 4, null);
    }

    @Override // kotlinx.coroutines.m
    public final boolean start() {
        int h1;
        do {
            h1 = h1(v0());
            if (h1 == 0) {
                return false;
            }
        } while (h1 != 1);
        return true;
    }

    public final hr3 t0() {
        return (hr3) d.get(this);
    }

    public String toString() {
        return l1() + '@' + ov6.b(this);
    }

    @Override // kotlinx.coroutines.m
    public final CancellationException u0() {
        Object v0 = v0();
        if (v0 instanceof c) {
            Throwable d2 = ((c) v0).d();
            if (d2 != null) {
                return j1(d2, ov6.a(this).concat(" is cancelling"));
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (v0 instanceof yse) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (v0 instanceof fa4) {
            return k1(this, ((fa4) v0).f19137a, null, 1, null);
        } else {
            return new JobCancellationException(ov6.a(this).concat(" has completed normally"), null, this);
        }
    }

    public final Object v0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof rxk)) {
                return obj;
            }
            ((rxk) obj).a(this);
        }
    }

    public boolean w0(Throwable th) {
        return false;
    }

    public final void y0(m mVar) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        if (mVar == null) {
            g1(o5k.INSTANCE);
            return;
        }
        mVar.start();
        hr3 B0 = mVar.B0(this);
        g1(B0);
        if (A0()) {
            B0.dispose();
            g1(o5k.INSTANCE);
        }
    }

    public static /* synthetic */ void o0() {
    }

    public static /* synthetic */ void r0() {
    }

    public void a1() {
    }

    public void G(Object obj) {
    }

    public void Y0(Throwable th) {
    }

    public void Z0(Object obj) {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public m b1(m mVar) {
        return mVar;
    }

    public void x0(Throwable th) {
        throw th;
    }
}
