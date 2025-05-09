package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class t87 implements b2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Method> f28565a = new LruCache<>(64);
    public static final LruCache<String, String> b = new LruCache<>(16);
    public static final LruCache<String, Field> c = new LruCache<>(32);
    public static final LruCache<String, String> d = new LruCache<>(16);

    static {
        t2o.a(475005005);
        t2o.a(475005009);
    }

    @Override // tb.b2w
    public boolean a(Object obj, Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180563cc", new Object[]{this, obj, cls, str})).booleanValue();
        }
        return true;
    }

    @Override // tb.b2w
    public Object b(Object obj, Class<?> cls, String str) {
        String str2 = cls.getName() + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 + str;
        LruCache<String, Method> lruCache = f28565a;
        Method method = lruCache.get(str2);
        if (method != null) {
            try {
                return method.invoke(obj, new Object[0]);
            } catch (Exception e) {
                s3a.c(e, new String[0]);
                return null;
            }
        } else {
            LruCache<String, Field> lruCache2 = c;
            Field field = lruCache2.get(str2);
            if (field != null) {
                try {
                    return field.get(obj);
                } catch (Exception e2) {
                    s3a.c(e2, new String[0]);
                    return null;
                }
            } else {
                LruCache<String, String> lruCache3 = b;
                if (lruCache3.get(str2) != "") {
                    try {
                        try {
                            Method method2 = cls.getMethod("get" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]);
                            lruCache.put(str2, method2);
                            return method2.invoke(obj, new Object[0]);
                        } catch (NoSuchMethodException unused) {
                            Method method3 = cls.getMethod("is" + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]);
                            lruCache.put(str2, method3);
                            return method3.invoke(obj, new Object[0]);
                        } catch (Exception e3) {
                            s3a.c(e3, new String[0]);
                            return null;
                        }
                    } catch (NoSuchMethodException unused2) {
                        lruCache3.put(str2, "");
                    } catch (Exception e4) {
                        s3a.c(e4, new String[0]);
                        return null;
                    }
                }
                LruCache<String, String> lruCache4 = d;
                if (lruCache4.get(str2) != "") {
                    try {
                        Field field2 = cls.getField(str);
                        lruCache2.put(str2, field2);
                        return field2.get(obj);
                    } catch (NoSuchFieldException unused3) {
                        lruCache4.put(str2, "");
                    } catch (Exception e5) {
                        s3a.c(e5, new String[0]);
                        return null;
                    }
                }
                return null;
            }
        }
    }
}
