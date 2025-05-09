package tb;

import com.alibaba.jsi.standard.JSEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class lwx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Set<wa7> f23618a = new HashSet();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;

    static {
        t2o.a(921698321);
    }

    public static void a(JSEngine jSEngine, iit iitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c23945d", new Object[]{jSEngine, iitVar});
        } else if (c) {
            d = true;
            if (jSEngine != null) {
                jSEngine.objectCreated(iitVar);
            }
        }
    }

    public static void b(wa7 wa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2128fd29", new Object[]{wa7Var});
        } else if (c) {
            Set<wa7> set = f23618a;
            synchronized (set) {
                ((HashSet) set).add(wa7Var);
                e = true;
            }
        }
    }

    public static void c(dqf dqfVar, Set<wa7> set, String str, int i) {
        JSEngine jSEngine;
        ye8 ye8Var;
        ye8 ye8Var2;
        Throwable th;
        HashSet hashSet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7443bdcd", new Object[]{dqfVar, set, str, new Integer(i)});
        } else if (c) {
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            HashSet hashSet7 = new HashSet();
            HashSet hashSet8 = new HashSet();
            HashSet hashSet9 = new HashSet();
            HashSet hashSet10 = new HashSet();
            HashSet hashSet11 = new HashSet();
            HashSet hashSet12 = new HashSet();
            int size = set.size();
            for (wa7 wa7Var : set) {
                if (wa7Var instanceof hsf) {
                    hashSet2.add(wa7Var);
                } else if (wa7Var instanceof spf) {
                    hashSet3.add(wa7Var);
                } else if (wa7Var instanceof tpf) {
                    hashSet4.add(wa7Var);
                } else if (wa7Var instanceof oqf) {
                    hashSet5.add(wa7Var);
                } else if (wa7Var instanceof sqf) {
                    hashSet6.add(wa7Var);
                } else if (wa7Var instanceof dsf) {
                    hashSet7.add(wa7Var);
                } else if ((wa7Var instanceof vpf) || (wa7Var instanceof vqf) || (wa7Var instanceof fsf) || (wa7Var instanceof isf)) {
                    hashSet8.add(wa7Var);
                } else if (wa7Var instanceof nsf) {
                    hashSet9.add(wa7Var);
                } else if (wa7Var instanceof kqf) {
                    hashSet12.add(wa7Var);
                } else if (wa7Var instanceof iit) {
                    hashSet11.add(wa7Var);
                } else {
                    hashSet10.add(wa7Var);
                }
                size = size;
            }
            if (dqfVar != null) {
                jSEngine = dqfVar.k();
                ye8Var = new ye8(jSEngine);
            } else {
                ye8Var = null;
                jSEngine = null;
            }
            try {
                a0y.m(" ");
                a0y.m("*** *** *** *** ***  Alive Java JS Objects  *** *** *** *** ***");
                ye8Var2 = ye8Var;
                try {
                    a0y.m("JSEngine: " + str);
                    if (jSEngine != null) {
                        List<dqf> contexts = jSEngine.getContexts();
                        int min = Math.min(contexts.size(), i);
                        if (contexts.size() > 0) {
                            Locale locale = Locale.US;
                            int size2 = contexts.size();
                            StringBuilder sb = new StringBuilder();
                            hashSet = hashSet11;
                            sb.append("JSContext (");
                            sb.append(min);
                            sb.append(" of ");
                            sb.append(size2);
                            sb.append("):");
                            a0y.m(sb.toString());
                            int i2 = 0;
                            for (Iterator<dqf> it = contexts.iterator(); it.hasNext(); it = it) {
                                dqf next = it.next();
                                i2++;
                                if (i2 > min) {
                                    break;
                                }
                                a0y.m("  * " + next.o());
                            }
                        } else {
                            hashSet = hashSet11;
                            a0y.m("JSContext: none");
                        }
                    } else {
                        hashSet = hashSet11;
                    }
                    a0y.m("Objects count: " + size);
                    h(dqfVar, hashSet2, "JSSymbol", i);
                    h(dqfVar, hashSet3, "JSArray", i);
                    h(dqfVar, hashSet4, "JSArrayBuffer", i);
                    h(dqfVar, hashSet5, "JSFunction", i);
                    h(dqfVar, hashSet6, "JSMap", i);
                    h(dqfVar, hashSet7, "JSSet", i);
                    h(dqfVar, hashSet8, "JSPrimitiveObject", i);
                    h(dqfVar, hashSet10, "JSObject", i);
                    h(dqfVar, hashSet9, "JSWeakValue", i);
                    h(dqfVar, hashSet, "Template", i);
                    h(dqfVar, hashSet12, "JSException", i);
                    Set<wa7> set2 = f23618a;
                    synchronized (set2) {
                        h(null, set2, "OutOfEngineObjects", i);
                    }
                    a0y.m("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***");
                    a0y.m(" ");
                    if (ye8Var2 != null) {
                        ye8Var2.c();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (ye8Var2 != null) {
                        ye8Var2.c();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ye8Var2 = ye8Var;
            }
        }
    }

    public static void d(dqf dqfVar, wa7 wa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("463535fe", new Object[]{dqfVar, wa7Var});
        } else if (c) {
            if (dqfVar != null) {
                d = true;
                dqfVar.k().objectCreated(wa7Var);
                return;
            }
            throw new NullPointerException("Pass null JSContext with object: " + wa7Var);
        }
    }

    public static void e(boolean z) {
        int i;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        AtomicInteger atomicInteger = b;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        if (atomicInteger.addAndGet(i) > 0) {
            z2 = true;
        }
        c = z2;
    }

    public static void f(JSEngine jSEngine, iit iitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5524e5fc", new Object[]{jSEngine, iitVar});
        } else if (d && jSEngine != null) {
            jSEngine.objectDeleted(iitVar);
        }
    }

    public static void g(wa7 wa7Var) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4156688", new Object[]{wa7Var});
        } else if (e) {
            Set<wa7> set = f23618a;
            synchronized (set) {
                ((HashSet) set).remove(wa7Var);
                if (((HashSet) set).size() != 0) {
                    z = true;
                }
                e = z;
            }
        }
    }

    public static void h(dqf dqfVar, Set<wa7> set, String str, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f1e88e", new Object[]{dqfVar, set, str, new Integer(i)});
        } else if (set.size() != 0) {
            Locale locale = Locale.US;
            a0y.m(str + " (" + Math.min(set.size(), i) + " of " + set.size() + "):");
            for (wa7 wa7Var : set) {
                i2++;
                if (i2 <= i) {
                    String str2 = "  * " + wa7Var.toString();
                    if (dqfVar != null && (wa7Var instanceof ksf)) {
                        str2 = str2 + " (" + ((ksf) wa7Var).t(dqfVar) + f7l.BRACKET_END_STR;
                    }
                    a0y.m(str2);
                } else {
                    return;
                }
            }
        }
    }

    public static void i(dqf dqfVar, wa7 wa7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24289bdd", new Object[]{dqfVar, wa7Var});
        } else if (d && dqfVar != null) {
            dqfVar.k().objectDeleted(wa7Var);
        }
    }
}
