package com.taobao.message.lab.comfrm.inner2.js;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.taobao.windvane.extra.jsi.JsiMode;
import android.taobao.windvane.extra.jsi.WVJsi;
import android.util.Log;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.model.Action1;
import com.taobao.message.lab.comfrm.support.model.Func1;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import tb.dqf;
import tb.esf;
import tb.hqf;
import tb.jb1;
import tb.ksf;
import tb.msf;
import tb.og8;
import tb.oqf;
import tb.pg1;
import tb.t2o;
import tb.upf;
import tb.uqf;
import tb.ye8;
import tb.ypf;
import tb.yrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class JSIImpl implements JSFacade {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "JSIImpl";
    private static final AtomicLong sInstanceId = new AtomicLong(0);
    private static final HandlerThread sThread;
    private static boolean sWVFlag;
    private ExecutorService mExecutor;
    private boolean mOOMAllowReturnNull;
    private JSEngine mJSEngine = null;
    private dqf mJSContext = null;
    private boolean mLeakFix = true;
    private volatile boolean mDemote = false;
    public Localization.a mLocaleChangeListener = new Localization.a() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
            } else {
                JSIImpl.access$000(JSIImpl.this);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class Ref<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private T data;

        static {
            t2o.a(537919721);
        }

        public Ref(T t) {
            this.data = t;
        }

        public T get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            if (this.data == null && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "throwJSICoreError", "1"))) {
                Logger.e(JSIImpl.TAG, "Ref调用release()之后，不应该再有调用");
                Schedules.ui(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.Ref.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        throw new IllegalStateException("Ref调用release()之后，不应该再有调用");
                    }
                });
            }
            return this.data;
        }

        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                this.data = null;
            }
        }
    }

    static {
        t2o.a(537919708);
        t2o.a(537919707);
        try {
            IpChange ipChange = WVJsi.$ipChange;
            sWVFlag = true;
        } catch (ClassNotFoundException unused) {
            sWVFlag = false;
        }
        HandlerThread handlerThread = new HandlerThread("JSILoop");
        sThread = handlerThread;
        handlerThread.start();
    }

    public static /* synthetic */ void access$000(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae562af", new Object[]{jSIImpl});
        } else {
            jSIImpl.registerGlobal();
        }
    }

    public static /* synthetic */ ExecutorService access$100(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("aeb0b64d", new Object[]{jSIImpl});
        }
        return jSIImpl.mExecutor;
    }

    public static /* synthetic */ boolean access$200(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d520871", new Object[]{jSIImpl})).booleanValue();
        }
        return jSIImpl.mOOMAllowReturnNull;
    }

    public static /* synthetic */ dqf access$300(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dqf) ipChange.ipc$dispatch("f91ea255", new Object[]{jSIImpl});
        }
        return jSIImpl.mJSContext;
    }

    public static /* synthetic */ boolean access$400(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fbeae2f", new Object[]{jSIImpl})).booleanValue();
        }
        return jSIImpl.mLeakFix;
    }

    public static /* synthetic */ JSEngine access$500(JSIImpl jSIImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSEngine) ipChange.ipc$dispatch("1969816e", new Object[]{jSIImpl});
        }
        return jSIImpl.mJSEngine;
    }

    private void appendLocalizedTextFun(dqf dqfVar, yrf yrfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fce68a6", new Object[]{this, dqfVar, yrfVar});
            return;
        }
        oqf oqfVar = new oqf(dqfVar, new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$3");
            }

            @Override // tb.ypf
            public ksf onCallFunction(jb1 jb1Var) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ksf) ipChange2.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
                }
                Logger.d(JSIImpl.TAG, "genLocalizedTextFun args count: " + jb1Var.b());
                if (jb1Var.b() < 1) {
                    return new msf();
                }
                esf esfVar = (esf) jb1Var.c(0);
                String u = esfVar.u();
                String r = Localization.r(u);
                Logger.d(JSIImpl.TAG, "genLocalizedTextFun key: " + u + "  value: " + r);
                esfVar.delete();
                return new esf(r);
            }
        }, "localizedText");
        yrfVar.J(dqfVar, "localizedText", oqfVar);
        oqfVar.delete();
    }

    private oqf consumerDelayListFunc(String str, final Func1<String, List> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("46e50734", new Object[]{this, str, func1});
        }
        return new oqf(this.mJSContext, new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str2, Object... objArr) {
                if (str2.hashCode() == 1102003264) {
                    return super.onCallFunction((jb1) objArr[0]);
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$7");
            }

            @Override // tb.ypf
            public ksf onCallFunction(jb1 jb1Var) {
                final Ref ref;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ksf) ipChange2.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
                }
                if (jb1Var.b() <= 0) {
                    return super.onCallFunction(jb1Var);
                }
                ksf c = jb1Var.c(0);
                try {
                    if (c instanceof esf) {
                        ref = (List) func1.call(((esf) c).u());
                    } else {
                        ref = (List) func1.call(null);
                    }
                } catch (Throwable th) {
                    if (!ApplicationUtil.isDebug()) {
                        th.printStackTrace();
                        Logger.e(JSIImpl.TAG, Log.getStackTraceString(th));
                        ref = null;
                    } else {
                        throw new RuntimeException(th);
                    }
                }
                if (c != null) {
                    c.delete();
                }
                if (ref == null) {
                    return null;
                }
                yrf yrfVar = new yrf(JSIImpl.access$300(JSIImpl.this));
                if (JSIImpl.access$400(JSIImpl.this)) {
                    ref = new Ref(ref);
                }
                oqf oqfVar = new oqf(JSIImpl.access$300(JSIImpl.this), new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.7.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        if (str2.hashCode() == 1102003264) {
                            return super.onCallFunction((jb1) objArr[0]);
                        }
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$7$1");
                    }

                    @Override // tb.ypf
                    public ksf onCallFunction(jb1 jb1Var2) {
                        List list;
                        Object obj;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (ksf) ipChange3.ipc$dispatch("41af3c40", new Object[]{this, jb1Var2});
                        }
                        Object obj2 = ref;
                        if (obj2 instanceof Ref) {
                            list = (List) ((Ref) obj2).get();
                            if (list == null) {
                                return null;
                            }
                        } else {
                            list = (List) obj2;
                        }
                        if (jb1Var2.b() > 0) {
                            ksf c2 = jb1Var2.c(0);
                            int i = -1;
                            try {
                                if (c2 instanceof uqf) {
                                    i = ValueUtil.getInteger(Integer.valueOf(((uqf) c2).u()), -1);
                                }
                            } catch (Throwable th2) {
                                if (!ApplicationUtil.isDebug()) {
                                    th2.printStackTrace();
                                    Logger.e(JSIImpl.TAG, Log.getStackTraceString(th2));
                                } else {
                                    throw new RuntimeException(th2);
                                }
                            }
                            if (c2 != null) {
                                c2.delete();
                            }
                            if (i >= 0 && i < list.size() && (obj = list.get(i)) != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("data", obj);
                                return new esf(JSON.toJSONString(hashMap, SerializerFeature.DisableCircularReferenceDetect));
                            }
                        }
                        return super.onCallFunction(jb1Var2);
                    }
                }, "at");
                oqf oqfVar2 = new oqf(JSIImpl.access$300(JSIImpl.this), new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.7.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$7$2");
                    }

                    @Override // tb.ypf
                    public ksf onCallFunction(jb1 jb1Var2) {
                        List list;
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            return (ksf) ipChange3.ipc$dispatch("41af3c40", new Object[]{this, jb1Var2});
                        }
                        Object obj = ref;
                        if (obj instanceof Ref) {
                            list = (List) ((Ref) obj).get();
                            if (list == null) {
                                return null;
                            }
                        } else {
                            list = (List) obj;
                        }
                        return new uqf(list.size());
                    }
                }, "size");
                if (JSIImpl.access$400(JSIImpl.this)) {
                    oqf oqfVar3 = new oqf(JSIImpl.access$300(JSIImpl.this), new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.7.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str2, Object... objArr) {
                            if (str2.hashCode() == 1102003264) {
                                return super.onCallFunction((jb1) objArr[0]);
                            }
                            int hashCode = str2.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$7$3");
                        }

                        @Override // tb.ypf
                        public ksf onCallFunction(jb1 jb1Var2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                return (ksf) ipChange3.ipc$dispatch("41af3c40", new Object[]{this, jb1Var2});
                            }
                            Object obj = ref;
                            if (obj instanceof Ref) {
                                ((Ref) obj).release();
                            }
                            return super.onCallFunction(jb1Var2);
                        }
                    }, "release");
                    yrfVar.J(JSIImpl.access$300(JSIImpl.this), "release", oqfVar3);
                    oqfVar3.delete();
                }
                yrfVar.J(JSIImpl.access$300(JSIImpl.this), "at", oqfVar);
                yrfVar.J(JSIImpl.access$300(JSIImpl.this), "size", oqfVar2);
                oqfVar.delete();
                oqfVar2.delete();
                return yrfVar;
            }
        }, str);
    }

    private oqf consumerObjectFunc(String str, final Func1<String, Object> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("3e64639e", new Object[]{this, str, func1});
        }
        return new oqf(this.mJSContext, new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str2, Object... objArr) {
                if (str2.hashCode() == 1102003264) {
                    return super.onCallFunction((jb1) objArr[0]);
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$6");
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
            @Override // tb.ypf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public tb.ksf onCallFunction(tb.jb1 r11) {
                /*
                    r10 = this;
                    r0 = 1
                    r1 = 2
                    r2 = 0
                    java.lang.String r3 = "JSIImpl"
                    java.lang.String r4 = "|key|"
                    com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.AnonymousClass6.$ipChange
                    boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
                    if (r6 == 0) goto L_0x001d
                    java.lang.String r3 = "41af3c40"
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r2] = r10
                    r1[r0] = r11
                    java.lang.Object r11 = r5.ipc$dispatch(r3, r1)
                    tb.ksf r11 = (tb.ksf) r11
                    return r11
                L_0x001d:
                    int r5 = r11.b()
                    if (r5 <= 0) goto L_0x00cd
                    tb.ksf r11 = r11.c(r2)
                    r5 = 0
                    boolean r6 = r11 instanceof tb.esf     // Catch: all -> 0x003c
                    if (r6 == 0) goto L_0x003f
                    r6 = r11
                    tb.esf r6 = (tb.esf) r6     // Catch: all -> 0x003c
                    java.lang.String r6 = r6.u()     // Catch: all -> 0x003c
                    com.taobao.message.lab.comfrm.support.model.Func1 r7 = r2     // Catch: all -> 0x003a
                    java.lang.Object r7 = r7.call(r6)     // Catch: all -> 0x003a
                    goto L_0x0058
                L_0x003a:
                    r7 = move-exception
                    goto L_0x0047
                L_0x003c:
                    r7 = move-exception
                    r6 = r5
                    goto L_0x0047
                L_0x003f:
                    com.taobao.message.lab.comfrm.support.model.Func1 r6 = r2     // Catch: all -> 0x003c
                    java.lang.Object r7 = r6.call(r5)     // Catch: all -> 0x003c
                    r6 = r5
                    goto L_0x0058
                L_0x0047:
                    boolean r8 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
                    if (r8 != 0) goto L_0x00c7
                    r7.printStackTrace()
                    java.lang.String r7 = android.util.Log.getStackTraceString(r7)
                    com.taobao.message.lab.comfrm.util.Logger.e(r3, r7)
                    r7 = r5
                L_0x0058:
                    if (r11 == 0) goto L_0x005d
                    r11.delete()
                L_0x005d:
                    if (r7 == 0) goto L_0x00c6
                    java.util.HashMap r11 = new java.util.HashMap
                    r11.<init>()
                    java.lang.String r8 = "data"
                    r11.put(r8, r7)
                    tb.esf r8 = new tb.esf     // Catch: all -> 0x007d
                    com.alibaba.fastjson.serializer.SerializerFeature[] r1 = new com.alibaba.fastjson.serializer.SerializerFeature[r1]     // Catch: all -> 0x007d
                    com.alibaba.fastjson.serializer.SerializerFeature r9 = com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect     // Catch: all -> 0x007d
                    r1[r2] = r9     // Catch: all -> 0x007d
                    com.alibaba.fastjson.serializer.SerializerFeature r9 = com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat     // Catch: all -> 0x007d
                    r1[r0] = r9     // Catch: all -> 0x007d
                    java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r11, r1)     // Catch: all -> 0x007d
                    r8.<init>(r0)     // Catch: all -> 0x007d
                    return r8
                L_0x007d:
                    r0 = move-exception
                    com.taobao.message.lab.comfrm.util.Logger.e(r3, r0)
                    com.taobao.message.lab.comfrm.inner2.js.JSIImpl r1 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.this
                    boolean r1 = com.taobao.message.lab.comfrm.inner2.js.JSIImpl.access$200(r1)
                    if (r1 != 0) goto L_0x00c6
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x00b8
                    r1.<init>(r4)     // Catch: all -> 0x00b8
                    r1.append(r6)     // Catch: all -> 0x00b8
                    java.lang.String r4 = "|className|"
                    r1.append(r4)     // Catch: all -> 0x00b8
                    java.lang.Class r4 = r7.getClass()     // Catch: all -> 0x00b8
                    java.lang.String r4 = r4.getName()     // Catch: all -> 0x00b8
                    r1.append(r4)     // Catch: all -> 0x00b8
                    java.lang.String r1 = r1.toString()     // Catch: all -> 0x00b8
                    com.taobao.message.lab.comfrm.util.Logger.e(r3, r1)     // Catch: all -> 0x00b8
                    com.taobao.message.lab.comfrm.inner2.js.JSIImpl$6$1 r1 = new com.taobao.message.lab.comfrm.inner2.js.JSIImpl$6$1     // Catch: all -> 0x00b8
                    r1.<init>()     // Catch: all -> 0x00b8
                    com.alibaba.fastjson.serializer.SerializerFeature[] r2 = new com.alibaba.fastjson.serializer.SerializerFeature[r2]     // Catch: all -> 0x00b8
                    java.lang.String r11 = com.alibaba.fastjson.JSON.toJSONString(r11, r1, r2)     // Catch: all -> 0x00b8
                    com.taobao.message.lab.comfrm.util.Logger.e(r3, r11)     // Catch: all -> 0x00b8
                    goto L_0x00b9
                L_0x00b8:
                L_0x00b9:
                    java.lang.Thread$UncaughtExceptionHandler r11 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
                    if (r11 == 0) goto L_0x00c6
                    java.lang.Thread r1 = com.taobao.android.virtual_thread.face.VExecutors.currentThread()
                    r11.uncaughtException(r1, r0)
                L_0x00c6:
                    return r5
                L_0x00c7:
                    java.lang.RuntimeException r11 = new java.lang.RuntimeException
                    r11.<init>(r7)
                    throw r11
                L_0x00cd:
                    tb.ksf r11 = super.onCallFunction(r11)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.AnonymousClass6.onCallFunction(tb.jb1):tb.ksf");
            }
        }, str);
    }

    private oqf consumerStringFunc(String str, final Action1<String> action1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("8093cdfe", new Object[]{this, str, action1});
        }
        return new oqf(this.mJSContext, new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str2, Object... objArr) {
                if (str2.hashCode() == 1102003264) {
                    return super.onCallFunction((jb1) objArr[0]);
                }
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$5");
            }

            @Override // tb.ypf
            public ksf onCallFunction(jb1 jb1Var) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ksf) ipChange2.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
                }
                if (jb1Var.b() > 0) {
                    ksf c = jb1Var.c(0);
                    try {
                        if (c instanceof esf) {
                            action1.call(((esf) c).u());
                        } else {
                            action1.call(null);
                        }
                    } catch (Throwable th) {
                        if (!ApplicationUtil.isDebug()) {
                            th.printStackTrace();
                            Logger.e(JSIImpl.TAG, Log.getStackTraceString(th));
                        } else {
                            throw new RuntimeException(th);
                        }
                    }
                    if (c != null) {
                        c.delete();
                    }
                }
                return super.onCallFunction(jb1Var);
            }
        }, str);
    }

    private void createContext(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aef3364", new Object[]{this, str});
            return;
        }
        Calendar.getInstance().setTime(new Date());
        Bundle bundle = new Bundle();
        bundle.putBoolean("javaSuper", true);
        bundle.putBoolean("javaField", true);
        bundle.putBoolean("javaClass", true);
        try {
            this.mJSContext = this.mJSEngine.createContext(str, bundle, null);
        } catch (Throwable unused) {
            this.mJSContext = this.mJSEngine.createContext(str);
        }
        registerGlobal();
    }

    private oqf logFunc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqf) ipChange.ipc$dispatch("61cd4b11", new Object[]{this});
        }
        return new oqf(this.mJSContext, new ypf() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                if (str.hashCode() == 1102003264) {
                    return super.onCallFunction((jb1) objArr[0]);
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$4");
            }

            @Override // tb.ypf
            public ksf onCallFunction(jb1 jb1Var) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (ksf) ipChange2.ipc$dispatch("41af3c40", new Object[]{this, jb1Var});
                }
                if (jb1Var.b() > 0) {
                    ksf c = jb1Var.c(0);
                    if (c instanceof esf) {
                        Logger.e(JSIImpl.TAG, "console.log: " + ((esf) c).u());
                    } else {
                        Logger.e(JSIImpl.TAG, "console.log doesn't support log");
                    }
                    if (c != null) {
                        c.delete();
                    }
                }
                return super.onCallFunction(jb1Var);
            }
        }, "log");
    }

    private void registerGlobal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2859ad", new Object[]{this});
        } else if (this.mJSContext != null) {
            ye8 ye8Var = null;
            try {
                ye8 ye8Var2 = new ye8(this.mJSContext.k());
                try {
                    yrf p = this.mJSContext.p();
                    yrf yrfVar = new yrf(this.mJSContext);
                    oqf logFunc = logFunc();
                    yrfVar.J(this.mJSContext, "log", logFunc);
                    yrfVar.J(this.mJSContext, "warn", logFunc);
                    yrfVar.J(this.mJSContext, "error", logFunc);
                    p.J(this.mJSContext, "console", yrfVar);
                    logFunc.delete();
                    yrfVar.delete();
                    yrf yrfVar2 = new yrf(this.mJSContext);
                    yrf yrfVar3 = new yrf(this.mJSContext);
                    esf esfVar = new esf(TimeCalculator.PLATFORM_ANDROID);
                    yrfVar3.J(this.mJSContext, "platform", esfVar);
                    esf esfVar2 = new esf(ApplicationUtil.getUTDID());
                    yrfVar3.J(this.mJSContext, "utdid", esfVar2);
                    esf esfVar3 = new esf(ApplicationUtil.getAppKey());
                    yrfVar3.J(this.mJSContext, "appKey", esfVar3);
                    upf upfVar = new upf(ApplicationUtil.isDebug());
                    yrfVar3.J(this.mJSContext, "debuggable", upfVar);
                    yrfVar2.J(this.mJSContext, "navigator", yrfVar3);
                    esf esfVar4 = new esf(Localization.h().getTag());
                    esf esfVar5 = new esf("1");
                    if (!Localization.p()) {
                        esfVar5 = new esf("0");
                    }
                    yrfVar2.J(this.mJSContext, LoggingSPCache.STORAGE_LANGUAGE, esfVar4);
                    yrfVar2.J(this.mJSContext, "isSimplifiedChinese", esfVar5);
                    appendLocalizedTextFun(this.mJSContext, yrfVar2);
                    p.J(this.mJSContext, pg1.ATOM_EXT_window, yrfVar2);
                    esfVar3.delete();
                    esfVar2.delete();
                    esfVar.delete();
                    upfVar.delete();
                    yrfVar3.delete();
                    yrfVar2.delete();
                    p.delete();
                    ye8Var2.c();
                } catch (Throwable unused) {
                    ye8Var = ye8Var2;
                    if (ye8Var != null) {
                        ye8Var.c();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        ExecutorService executorService = this.mExecutor;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (JSIImpl.access$300(JSIImpl.this) != null) {
                        JSIImpl.access$300(JSIImpl.this).b();
                        if (JSIImpl.access$500(JSIImpl.this) != null) {
                            JSIImpl.access$500(JSIImpl.this).removeContext(JSIImpl.access$300(JSIImpl.this));
                        }
                    }
                    if (JSIImpl.access$500(JSIImpl.this) != null) {
                        JSIImpl.access$500(JSIImpl.this).dispose();
                    }
                }
            });
        }
        Localization.s(this.mLocaleChangeListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String executeJS2String(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.executeJS2String(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public boolean isDemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6365b6e9", new Object[]{this})).booleanValue();
        }
        return this.mDemote;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerDelayListFunc(String str, Func1<String, List> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c684d9", new Object[]{this, str, func1});
        } else if (!this.mDemote) {
            ye8 ye8Var = new ye8(this.mJSContext.k());
            try {
                yrf p = this.mJSContext.p();
                oqf consumerDelayListFunc = consumerDelayListFunc(str, func1);
                p.J(this.mJSContext, str, consumerDelayListFunc);
                consumerDelayListFunc.delete();
                p.delete();
            } finally {
                ye8Var.c();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerObjectFunc(String str, Func1<String, Object> func1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f60ccf5", new Object[]{this, str, func1});
        } else if (!this.mDemote) {
            ye8 ye8Var = new ye8(this.mJSContext.k());
            try {
                yrf p = this.mJSContext.p();
                oqf consumerObjectFunc = consumerObjectFunc(str, func1);
                p.J(this.mJSContext, str, consumerObjectFunc);
                consumerObjectFunc.delete();
                p.delete();
            } finally {
                ye8Var.c();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void registerStringFunc(String str, Action1<String> action1) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7928dd5", new Object[]{this, str, action1});
        } else if (!this.mDemote) {
            ye8 ye8Var = new ye8(this.mJSContext.k());
            try {
                yrf p = this.mJSContext.p();
                oqf consumerStringFunc = consumerStringFunc(str, action1);
                p.J(this.mJSContext, str, consumerStringFunc);
                consumerStringFunc.delete();
                p.delete();
            } finally {
                ye8Var.c();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void startRemoteInspect(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fed33d", new Object[]{this, str});
        } else if (og8.d()) {
            hqf.startRemoteInspect(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01a6 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:19:0x004c, B:22:0x0064, B:24:0x006a, B:28:0x00d7, B:30:0x00dd, B:32:0x00e7, B:33:0x00ec, B:34:0x00ed, B:36:0x00f6, B:37:0x00fd, B:39:0x0100, B:40:0x010a, B:42:0x0118, B:44:0x011e, B:47:0x0191, B:48:0x0196, B:49:0x0197, B:51:0x019b, B:54:0x01a6, B:57:0x01ac, B:60:0x01b6), top: B:65:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ac A[Catch: all -> 0x00d1, LOOP:1: B:56:0x01aa->B:57:0x01ac, LOOP_END, TryCatch #0 {all -> 0x00d1, blocks: (B:19:0x004c, B:22:0x0064, B:24:0x006a, B:28:0x00d7, B:30:0x00dd, B:32:0x00e7, B:33:0x00ec, B:34:0x00ed, B:36:0x00f6, B:37:0x00fd, B:39:0x0100, B:40:0x010a, B:42:0x0118, B:44:0x011e, B:47:0x0191, B:48:0x0196, B:49:0x0197, B:51:0x019b, B:54:0x01a6, B:57:0x01ac, B:60:0x01b6), top: B:65:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b6 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:19:0x004c, B:22:0x0064, B:24:0x006a, B:28:0x00d7, B:30:0x00dd, B:32:0x00e7, B:33:0x00ec, B:34:0x00ed, B:36:0x00f6, B:37:0x00fd, B:39:0x0100, B:40:0x010a, B:42:0x0118, B:44:0x011e, B:47:0x0191, B:48:0x0196, B:49:0x0197, B:51:0x019b, B:54:0x01a6, B:57:0x01ac, B:60:0x01b6), top: B:65:0x004c }] */
    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String executeJSFunc(java.lang.String r17, java.lang.String r18, java.lang.Object[] r19) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.executeJSFunc(java.lang.String, java.lang.String, java.lang.Object[]):java.lang.String");
    }

    @Override // com.taobao.message.lab.comfrm.inner2.js.JSFacade
    public void initJS(Context context, String str, ExecutorService executorService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980464b7", new Object[]{this, context, str, executorService});
            return;
        }
        this.mOOMAllowReturnNull = "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "JSIOOMAllowReturnNull", "0"));
        this.mExecutor = executorService;
        StringBuilder sb = new StringBuilder("MPFRM");
        AtomicLong atomicLong = sInstanceId;
        sb.append(atomicLong.getAndIncrement());
        String sb2 = sb.toString();
        Handler handler = new Handler(sThread.getLooper()) { // from class: com.taobao.message.lab.comfrm.inner2.js.JSIImpl.2
            public static final /* synthetic */ boolean $assertionsDisabled = false;
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str2, Object... objArr) {
                str2.hashCode();
                int hashCode = str2.hashCode();
                throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/inner2/js/JSIImpl$2");
            }

            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("44d6b87", new Object[]{this, message});
                } else {
                    JSIImpl.access$100(JSIImpl.this).execute(message.getCallback());
                }
            }
        };
        if (sWVFlag) {
            WVJsi.InstanceResult build = WVJsi.instanceBuilder(context).name(sb2).version("1.0").handler(handler).mode(JsiMode.V8_QJS).build();
            if (build == null || !build.isSuccess()) {
                Logger.e(TAG, "mJSEngine init fail");
                AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, "initJS", "-1", "mJSEngine init fail");
                this.mDemote = true;
                return;
            }
            this.mJSEngine = build.getJsEngine();
        } else {
            try {
                JSEngine.loadSo(context, new Bundle());
                Bundle bundle = new Bundle();
                bundle.putString("name", "MPFRM" + atomicLong.getAndIncrement());
                bundle.putString("version", "1.0");
                JSEngine instance = hqf.getInstance("MessageFramework");
                this.mJSEngine = instance;
                if (instance == null) {
                    this.mJSEngine = JSEngine.createInstance(context, bundle, handler);
                }
            } catch (Throwable th) {
                Logger.e(TAG, th.toString());
                AppMonitor.Alarm.commitFail(Constants.Monitor.MODULE_MONITOR, "initJS", "-1", th.toString());
                this.mDemote = true;
                return;
            }
        }
        AppMonitor.Alarm.commitSuccess(Constants.Monitor.MODULE_MONITOR, "initJS");
        this.mJSEngine.setEnableStats(ApplicationUtil.isDebug() ? "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "JSIEnableStats", "1")) : false);
        Localization.a(this.mLocaleChangeListener);
        createContext(str);
    }
}
