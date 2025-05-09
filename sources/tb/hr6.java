package tb;

import com.alipay.birdnest.platform.ConnectionUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class hr6<Ret, Arg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final hr6<String, Void> f20835a = new a();
    public static final hr6<byte[], Void> b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends hr6<String, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/support/basics/DataObjProcessor$1");
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String a(File file, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r6});
            }
            jst.a();
            return ConnectionUtils.b(fua.e(file));
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String c(String str, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r6});
            }
            return str;
        }

        @Override // tb.hr6
        public /* bridge */ /* synthetic */ String d(String str, Void r2, Throwable th) {
            return null;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.lang.String] */
        @Override // tb.hr6
        public String e(byte[] bArr, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r6});
            }
            return ConnectionUtils.b(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b extends hr6<byte[], Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/support/basics/DataObjProcessor$2");
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, byte[]] */
        @Override // tb.hr6
        public byte[] a(File file, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c2b7697", new Object[]{this, file, r6});
            }
            jst.a();
            return fua.e(file);
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, byte[]] */
        @Override // tb.hr6
        public byte[] c(String str, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, r6});
            }
            return ConnectionUtils.a(str);
        }

        @Override // tb.hr6
        public /* bridge */ /* synthetic */ byte[] d(String str, Void r2, Throwable th) {
            return null;
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, byte[]] */
        @Override // tb.hr6
        public byte[] e(byte[] bArr, Void r6) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("7b9ded47", new Object[]{this, bArr, r6});
            }
            return bArr;
        }
    }

    public abstract Ret a(File file, Arg arg) throws Throwable;

    public Ret b(Object obj, Arg arg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Ret) ipChange.ipc$dispatch("218a0212", new Object[]{this, obj, arg});
        }
        try {
            if (obj instanceof byte[]) {
                return e((byte[]) obj, arg);
            }
            if (obj instanceof String) {
                return c((String) obj, arg);
            }
            if (obj instanceof File) {
                return a((File) obj, arg);
            }
            return d("can't handle " + obj.getClass(), arg, new RuntimeException());
        } catch (Throwable th) {
            return d("exception on " + obj.getClass(), arg, th);
        }
    }

    public abstract Ret c(String str, Arg arg) throws Throwable;

    public abstract Ret d(String str, Arg arg, Throwable th);

    public abstract Ret e(byte[] bArr, Arg arg) throws Throwable;
}
