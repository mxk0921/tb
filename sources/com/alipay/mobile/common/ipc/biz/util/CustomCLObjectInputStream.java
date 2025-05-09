package com.alipay.mobile.common.ipc.biz.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CustomCLObjectInputStream extends ObjectInputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f3931a;

    public CustomCLObjectInputStream() {
    }

    public static /* synthetic */ Object ipc$super(CustomCLObjectInputStream customCLObjectInputStream, String str, Object... objArr) {
        if (str.hashCode() == 1072899230) {
            return super.resolveClass((ObjectStreamClass) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/ipc/biz/util/CustomCLObjectInputStream");
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3ff3249e", new Object[]{this, objectStreamClass});
        }
        try {
            return super.resolveClass(objectStreamClass);
        } catch (Exception e) {
            Log.e("MyObjectInputStream", "", e);
            return Class.forName(objectStreamClass.getName(), true, this.f3931a);
        }
    }

    public CustomCLObjectInputStream(InputStream inputStream, ClassLoader classLoader) {
        super(inputStream);
        this.f3931a = classLoader;
    }
}
