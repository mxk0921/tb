package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lpf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final dqf f23487a;
    public final Map<String, oqf> b = new HashMap();
    public final Map<String, Object> c = new HashMap();
    public final Map<Object, e> d = new WeakHashMap();
    public final Map<e, Object> e = new WeakHashMap();
    public iit f = null;
    public final Map<Class, iit> g = new HashMap();
    public final Map<Class, iit> h = new HashMap();
    public final List<wa7> i = new ArrayList();
    public boolean j = true;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public boolean n = true;
    public boolean o = false;
    public Class<? extends Annotation> p = null;
    public boolean q = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Class b;
        public final Object e;

        static {
            t2o.a(921698308);
        }

        public a(Object obj) {
            this.e = obj;
            this.b = obj.getClass().getComponentType();
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$a");
        }

        @Override // tb.ypf
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.e.toString();
        }

        @Override // tb.ypf
        public final void onDetached() {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fa39278", new Object[]{this});
            } else if (!lpf.g(lpf.this) && (eVar = (e) lpf.h(lpf.this).remove(this.e)) != null) {
                eVar.a(false);
                lpf.i(lpf.this).remove(eVar);
            }
        }

        @Override // tb.ypf
        public final ksf onGetIndexedProperty(dqf dqfVar, ksf ksfVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("2cc63a14", new Object[]{this, dqfVar, ksfVar, new Integer(i)});
            }
            ksfVar.delete();
            try {
                return lpf.this.D(dqfVar, Array.get(this.e, i));
            } catch (Throwable th) {
                lpf.j(dqfVar, "Get array element at " + i + " failed: " + th.toString(), th);
                return null;
            }
        }

        @Override // tb.ypf
        public final ksf onSetIndexedProperty(dqf dqfVar, ksf ksfVar, int i, ksf ksfVar2) {
            Object obj;
            Throwable th;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("55590f4f", new Object[]{this, dqfVar, ksfVar, new Integer(i), ksfVar2});
            }
            ksfVar.delete();
            Class cls = this.b;
            if (cls != null) {
                lpf lpfVar = lpf.this;
                if (lpf.l(lpfVar, cls, lpf.k(lpfVar, dqfVar, ksfVar2))) {
                    try {
                        obj = lpf.this.F(dqfVar, ksfVar2);
                        try {
                            Array.set(this.e, i, obj);
                            return ksfVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            ksfVar2.delete();
                            if (obj instanceof ksf) {
                                ((ksf) obj).delete();
                            }
                            lpf.j(dqfVar, "Set array element at " + i + " failed: " + th.toString(), th);
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = null;
                    }
                }
            }
            ksfVar2.delete();
            lpf.a(dqfVar, "Set a mismatch value type into array at index " + i);
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23488a;
        public final Class b;
        public final Object c = a0y.a();

        static {
            t2o.a(921698309);
        }

        public b(String str, Class cls) {
            this.f23488a = str;
            this.b = cls;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$b");
        }

        @Override // tb.ypf
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.f23488a;
        }

        @Override // tb.ypf
        public final ksf onCallFunction(jb1 jb1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            return lpf.n(lpf.this, jb1Var, this.b, null, this.c);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tb.ksf onGetProperty(tb.dqf r5, tb.ksf r6, java.lang.String r7) {
            /*
                r4 = this;
                r0 = 0
                java.lang.Class r1 = r4.b     // Catch: NoSuchFieldException -> 0x000c
                java.lang.reflect.Field r1 = r1.getField(r7)     // Catch: NoSuchFieldException -> 0x000c
                r2 = 1
                r1.setAccessible(r2)     // Catch: NoSuchFieldException -> 0x000d
                goto L_0x001e
            L_0x000c:
                r1 = r0
            L_0x000d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found static property "
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                tb.lpf.a(r5, r2)
            L_0x001e:
                if (r1 == 0) goto L_0x0064
                int r2 = r1.getModifiers()
                r3 = 9
                r2 = r2 & r3
                if (r2 == r3) goto L_0x003b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "No static property named "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                tb.lpf.a(r5, r7)
                goto L_0x0064
            L_0x003b:
                java.lang.Object r1 = r1.get(r0)     // Catch: all -> 0x0046
                tb.lpf r2 = tb.lpf.this     // Catch: all -> 0x0046
                tb.ksf r0 = r2.D(r5, r1)     // Catch: all -> 0x0046
                goto L_0x0064
            L_0x0046:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Get static property '"
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r7 = "' failed: "
                r2.append(r7)
                java.lang.String r7 = r1.toString()
                r2.append(r7)
                java.lang.String r7 = r2.toString()
                tb.lpf.j(r5, r7, r1)
            L_0x0064:
                r6.delete()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.b.onGetProperty(tb.dqf, tb.ksf, java.lang.String):tb.ksf");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSetProperty(tb.dqf r6, tb.ksf r7, java.lang.String r8, tb.ksf r9) {
            /*
                r5 = this;
                r0 = 0
                java.lang.Class r1 = r5.b     // Catch: NoSuchFieldException -> 0x000c
                java.lang.reflect.Field r1 = r1.getField(r8)     // Catch: NoSuchFieldException -> 0x000c
                r2 = 1
                r1.setAccessible(r2)     // Catch: NoSuchFieldException -> 0x000d
                goto L_0x001e
            L_0x000c:
                r1 = r0
            L_0x000d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found static property "
                r2.<init>(r3)
                r2.append(r8)
                java.lang.String r2 = r2.toString()
                tb.lpf.a(r6, r2)
            L_0x001e:
                if (r1 == 0) goto L_0x0091
                int r2 = r1.getModifiers()
                r3 = 9
                r2 = r2 & r3
                if (r2 == r3) goto L_0x003b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No static property named "
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                tb.lpf.a(r6, r8)
                goto L_0x0091
            L_0x003b:
                java.lang.Class r2 = r1.getType()
                tb.lpf r3 = tb.lpf.this
                java.lang.Class r4 = tb.lpf.k(r3, r6, r9)
                boolean r2 = tb.lpf.l(r3, r2, r4)
                if (r2 == 0) goto L_0x007b
                java.lang.Object r2 = r3.F(r6, r9)
                r1.set(r0, r2)     // Catch: all -> 0x0053
                goto L_0x0091
            L_0x0053:
                r0 = move-exception
                boolean r1 = r2 instanceof tb.ksf
                if (r1 == 0) goto L_0x005d
                tb.ksf r2 = (tb.ksf) r2
                r2.delete()
            L_0x005d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Set static property "
                r1.<init>(r2)
                r1.append(r8)
                java.lang.String r8 = " failed: "
                r1.append(r8)
                java.lang.String r8 = r0.toString()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                tb.lpf.j(r6, r8, r0)
                goto L_0x0091
            L_0x007b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Set a mismatch value type into static property '"
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = "'"
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                tb.lpf.a(r6, r8)
            L_0x0091:
                r7.delete()
                r9.delete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.b.onSetProperty(tb.dqf, tb.ksf, java.lang.String, tb.ksf):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23489a;
        public final Class b;

        static {
            t2o.a(921698310);
        }

        public c(String str, Class cls) {
            this.f23489a = str;
            this.b = cls;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$c");
        }

        @Override // tb.ypf
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.f23489a;
        }

        @Override // tb.ypf
        public final ksf onCallFunction(jb1 jb1Var) {
            String str;
            Object[] objArr;
            dqf d = jb1Var.d();
            boolean f = jb1Var.f();
            String str2 = this.f23489a;
            if (!f) {
                lpf.a(d, "Java constructor '" + str2 + "' can not be called as a function!");
                return null;
            }
            Class cls = this.b;
            boolean isInterface = cls.isInterface();
            lpf lpfVar = lpf.this;
            if (isInterface) {
                if (jb1Var.b() == 1) {
                    ksf c = jb1Var.c(0);
                    if (c instanceof yrf) {
                        return lpfVar.D(d, d.l().b((yrf) c, cls));
                    }
                    if (c != null) {
                        c.delete();
                    }
                }
                lpf.a(d, "Java interface constructor " + str2 + " only accept one JSObject argument!");
                return null;
            }
            Constructor<?>[] constructors = cls.getConstructors();
            Class[] b = lpf.b(lpfVar, d, jb1Var);
            for (Constructor<?> constructor : constructors) {
                if ((constructor.getModifiers() & 1) != 0 && ((lpf.c(lpfVar) == null || constructor.isAnnotationPresent(lpf.c(lpfVar))) && lpf.d(lpfVar, constructor.getParameterTypes(), b))) {
                    int length = b.length;
                    if (length > 0) {
                        objArr = new Object[length];
                        for (int i = 0; i < length; i++) {
                            ksf c2 = jb1Var.c(i);
                            objArr[i] = lpfVar.F(d, c2);
                            c2.delete();
                        }
                    } else {
                        objArr = null;
                    }
                    try {
                        return lpf.e(lpfVar, d, constructor.newInstance(objArr));
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        while (th2.getCause() != null) {
                            th2 = th2.getCause();
                        }
                        lpf.j(d, "Java constructor occurs exception: " + th2.toString(), th);
                        return null;
                    }
                }
            }
            StringBuilder sb = new StringBuilder("Can not found a matched constructor for '");
            sb.append(str2);
            sb.append("' with ");
            sb.append(jb1Var.b());
            sb.append(" argument");
            if (jb1Var.b() > 1) {
                str = "s ";
            } else {
                str = " ";
            }
            sb.append(str);
            sb.append(lpf.f(b));
            lpf.a(d, sb.toString());
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d extends OutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f23490a;

        static {
            t2o.a(921698311);
        }

        public d() {
            this.f23490a = new StringBuilder();
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$d");
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7403add", new Object[]{this, new Integer(i)});
            } else {
                this.f23490a.append(i);
            }
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            } else {
                this.f23490a.append((CharSequence) new String(bArr, i, i2), i, i2);
            }
        }

        public /* synthetic */ d(byte b) {
            this();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10cfa82d", new Object[]{this, bArr});
            } else {
                this.f23490a.append(new String(bArr));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final dqf f23491a;
        public nsf b;

        static {
            t2o.a(921698312);
        }

        public e(dqf dqfVar, yrf yrfVar) {
            this.f23491a = dqfVar;
            this.b = yrfVar.v(dqfVar);
        }

        public final boolean a(boolean z) {
            ksf a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            nsf nsfVar = this.b;
            if (nsfVar == null) {
                return false;
            }
            this.b = null;
            if (z && (a2 = nsfVar.a(this.f23491a)) != null) {
                if (a2 instanceof yrf) {
                    ((yrf) a2).w(this.f23491a);
                }
                a2.delete();
            }
            nsfVar.delete();
            return true;
        }

        public final void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            nsf nsfVar = this.b;
            if (nsfVar != null) {
                lpf.this.H(nsfVar);
                this.b = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class f extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Class b;
        public final Object e;

        static {
            t2o.a(921698313);
        }

        public f(Object obj) {
            this.e = obj;
            this.b = obj.getClass();
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$f");
        }

        @Override // tb.ypf
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.e.toString();
        }

        @Override // tb.ypf
        public final void onDetached() {
            e eVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fa39278", new Object[]{this});
            } else if (!lpf.g(lpf.this) && (eVar = (e) lpf.h(lpf.this).remove(this.e)) != null) {
                eVar.a(false);
                lpf.i(lpf.this).remove(eVar);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tb.ksf onGetProperty(tb.dqf r6, tb.ksf r7, java.lang.String r8) {
            /*
                r5 = this;
                r7.delete()
                r7 = 0
                java.lang.Object r0 = r5.e
                if (r0 != 0) goto L_0x001a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Java object has been detached while getting "
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                tb.lpf.a(r6, r8)
                return r7
            L_0x001a:
                r1 = 1
                java.lang.Class r2 = r5.b     // Catch: NoSuchFieldException -> 0x0025
                java.lang.reflect.Field r2 = r2.getField(r8)     // Catch: NoSuchFieldException -> 0x0025
                r2.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x0026
                goto L_0x0037
            L_0x0025:
                r2 = r7
            L_0x0026:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Not found property "
                r3.<init>(r4)
                r3.append(r8)
                java.lang.String r3 = r3.toString()
                tb.lpf.a(r6, r3)
            L_0x0037:
                if (r2 == 0) goto L_0x007c
                int r3 = r2.getModifiers()
                r3 = r3 & 9
                if (r3 == r1) goto L_0x0053
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No property named "
                r0.<init>(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                tb.lpf.a(r6, r8)
                goto L_0x007c
            L_0x0053:
                java.lang.Object r0 = r2.get(r0)     // Catch: all -> 0x005e
                tb.lpf r1 = tb.lpf.this     // Catch: all -> 0x005e
                tb.ksf r7 = r1.D(r6, r0)     // Catch: all -> 0x005e
                goto L_0x007c
            L_0x005e:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Get property "
                r1.<init>(r2)
                r1.append(r8)
                java.lang.String r8 = " failed: "
                r1.append(r8)
                java.lang.String r8 = r0.toString()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                tb.lpf.j(r6, r8, r0)
            L_0x007c:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.f.onGetProperty(tb.dqf, tb.ksf, java.lang.String):tb.ksf");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSetProperty(tb.dqf r5, tb.ksf r6, java.lang.String r7, tb.ksf r8) {
            /*
                r4 = this;
                r6.delete()
                java.lang.Object r6 = r4.e
                if (r6 != 0) goto L_0x001c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Java object has been detached while setting "
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                tb.lpf.a(r5, r6)
                r8.delete()
                return
            L_0x001c:
                r0 = 1
                java.lang.Class r1 = r4.b     // Catch: NoSuchFieldException -> 0x0027
                java.lang.reflect.Field r1 = r1.getField(r7)     // Catch: NoSuchFieldException -> 0x0027
                r1.setAccessible(r0)     // Catch: NoSuchFieldException -> 0x0028
                goto L_0x0039
            L_0x0027:
                r1 = 0
            L_0x0028:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Not found property "
                r2.<init>(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                tb.lpf.a(r5, r2)
            L_0x0039:
                if (r1 == 0) goto L_0x00ab
                int r2 = r1.getModifiers()
                r2 = r2 & 9
                if (r2 == r0) goto L_0x0055
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "No property named "
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                tb.lpf.a(r5, r6)
                goto L_0x00ab
            L_0x0055:
                java.lang.Class r0 = r1.getType()
                tb.lpf r2 = tb.lpf.this
                java.lang.Class r3 = tb.lpf.k(r2, r5, r8)
                boolean r0 = tb.lpf.l(r2, r0, r3)
                if (r0 == 0) goto L_0x0095
                java.lang.Object r0 = r2.F(r5, r8)
                r1.set(r6, r0)     // Catch: all -> 0x006d
                goto L_0x00ab
            L_0x006d:
                r6 = move-exception
                boolean r1 = r0 instanceof tb.ksf
                if (r1 == 0) goto L_0x0077
                tb.ksf r0 = (tb.ksf) r0
                r0.delete()
            L_0x0077:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Set property "
                r0.<init>(r1)
                r0.append(r7)
                java.lang.String r7 = " failed: "
                r0.append(r7)
                java.lang.String r7 = r6.toString()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                tb.lpf.j(r5, r7, r6)
                goto L_0x00ab
            L_0x0095:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Set a mismatch value type into property '"
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r7 = "'"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                tb.lpf.a(r5, r6)
            L_0x00ab:
                r8.delete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.f.onSetProperty(tb.dqf, tb.ksf, java.lang.String, tb.ksf):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class g extends ypf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f23492a;
        public final Class b;
        public final Object c = a0y.a();

        static {
            t2o.a(921698314);
        }

        public g(String str, Class cls) {
            this.f23492a = str;
            this.b = cls;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/J2JHelper$g");
        }

        @Override // tb.ypf
        public final String getIdentifier() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b1733ba", new Object[]{this});
            }
            return this.f23492a;
        }

        @Override // tb.ypf
        public final ksf onCallFunction(jb1 jb1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ksf) ipChange.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
            }
            dqf d = jb1Var.d();
            ksf g = jb1Var.g();
            Object m = lpf.m(lpf.this, d, g, false);
            if (m == null) {
                g.delete();
                lpf.a(d, "Can not get java this object while calling '" + jb1Var.e() + "', it may be detached");
                return null;
            }
            ksf n = lpf.n(lpf.this, jb1Var, m.getClass(), m, this.c);
            g.delete();
            return n;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tb.ksf onGetProperty(tb.dqf r4, tb.ksf r5, java.lang.String r6) {
            /*
                r3 = this;
                r5.delete()
                r5 = 0
                java.lang.Class r0 = r3.b     // Catch: NoSuchFieldException -> 0x000f
                java.lang.reflect.Field r0 = r0.getField(r6)     // Catch: NoSuchFieldException -> 0x000f
                r1 = 1
                r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x0010
                goto L_0x0021
            L_0x000f:
                r0 = r5
            L_0x0010:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Not found static property "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                tb.lpf.a(r4, r1)
            L_0x0021:
                if (r0 == 0) goto L_0x0067
                int r1 = r0.getModifiers()
                r2 = 9
                r1 = r1 & r2
                if (r1 == r2) goto L_0x003e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "No static property named "
                r0.<init>(r1)
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                tb.lpf.a(r4, r6)
                goto L_0x0067
            L_0x003e:
                java.lang.Object r0 = r0.get(r5)     // Catch: all -> 0x0049
                tb.lpf r1 = tb.lpf.this     // Catch: all -> 0x0049
                tb.ksf r5 = r1.D(r4, r0)     // Catch: all -> 0x0049
                goto L_0x0067
            L_0x0049:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Get static property "
                r1.<init>(r2)
                r1.append(r6)
                java.lang.String r6 = " failed: "
                r1.append(r6)
                java.lang.String r6 = r0.toString()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                tb.lpf.j(r4, r6, r0)
            L_0x0067:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.g.onGetProperty(tb.dqf, tb.ksf, java.lang.String):tb.ksf");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // tb.ypf
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onSetProperty(tb.dqf r5, tb.ksf r6, java.lang.String r7, tb.ksf r8) {
            /*
                r4 = this;
                r6.delete()
                r6 = 0
                java.lang.Class r0 = r4.b     // Catch: NoSuchFieldException -> 0x000f
                java.lang.reflect.Field r0 = r0.getField(r7)     // Catch: NoSuchFieldException -> 0x000f
                r1 = 1
                r0.setAccessible(r1)     // Catch: NoSuchFieldException -> 0x0010
                goto L_0x0021
            L_0x000f:
                r0 = r6
            L_0x0010:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Not found static property "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r1 = r1.toString()
                tb.lpf.a(r5, r1)
            L_0x0021:
                if (r0 == 0) goto L_0x0094
                int r1 = r0.getModifiers()
                r2 = 9
                r1 = r1 & r2
                if (r1 == r2) goto L_0x003e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "No static property named "
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                tb.lpf.a(r5, r6)
                goto L_0x0094
            L_0x003e:
                java.lang.Class r1 = r0.getType()
                tb.lpf r2 = tb.lpf.this
                java.lang.Class r3 = tb.lpf.k(r2, r5, r8)
                boolean r1 = tb.lpf.l(r2, r1, r3)
                if (r1 == 0) goto L_0x007e
                java.lang.Object r1 = r2.F(r5, r8)
                r0.set(r6, r1)     // Catch: all -> 0x0056
                goto L_0x0094
            L_0x0056:
                r6 = move-exception
                boolean r0 = r1 instanceof tb.ksf
                if (r0 == 0) goto L_0x0060
                tb.ksf r1 = (tb.ksf) r1
                r1.delete()
            L_0x0060:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Set static property "
                r0.<init>(r1)
                r0.append(r7)
                java.lang.String r7 = " failed: "
                r0.append(r7)
                java.lang.String r7 = r6.toString()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                tb.lpf.j(r5, r7, r6)
                goto L_0x0094
            L_0x007e:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r0 = "Set a mismatch value type into static property '"
                r6.<init>(r0)
                r6.append(r7)
                java.lang.String r7 = "'"
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                tb.lpf.a(r5, r6)
            L_0x0094:
                r8.delete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.lpf.g.onSetProperty(tb.dqf, tb.ksf, java.lang.String, tb.ksf):void");
        }
    }

    static {
        t2o.a(921698307);
    }

    public lpf(dqf dqfVar) {
        this.f23487a = dqfVar;
    }

    public static void N(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bff7e1e5", new Object[]{dqfVar, str});
        } else {
            O(dqfVar, str, null);
        }
    }

    public static void O(dqf dqfVar, String str, Throwable th) {
        ksf e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a386a330", new Object[]{dqfVar, str, th});
            return;
        }
        kqf kqfVar = new kqf(dqfVar, str);
        if (!(th == null || (e2 = kqfVar.e(dqfVar)) == null)) {
            try {
                d dVar = new d((byte) 0);
                th.printStackTrace(new PrintStream(dVar));
                ((yrf) e2).J(dqfVar, "java_stack", new esf(dVar.f23490a.toString()));
            } finally {
                try {
                } finally {
                }
            }
        }
        dqfVar.z(kqfVar);
        kqfVar.delete();
    }

    public static /* synthetic */ void a(dqf dqfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1038f20c", new Object[]{dqfVar, str});
        } else {
            N(dqfVar, str);
        }
    }

    public static /* synthetic */ Class[] b(lpf lpfVar, dqf dqfVar, jb1 jb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("d122c261", new Object[]{lpfVar, dqfVar, jb1Var});
        }
        return lpfVar.A(dqfVar, jb1Var);
    }

    public static /* synthetic */ Class c(lpf lpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f3e80355", new Object[]{lpfVar});
        }
        return lpfVar.p;
    }

    public static /* synthetic */ boolean d(lpf lpfVar, Class[] clsArr, Class[] clsArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fceda97d", new Object[]{lpfVar, clsArr, clsArr2})).booleanValue();
        }
        return lpfVar.J(clsArr, clsArr2);
    }

    public static /* synthetic */ yrf e(lpf lpfVar, dqf dqfVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("967d7d68", new Object[]{lpfVar, dqfVar, obj});
        }
        return lpfVar.C(dqfVar, obj);
    }

    public static /* synthetic */ String f(Class[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1d71e6e", new Object[]{clsArr});
        }
        return o(clsArr);
    }

    public static /* synthetic */ boolean g(lpf lpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c53efbe", new Object[]{lpfVar})).booleanValue();
        }
        return lpfVar.q;
    }

    public static /* synthetic */ Map h(lpf lpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9bf6fd70", new Object[]{lpfVar});
        }
        return lpfVar.d;
    }

    public static /* synthetic */ Map i(lpf lpfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c18b0671", new Object[]{lpfVar});
        }
        return lpfVar.e;
    }

    public static /* synthetic */ void j(dqf dqfVar, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79661404", new Object[]{dqfVar, str, th});
        } else {
            O(dqfVar, str, th);
        }
    }

    public static /* synthetic */ Class k(lpf lpfVar, dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("2bc2c3a1", new Object[]{lpfVar, dqfVar, ksfVar});
        }
        return lpfVar.z(dqfVar, ksfVar);
    }

    public static /* synthetic */ boolean l(lpf lpfVar, Class cls, Class cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c57bb63", new Object[]{lpfVar, cls, cls2})).booleanValue();
        }
        return lpfVar.I(cls, cls2);
    }

    public static /* synthetic */ Object m(lpf lpfVar, dqf dqfVar, ksf ksfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7ebfe10", new Object[]{lpfVar, dqfVar, ksfVar, new Boolean(z)});
        }
        return lpfVar.G(dqfVar, ksfVar, z);
    }

    public static /* synthetic */ ksf n(lpf lpfVar, jb1 jb1Var, Class cls, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("ef9d1754", new Object[]{lpfVar, jb1Var, cls, obj, obj2});
        }
        return lpfVar.K(jb1Var, cls, obj, obj2);
    }

    public static String o(Class[] clsArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bc9dab2", new Object[]{clsArr});
        }
        StringBuilder sb = new StringBuilder(f7l.BRACKET_START_STR);
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Boolean.TYPE) {
                str = "boolean";
            } else if (cls == Integer.TYPE) {
                str = "int";
            } else if (cls == Long.TYPE) {
                str = "long";
            } else if (cls == Double.TYPE) {
                str = "double";
            } else if (cls == String.class) {
                str = pg1.ATOM_String;
            } else if (cls == Void.TYPE) {
                str = "Object";
            } else if (cls == Class.class) {
                str = "Class";
            } else if (cls != null) {
                str = cls.getName();
            } else {
                str = "<unsupported>";
            }
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(f7l.BRACKET_END_STR);
        return sb.toString();
    }

    public final Class[] A(dqf dqfVar, jb1 jb1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class[]) ipChange.ipc$dispatch("9c18739b", new Object[]{this, dqfVar, jb1Var});
        }
        int b2 = jb1Var.b();
        Class[] clsArr = new Class[b2];
        for (int i = 0; i < b2; i++) {
            ksf c2 = jb1Var.c(i);
            clsArr[i] = z(dqfVar, c2);
            c2.delete();
        }
        return clsArr;
    }

    public void B(Object obj, Class<? extends Annotation> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4193a36a", new Object[]{this, obj, cls});
            return;
        }
        this.p = cls;
        if (obj != null) {
            this.j = a0y.h(obj, "javaSuper", this.j);
            this.k = a0y.h(obj, "javaField", this.k);
            this.l = a0y.h(obj, "javaClass", this.l);
            this.m = a0y.h(obj, "classObject", this.m);
            this.n = a0y.h(obj, "innerClass", this.n);
            this.o = a0y.h(obj, "jsObject", this.o);
        }
    }

    public ksf D(dqf dqfVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("741ae8c1", new Object[]{this, dqfVar, obj});
        }
        return E(dqfVar, obj, true);
    }

    public final ksf E(dqf dqfVar, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("cb59842d", new Object[]{this, dqfVar, obj, new Boolean(z)});
        }
        if (obj == null) {
            return msf.v();
        }
        if (obj instanceof Boolean) {
            return upf.u(((Boolean) obj).booleanValue());
        }
        if (obj instanceof Integer) {
            return new uqf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new uqf(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return new uqf(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return new esf((String) obj);
        }
        if (obj instanceof Class) {
            return u(dqfVar, (Class) obj);
        }
        if (!(obj instanceof ksf)) {
            return C(dqfVar, obj);
        }
        if (z) {
            return ((ksf) obj).d(dqfVar);
        }
        return (ksf) obj;
    }

    public Object F(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fd96caad", new Object[]{this, dqfVar, ksfVar});
        }
        return G(dqfVar, ksfVar, true);
    }

    public final Object G(dqf dqfVar, ksf ksfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cb56a2c3", new Object[]{this, dqfVar, ksfVar, new Boolean(z)});
        }
        if (ksfVar instanceof msf) {
            return null;
        }
        if (ksfVar instanceof upf) {
            return Boolean.valueOf(((upf) ksfVar).v());
        }
        if (ksfVar instanceof uqf) {
            double w = ((uqf) ksfVar).w();
            int i = (int) w;
            if (w == i) {
                return Integer.valueOf(i);
            }
            long j = (long) w;
            if (w == j) {
                return Long.valueOf(j);
            }
            return Double.valueOf(w);
        } else if (ksfVar instanceof esf) {
            return ((esf) ksfVar).u();
        } else {
            if (ksfVar instanceof oqf) {
                ypf O = ((oqf) ksfVar).O(dqfVar);
                if (O instanceof c) {
                    return ((c) O).b;
                }
                if (!this.o) {
                    return null;
                }
                if (z) {
                    return ksfVar.d(dqfVar);
                }
                return ksfVar;
            } else if (ksfVar instanceof yrf) {
                ypf A = ((yrf) ksfVar).A(dqfVar);
                if (A instanceof f) {
                    return ((f) A).e;
                }
                if (A instanceof a) {
                    return ((a) A).e;
                }
                if (!this.o) {
                    return null;
                }
                if (z) {
                    return ksfVar.d(dqfVar);
                }
                return ksfVar;
            } else if (!this.o || !(ksfVar instanceof hsf)) {
                return null;
            } else {
                if (z) {
                    return ksfVar.d(dqfVar);
                }
                return ksfVar;
            }
        }
    }

    public void H(wa7 wa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1908147", new Object[]{this, wa7Var});
        } else if (wa7Var != null) {
            synchronized (this.i) {
                ((ArrayList) this.i).add(wa7Var);
            }
            this.f23487a.k().notifyDeleteUnusedObjects(this.f23487a);
        }
    }

    public final boolean I(Class<?> cls, Class cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1fec270", new Object[]{this, cls, cls2})).booleanValue();
        }
        if (cls2 == null) {
            return false;
        }
        if (cls.isAssignableFrom(cls2)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (cls2 != cls3 && cls2 != Boolean.class) {
            Class cls4 = Integer.TYPE;
            if (cls2 != cls4 && cls2 != Integer.class) {
                Class cls5 = Long.TYPE;
                if (cls2 != cls5 && cls2 != Long.class) {
                    Class cls6 = Double.TYPE;
                    if (cls2 == cls6 || cls2 == Double.class) {
                        if (cls == Double.class || cls == cls6 || cls == Object.class) {
                            return true;
                        }
                        return false;
                    } else if ((cls2 != Void.TYPE && cls2 != Void.class) || cls == cls3 || cls == cls4 || cls == cls5 || cls == cls6 || cls == Byte.TYPE || cls == Character.TYPE || cls == Short.TYPE || cls == Float.TYPE) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (cls == Long.class || cls == cls5 || cls == Double.class || cls == Double.TYPE || cls == Object.class) {
                    return true;
                } else {
                    return false;
                }
            } else if (cls == Integer.class || cls == cls4 || cls == Long.class || cls == Long.TYPE || cls == Double.class || cls == Double.TYPE || cls == Object.class) {
                return true;
            } else {
                return false;
            }
        } else if (cls == Boolean.class || cls == cls3 || cls == Object.class) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean J(Class[] clsArr, Class[] clsArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef8d8f37", new Object[]{this, clsArr, clsArr2})).booleanValue();
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        int i = 0;
        for (Class cls : clsArr2) {
            if (!I(clsArr[i], cls)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        s();
        t();
        r();
        q(this.f23487a);
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723b4e85", new Object[]{this});
            return;
        }
        synchronized (this.i) {
            try {
                if (((ArrayList) this.i).size() >= 30) {
                    Iterator it = ((ArrayList) this.i).iterator();
                    while (it.hasNext()) {
                        ((wa7) it.next()).delete();
                    }
                    ((ArrayList) this.i).clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ksf p(dqf dqfVar, jb1 jb1Var, Method method, Object obj) {
        Object[] objArr;
        int b2 = jb1Var.b();
        if (b2 > 0) {
            objArr = new Object[b2];
            for (int i = 0; i < b2; i++) {
                ksf c2 = jb1Var.c(i);
                objArr[i] = F(dqfVar, c2);
                c2.delete();
            }
        } else {
            objArr = null;
        }
        try {
            method.setAccessible(true);
            Object invoke = method.invoke(obj, objArr);
            if (method.getReturnType() == Void.TYPE) {
                return msf.w();
            }
            return E(dqfVar, invoke, false);
        } catch (Throwable th) {
            Throwable th2 = th;
            while (th2.getCause() != null) {
                th2 = th2.getCause();
            }
            O(dqfVar, "Function " + jb1Var.e() + " occurs exception: " + th2.toString(), th);
            return null;
        }
    }

    public final void q(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153b91e9", new Object[]{this, dqfVar});
            return;
        }
        for (oqf oqfVar : ((HashMap) this.b).values()) {
            ksf D = oqfVar.D(dqfVar);
            if (D != null) {
                if (D instanceof yrf) {
                    ((yrf) D).w(dqfVar);
                }
                D.delete();
            }
            oqfVar.w(dqfVar);
            oqfVar.delete();
        }
        ((HashMap) this.b).clear();
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c4520c", new Object[]{this});
            return;
        }
        this.q = true;
        for (e eVar : ((WeakHashMap) this.e).keySet()) {
            eVar.a(true);
        }
        this.q = false;
        ((WeakHashMap) this.d).clear();
        ((WeakHashMap) this.e).clear();
        ((HashMap) this.c).clear();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d164e1f3", new Object[]{this});
            return;
        }
        iit iitVar = this.f;
        if (iitVar != null) {
            iitVar.delete();
            this.f = null;
        }
        for (iit iitVar2 : ((HashMap) this.g).values()) {
            iitVar2.delete();
        }
        ((HashMap) this.g).clear();
        for (iit iitVar3 : ((HashMap) this.h).values()) {
            iitVar3.delete();
        }
        ((HashMap) this.h).clear();
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09bc57a", new Object[]{this});
            return;
        }
        JSEngine k = this.f23487a.k();
        synchronized (this.i) {
            try {
                if (!((ArrayList) this.i).isEmpty()) {
                    if (k.isDisposed()) {
                        ((ArrayList) this.i).clear();
                        return;
                    }
                    ye8 ye8Var = new ye8(k);
                    try {
                        synchronized (this.i) {
                            Iterator it = ((ArrayList) this.i).iterator();
                            while (it.hasNext()) {
                                ((wa7) it.next()).delete();
                            }
                            ((ArrayList) this.i).clear();
                        }
                    } finally {
                        ye8Var.c();
                    }
                }
            } finally {
            }
        }
    }

    public final oqf u(dqf dqfVar, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("e8ed1f4a", new Object[]{this, dqfVar, cls});
        }
        return v(dqfVar, cls, cls.getName());
    }

    public final String w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("396f7022", new Object[]{this, str});
        }
        return str.substring(str.lastIndexOf(46) + 1);
    }

    public final yrf x(dqf dqfVar, Class cls) {
        Method[] declaredMethods;
        Field[] declaredFields;
        Class<? extends Annotation> cls2;
        Class<? extends Annotation> cls3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("2c960b54", new Object[]{this, dqfVar, cls});
        }
        iit d2 = iit.d(dqfVar.k());
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 9) == 9 && ((cls3 = this.p) == null || method.isAnnotationPresent(cls3))) {
                d2.c(method.getName(), 0);
            }
        }
        if (this.k) {
            for (Field field : cls.getDeclaredFields()) {
                if ((field.getModifiers() & 9) == 9 && ((cls2 = this.p) == null || field.isAnnotationPresent(cls2))) {
                    d2.b(field.getName(), 0);
                }
            }
        }
        yrf f2 = d2.f(dqfVar, new b(cls.getName(), cls));
        d2.delete();
        return f2;
    }

    public final yrf y(dqf dqfVar, Class cls, boolean z, boolean z2) {
        iit iitVar;
        Method[] methodArr;
        Field[] fieldArr;
        Class<? extends Annotation> cls2;
        Class<? extends Annotation> cls3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yrf) ipChange.ipc$dispatch("7509724e", new Object[]{this, dqfVar, cls, new Boolean(z), new Boolean(z2)});
        }
        if (z2) {
            iitVar = (iit) ((HashMap) this.h).get(cls);
        } else {
            iitVar = null;
        }
        if (iitVar == null) {
            iitVar = iit.d(dqfVar.k());
            if (z) {
                methodArr = cls.getMethods();
            } else {
                methodArr = cls.getDeclaredMethods();
            }
            for (Method method : methodArr) {
                if ((method.getModifiers() & 1) == 1 && ((cls3 = this.p) == null || method.isAnnotationPresent(cls3))) {
                    iitVar.c(method.getName(), 0);
                }
            }
            if (this.k) {
                if (z) {
                    fieldArr = cls.getFields();
                } else {
                    fieldArr = cls.getDeclaredFields();
                }
                for (Field field : fieldArr) {
                    if ((field.getModifiers() & 9) == 9 && ((cls2 = this.p) == null || field.isAnnotationPresent(cls2))) {
                        iitVar.b(field.getName(), 0);
                    }
                }
            }
        }
        if (z2) {
            ((HashMap) this.h).put(cls, iitVar);
        }
        yrf f2 = iitVar.f(dqfVar, new g(cls.getName(), cls));
        if (!z2) {
            iitVar.delete();
        }
        return f2;
    }

    public final Class z(dqf dqfVar, ksf ksfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("438c959f", new Object[]{this, dqfVar, ksfVar});
        }
        if (ksfVar instanceof upf) {
            return Boolean.TYPE;
        }
        if (ksfVar instanceof uqf) {
            double w = ((uqf) ksfVar).w();
            if (w == ((int) w)) {
                return Integer.TYPE;
            }
            if (w == ((long) w)) {
                return Long.TYPE;
            }
            return Double.TYPE;
        } else if (ksfVar instanceof msf) {
            return Void.TYPE;
        } else {
            if (ksfVar instanceof esf) {
                return String.class;
            }
            if (ksfVar instanceof oqf) {
                if (((oqf) ksfVar).O(dqfVar) instanceof c) {
                    return Class.class;
                }
                if (this.o) {
                    return ksfVar.getClass();
                }
            } else if (ksfVar instanceof yrf) {
                ypf A = ((yrf) ksfVar).A(dqfVar);
                if (A instanceof f) {
                    Object obj = ((f) A).e;
                    if (obj != null) {
                        return obj.getClass();
                    }
                } else if (A instanceof a) {
                    Object obj2 = ((a) A).e;
                    if (obj2 != null) {
                        return obj2.getClass();
                    }
                } else if (this.o) {
                    return ksfVar.getClass();
                }
            } else if (this.o && (ksfVar instanceof hsf)) {
                return ksfVar.getClass();
            }
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.yrf C(tb.dqf r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lpf.C(tb.dqf, java.lang.Object):tb.yrf");
    }

    public final ksf K(jb1 jb1Var, Class cls, Object obj, Object obj2) {
        Method[] methods;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("5a67f6fa", new Object[]{this, jb1Var, cls, obj, obj2});
        }
        boolean z = obj == null;
        dqf d2 = jb1Var.d();
        String e2 = jb1Var.e();
        Class[] A = A(d2, jb1Var);
        Method k = a0y.k(obj2, e2);
        if (k != null && J(k.getParameterTypes(), A)) {
            return p(d2, jb1Var, k, obj);
        }
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(e2) && ((!z || (method.getModifiers() & 9) == 9) && J(method.getParameterTypes(), A))) {
                a0y.f(obj2, e2, method);
                return p(d2, jb1Var, method, obj);
            }
        }
        StringBuilder sb = new StringBuilder("Can not found a matched ");
        if (z) {
            str = "static ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("method '");
        sb.append(e2);
        sb.append("' with ");
        sb.append(jb1Var.b());
        sb.append(" argument");
        if (jb1Var.b() > 1) {
            str2 = "s ";
        } else {
            str2 = " ";
        }
        sb.append(str2);
        sb.append(o(A));
        N(d2, sb.toString());
        return null;
    }

    public final oqf v(dqf dqfVar, Class cls, String str) {
        Class<?>[] declaredClasses;
        Class<? extends Annotation> cls2;
        oqf u;
        ksf y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("a3b3cfc0", new Object[]{this, dqfVar, cls, str});
        }
        if (!this.l) {
            return null;
        }
        if (((HashMap) this.b).containsKey(str)) {
            return (oqf) ((oqf) ((HashMap) this.b).get(str)).d(dqfVar);
        }
        oqf oqfVar = new oqf(dqfVar, new c(str, cls), w(str), true);
        yrf x = x(dqfVar, cls);
        yrf y2 = y(dqfVar, cls, false, false);
        oqfVar.L(dqfVar, x);
        oqfVar.J(dqfVar, pg1.ATOM_prototype, y2);
        y2.J(dqfVar, pg1.ATOM_constructor, oqfVar);
        ((HashMap) this.b).put(str, (oqf) oqfVar.d(dqfVar));
        Class superclass = cls.getSuperclass();
        if (superclass == null || !this.j) {
            ksf h = dqfVar.h(pg1.ATOM_Function);
            if (h != null) {
                if ((h instanceof yrf) && (y = ((yrf) h).y(dqfVar, pg1.ATOM_prototype)) != null) {
                    x.L(dqfVar, y);
                    y.delete();
                }
                h.delete();
            }
        } else {
            oqf v = v(dqfVar, superclass, superclass.getName());
            if (v != null) {
                ksf D = v.D(dqfVar);
                x.L(dqfVar, D);
                D.delete();
                ksf y3 = v.y(dqfVar, pg1.ATOM_prototype);
                y2.L(dqfVar, y3);
                y3.delete();
                v.delete();
            }
        }
        y2.delete();
        if (this.n) {
            for (Class<?> cls3 : cls.getDeclaredClasses()) {
                if ((cls3.getModifiers() & 1) == 1 && (((cls2 = this.p) == null || cls3.isAnnotationPresent(cls2)) && (u = u(dqfVar, cls3)) != null)) {
                    String name = cls3.getName();
                    x.J(dqfVar, name.substring(name.lastIndexOf(36) + 1), u);
                    u.delete();
                }
            }
        }
        x.delete();
        if (this.m) {
            yrf C = C(dqfVar, cls);
            oqfVar.J(dqfVar, "class", C);
            C.delete();
        }
        return oqfVar;
    }
}
