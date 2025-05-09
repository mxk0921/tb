package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx_v4.loader.DXLoaderException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597914);
    }

    public static Object a(gh5 gh5Var, lg5 lg5Var, byte b) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ce6df7d7", new Object[]{gh5Var, lg5Var, new Byte(b)});
        }
        switch (b) {
            case 0:
                return uw5.V();
            case 1:
                return Integer.valueOf(lg5Var.h());
            case 2:
                return Long.valueOf(lg5Var.i());
            case 3:
                return Double.valueOf(lg5Var.f());
            case 4:
                byte e = lg5Var.e();
                if (e == 1) {
                    return null;
                }
                if (e == 0) {
                    return gh5Var.b(lg5Var.h());
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_STRING load null flag error： ");
            case 5:
            case 6:
            case 7:
            case 10:
            case 14:
            default:
                throw new DXLoaderException("不认识的变量类型 ：fieldType： " + ((int) b));
            case 8:
                byte e2 = lg5Var.e();
                if (e2 == 1) {
                    return null;
                }
                if (e2 == 0) {
                    throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST is not null ");
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_LIST load null flag error： ");
            case 9:
                byte e3 = lg5Var.e();
                if (e3 == 1) {
                    return null;
                }
                if (e3 == 0) {
                    throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP is not null ");
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_MAP load null flag error： ");
            case 11:
                byte e4 = lg5Var.e();
                if (e4 == 1) {
                    return null;
                }
                if (e4 == 0) {
                    return Integer.valueOf(lg5Var.h());
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： ");
            case 12:
                byte e5 = lg5Var.e();
                if (e5 == 1) {
                    return null;
                }
                if (e5 == 0) {
                    return Long.valueOf(lg5Var.i());
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_LONG_WRAP load null flag error： ");
            case 13:
                byte e6 = lg5Var.e();
                if (e6 == 1) {
                    return null;
                }
                if (e6 == 0) {
                    return Double.valueOf(lg5Var.f());
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_DOUBLE_WRAP load null flag error： ");
            case 15:
                if (lg5Var.e() != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                byte e7 = lg5Var.e();
                if (e7 == 1) {
                    return null;
                }
                if (e7 == 0) {
                    if (lg5Var.e() != 1) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_INT_WRAP load null flag error： ");
            case 17:
                return Float.valueOf(lg5Var.g());
            case 18:
                byte e8 = lg5Var.e();
                if (e8 == 1) {
                    return null;
                }
                if (e8 == 0) {
                    return Float.valueOf(lg5Var.g());
                }
                throw new DXLoaderException("DXVariableSectionLoader TYPE_FLOAT_WRAP load null flag error： ");
        }
    }
}
