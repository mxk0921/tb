package kotlin.reflect;

import com.taobao.media.MediaConstant;
import java.lang.reflect.Type;
import tb.acp;
import tb.dcp;
import tb.sbp;
import tb.tsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class TypesJVMKt {
    public static final String b(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        sbp f = acp.f(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
        return ((Class) dcp.t(f)).getName() + tsq.A(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264, dcp.m(f));
    }
}
