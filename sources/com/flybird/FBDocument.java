package com.flybird;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;
import com.alipay.android.app.template.Base64;
import com.alipay.android.app.template.DtmElementClickListener;
import com.alipay.android.app.template.EventHandler;
import com.alipay.android.app.template.FBBridge;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.app.template.FBPluginFactory;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.app.template.LogCatLog;
import com.alipay.android.app.template.OnLoadCallback;
import com.alipay.android.app.template.OnTemplateClickListener;
import com.alipay.android.app.template.TemplateKeyboardService;
import com.alipay.android.app.template.TemplatePasswordService;
import com.alipay.android.app.template.Tracker;
import com.alipay.android.app.template.event.TElementEventHandler;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.platform.Platform;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.util.InvokeThreadPoolTask;
import com.alipay.birdnest.util.UiUtil;
import com.alipay.birdnest.view.SystemDefaultDialog;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.FBRootFrameLayout;
import com.flybird._FBDocumentInitializer;
import com.flybird.support.basics.AppContextHolder;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.eng;
import tb.gwt;
import tb.jst;
import tb.ks9;
import tb.l2w;
import tb.pg1;
import tb.pgh;
import tb.uca;
import tb.y5v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FBDocument implements FBContext, FBRootFrameLayout.OnSizeChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JS_EXCEPTION_ACTION = "com.flybird.js.exception";

    /* renamed from: a  reason: collision with root package name */
    public static final String f4901a;
    public static final String b;
    public static final Pattern c;
    public static final Pattern d;
    public final String A;
    public volatile boolean B;
    public OnTemplateClickListener C;
    public TElementEventHandler D;
    public final int E;
    public FBPartialVisibilityHelper K;
    public String L;
    public String M;
    public String N;
    public TemplatePasswordService Q;
    public TemplateKeyboardService R;
    public int actionBarHeight;
    public boolean e0;
    public boolean f0;
    public final Resources j;
    public Context k;
    public BirdNestEngine k0;
    public String l0;
    public FBView mRoot;
    @Deprecated
    public final Map<String, String> n0;
    public HandlerThread p0;
    public BirdNestEngine.Params param;
    public Handler q0;
    public FBNav u;
    public final BirdNestEngine.ThemeColorProvider u0;
    public FBRootFrameLayout v;
    public String x;
    public final String y;
    public final String z;
    public static final Object NO_RESULT = new Object();
    public static String e = "";
    public static final FBContext.JsExecOptions f = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(5000);
    public static final FBContext.JsExecOptions g = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0).setBlockTimeoutMs(60000);
    public static final FBContext.JsExecOptions h = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
    public static final FBContext.JsExecOptions i = FBContext.JsExecOptions.create().setAsyncMode(0).setCallbackMode(0);
    public boolean l = false;
    public boolean m = false;
    public ArrayList<String> n = new ArrayList<>();
    public gwt o = null;
    public gwt p = null;
    public Map<String, String> q = null;
    public boolean r = false;
    public boolean s = false;
    public float t = 1.0f;
    public boolean w = false;
    public HashMap<String, FBView> F = new HashMap<>();
    public HashMap<String, FBLabel> G = new HashMap<>();
    public ArrayList<CountDownTimer> H = new ArrayList<>();
    public ArrayList<FBScrollView> I = new ArrayList<>();
    public ArrayList<FBHScrollView> J = new ArrayList<>();
    public HashMap<String, String> O = new HashMap<>();
    public volatile long mCore = 0;
    public boolean P = false;
    public final int[] screenSize = {-1, -1};
    public boolean S = true;
    public TemplateKeyboardService T = UiUtil.genDefaultKeyboardService();
    public ViewGroup U = null;
    public FBFocusable V = null;
    public final Set<InvokeThreadPoolTask.TaskResult> W = Collections.newSetFromMap(new ConcurrentHashMap());
    public Dialog X = null;
    public List<FBClickCallBack> Y = new ArrayList();
    public boolean Z = true;
    public Runnable a0 = new Runnable() { // from class: com.flybird.FBDocument.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FBDocument.a(FBDocument.this, true);
            }
        }
    };
    public Handler b0 = new Handler(Looper.getMainLooper());
    public boolean c0 = false;
    public boolean d0 = false;
    public FBPluginFactory g0 = null;
    public FBPluginCtx h0 = null;
    public boolean i0 = false;
    public final Map<String, Object> j0 = new HashMap();
    public ClickMode m0 = ClickMode.GLOBAL_PROTECT_CLICK;
    public long o0 = 0;
    public volatile WeakReference<Thread> r0 = new WeakReference<>(null);
    public final ConditionVariable s0 = new ConditionVariable();
    public Boolean t0 = null;

    /* compiled from: Taobao */
    /* renamed from: com.flybird.FBDocument$15  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass15 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f4908a;
        public final /* synthetic */ long b;

        public AnonymousClass15(String str, long j) {
            this.f4908a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(this.f4908a);
                String optString = jSONObject.optString("title");
                String optString2 = jSONObject.optString("message");
                String optString3 = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_OK);
                String optString4 = jSONObject.optString(MspFlybirdDefine.FLYBIRD_DIALOG_CANCEL);
                JSONObject optJSONObject = jSONObject.optJSONObject("okBehaviorInfo");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("cancelBehaviorInfo");
                Context context = FBDocument.this.k;
                final long j = this.b;
                SystemDefaultDialog.showDialog(context, optString, optString2, optString3, new DialogInterface.OnClickListener() { // from class: tb.ju8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FBDocument.AnonymousClass15.this.a(j, dialogInterface, i);
                    }
                }, optJSONObject, optString4, new DialogInterface.OnClickListener() { // from class: tb.ku8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        FBDocument.AnonymousClass15.this.b(j, dialogInterface, i);
                    }
                }, optJSONObject2);
            } catch (Throwable th) {
                FBLogger.e("FBDocument", "confirm", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j, DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a55f29b9", new Object[]{this, new Long(j), dialogInterface, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("ok", "ok");
            } catch (JSONException e) {
                FBLogger.e(AnonymousClass15.class.getName(), "exception", e);
            }
            FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(long j, DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc7d1a98", new Object[]{this, new Long(j), dialogInterface, new Integer(i)});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cancel", "ok");
            } catch (JSONException e) {
                FBLogger.e(AnonymousClass15.class.getName(), "exception", e);
            }
            FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.flybird.FBDocument$16  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass16 extends InvokeThreadPoolTask {
        public final /* synthetic */ long b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass16(ExecutorService executorService, long j, boolean z, String str, String str2, long j2) {
            super(executorService);
            this.b = j;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = j2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum ClickMode {
        GLOBAL_PROTECT_CLICK,
        INDIVIDUAL_PROTECT_CLICK,
        NO_PROTECT_CLICK
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Duktape implements Closeable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public volatile long f4922a;

        public Duktape(long j) {
            this.f4922a = j;
        }

        public static native long createContext();

        public static native long dukV2CreateContext();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            if (this.f4922a != 0) {
                long j = this.f4922a;
                this.f4922a = 0L;
                destroyContext(j);
            }
        }

        public final native void destroyContext(long j);

        public synchronized void dukV2Close() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("898ec509", new Object[]{this});
                return;
            }
            if (this.f4922a != 0) {
                long j = this.f4922a;
                this.f4922a = 0L;
                dukV2DestroyContext(j);
            }
        }

        public final native void dukV2DestroyContext(long j);

        public final native Object dukV2Evaluate(long j, String str, String str2);

        public synchronized Object dukV2Evaluate(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("84d48c88", new Object[]{this, str, str2});
            }
            return dukV2Evaluate(this.f4922a, str, str2);
        }

        public final native void dukV2Set(long j, String str, Object obj, Object[] objArr);

        public synchronized <T> void dukV2Set(String str, Class<T> cls, T t) {
            Method[] methods;
            synchronized (this) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd603cbc", new Object[]{this, str, cls, t});
                } else if (!cls.isInterface()) {
                    throw new UnsupportedOperationException("Only interfaces can be bound. Received: " + cls);
                } else if (cls.getInterfaces().length > 0) {
                    throw new UnsupportedOperationException(cls + " must not extend other interfaces");
                } else if (cls.isInstance(t)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Method method : cls.getMethods()) {
                        if (linkedHashMap.put(method.getName(), method) != null) {
                            throw new UnsupportedOperationException(method.getName() + " is overloaded in " + cls);
                        }
                    }
                    dukV2Set(this.f4922a, str, t, linkedHashMap.values().toArray());
                } else {
                    throw new IllegalArgumentException(t.getClass() + " is not an instance of " + cls);
                }
            }
        }

        public synchronized Object evaluate(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("c89693fe", new Object[]{this, str, str2});
            }
            return evaluate(this.f4922a, str, str2);
        }

        public final native String evaluate(long j, String str, String str2);

        public synchronized void finalize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            if (this.f4922a != 0) {
                FBLogger.e(Duktape.class.getName(), "Duktape instance leaked!");
            }
        }

        public synchronized Object dukV2Evaluate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a510e112", new Object[]{this, str});
            }
            return dukV2Evaluate(this.f4922a, str, "?");
        }

        public synchronized String evaluate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c31d776", new Object[]{this, str});
            }
            return evaluate(this.f4922a, str, pg1.ATOM_eval);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class DuktapeException extends RuntimeException {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String STACK_TRACE_CLASS_NAME = "JavaScript";
        private static final Pattern STACK_TRACE_PATTERN = Pattern.compile("\\s*at ([^\\s]+) \\(([^\\s]+(?<!cpp)):(\\d+)\\).*$");

        public DuktapeException(String str) {
            super(getErrorMessage(str));
            addDuktapeStack(this, str);
        }

        private static void addDuktapeStack(Throwable th, String str) {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3b1aceb", new Object[]{th, str});
                return;
            }
            String[] split = str.split("\n", -1);
            if (split.length > 1) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!z && stackTraceElement.isNativeMethod() && stackTraceElement.getClassName().equals(Duktape.class.getName()) && (stackTraceElement.getMethodName().equals("evaluate") || stackTraceElement.getMethodName().equals("call"))) {
                        for (int i = 1; i < split.length; i++) {
                            StackTraceElement stackTraceElement2 = toStackTraceElement(split[i]);
                            if (stackTraceElement2 != null) {
                                arrayList.add(stackTraceElement2);
                            }
                        }
                        z = true;
                    }
                    arrayList.add(stackTraceElement);
                }
                th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
            }
        }

        private static String getErrorMessage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b20a93a", new Object[]{str});
            }
            int indexOf = str.indexOf(10);
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
            return str;
        }

        public static /* synthetic */ Object ipc$super(DuktapeException duktapeException, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/flybird/FBDocument$DuktapeException");
        }

        private static StackTraceElement toStackTraceElement(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StackTraceElement) ipChange.ipc$dispatch("3dc82cdb", new Object[]{str});
            }
            Matcher matcher = STACK_TRACE_PATTERN.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            return new StackTraceElement(STACK_TRACE_CLASS_NAME, matcher.group(1), matcher.group(2), Integer.parseInt(matcher.group(3)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class FBContextHandle implements FBPluginCtx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public FBDocument f4923a;

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (this.f4923a == null) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnBlur(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2cb39d96", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnBlur(j)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int deliverOnChange(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("aa3fd266", new Object[]{this, new Long(j), str})).intValue();
            }
            if (a()) {
                return 0;
            }
            return FBView.nativePlatformOnChange(j, str);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnClick(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ce5b1f9d", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (a()) {
                return true;
            }
            FBDocument fBDocument = this.f4923a;
            if (!(fBDocument == null || fBDocument.getElementEventObserver() == null)) {
                this.f4923a.getElementEventObserver().onEvent(TElementEventHandler.EventType.CLICK, null, null, this.f4923a);
            }
            return FBView.nativePlatformOnClick(j);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnFocus(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("be94a24d", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnFocus(j)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int deliverOnInput(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68f7f894", new Object[]{this, new Long(j), str})).intValue();
            }
            if (a()) {
                return 0;
            }
            return FBView.nativePlatformOnInput(j, str);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnKeyDown(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d26cae7", new Object[]{this, new Long(j), new Integer(i)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnKeyDown(j, i)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnLongpress(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f9c9f73e", new Object[]{this, new Long(j)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnLongpress(j)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseDown(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aace2d7e", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnMouseDown(j, i, i2)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseMove(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("aba9736f", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnMouseMove(j, i, i2)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean deliverOnMouseUp(long j, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77904525", new Object[]{this, new Long(j), new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (a() || FBView.nativePlatformOnMouseUp(j, i, i2)) {
                return true;
            }
            return false;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public Object getBodyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("53d68ce", new Object[]{this});
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null) {
                return null;
            }
            return fBDocument.mRoot;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplateKeyboardService getDefaultKeyboardService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateKeyboardService) ipChange.ipc$dispatch("4611c4d7", new Object[]{this});
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null) {
                return null;
            }
            return fBDocument.T;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public FBContext getFbContext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FBContext) ipChange.ipc$dispatch("af71ea12", new Object[]{this});
            }
            return this.f4923a;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public Dialog getShowingDialog() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Dialog) ipChange.ipc$dispatch("62965b11", new Object[]{this});
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null) {
                return null;
            }
            return fBDocument.X;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplateKeyboardService getTemplateKeyboardService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplateKeyboardService) ipChange.ipc$dispatch("588103d2", new Object[]{this});
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null) {
                return null;
            }
            return fBDocument.R;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public TemplatePasswordService getTemplatePasswordService() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TemplatePasswordService) ipChange.ipc$dispatch("1170c352", new Object[]{this});
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null) {
                return null;
            }
            return fBDocument.Q;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean hasInput() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("24eec1db", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null || !fBDocument.c0) {
                return false;
            }
            return true;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean isFullscreen() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9d663290", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null || !fBDocument.P) {
                return false;
            }
            return true;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public boolean isOnloadFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97d8620d", new Object[]{this})).booleanValue();
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument == null || !fBDocument.isOnloadFinish()) {
                return false;
            }
            return true;
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public int nativeExecuteJs(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7afdec8b", new Object[]{this, str})).intValue();
            }
            if (a() || this.f4923a.mCore == 0) {
                return -1;
            }
            return FBDocument.nativeExcuteJs(this.f4923a.mCore, str);
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void safeExecuteJs(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf9a0e62", new Object[]{this, str});
                return;
            }
            FBDocument fBDocument = this.f4923a;
            if (!a() && fBDocument != null && fBDocument.mCore != 0) {
                FBDocument.a(fBDocument, str);
            }
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void setAutoFocus(FBFocusable fBFocusable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("393021ed", new Object[]{this, fBFocusable});
                return;
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument != null) {
                fBDocument.V = fBFocusable;
            }
        }

        @Override // com.alipay.android.app.template.FBPluginCtx
        public void setHasInput(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9204e9b", new Object[]{this, new Boolean(z)});
                return;
            }
            FBDocument fBDocument = this.f4923a;
            if (fBDocument != null) {
                fBDocument.c0 = z;
            }
        }
    }

    static {
        String str = new String(new byte[]{1});
        f4901a = str;
        String str2 = new String(new byte[]{2});
        b = str2;
        c = Pattern.compile(str);
        d = Pattern.compile(str2);
        FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0);
    }

    public FBDocument(BirdNestEngine.Params params) {
        this.C = null;
        this.actionBarHeight = 0;
        this.e0 = true;
        this.f0 = false;
        HashMap hashMap = new HashMap();
        this.n0 = hashMap;
        a(false, params.prepareTiming);
        gwt c2 = gwt.c();
        eng.a();
        AppContextHolder.feedAppContext(params.context);
        GlobalCacheForApi.a();
        this.k = params.context;
        this.param = params;
        String str = params.tid;
        this.y = str;
        this.z = params.tversion;
        this.A = params.ttime;
        if (BirdNestEngine.useSkipOldSwitches) {
            this.f0 = false;
        } else {
            this.f0 = getSwitch("birdnest_useOldActionSheet_v87", false);
        }
        c();
        a(params);
        FBLogger.d("FBDocument", "FBDocument()，tid: " + params.tid + ", biz: " + params.businessId);
        this.j = params.contextResources;
        this.actionBarHeight = params.actionBarHeight;
        a(params.getEngine());
        BirdNestEngine.ThemeColorProvider themeColorProvider = this.k0.getConfig().getThemeColorProvider();
        this.E = themeColorProvider != null ? themeColorProvider.themeBitsForCurrentDocument(this) : 0;
        this.u0 = themeColorProvider;
        BirdNestEngine.SettingProvider settingProvider = this.k0.getConfig().getSettingProvider();
        if (settingProvider != null) {
            Platform.d = settingProvider.getSwitch("gray_tb_design_token_231222", false);
        } else {
            Platform.d = false;
        }
        EventHandler eventHandler = params.dtmEventListener;
        if (eventHandler != null) {
            this.C = new DtmElementClickListener(eventHandler, params.businessId, this.k0.getConfig().getLogTracer());
        }
        FBDocumentAssistor.a(this.k);
        hashMap.clear();
        hashMap.put(y5v.TEMPLATE_ID, str);
        if (params.createImmediately) {
            this.mRoot = new FBView(this.k, new FBBodyFrameLayout(this.k), this);
            f();
            if (BirdNestEngine.useSkipOldSwitches) {
                this.e0 = true;
            } else {
                this.e0 = getSwitch("birdnest_large_width_protect", true);
            }
            FBDocumentAssistor.b(this, c2, 21, "Doc:create");
        }
    }

    @Deprecated
    public static Duktape createDuk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Duktape) ipChange.ipc$dispatch("c30cab20", new Object[0]);
        }
        eng.a();
        long createContext = Duktape.createContext();
        if (createContext != 0) {
            return new Duktape(createContext);
        }
        throw new OutOfMemoryError("Cannot create Duktape instance");
    }

    public static Duktape createDukV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Duktape) ipChange.ipc$dispatch("10704a84", new Object[0]);
        }
        eng.a();
        long dukV2CreateContext = Duktape.dukV2CreateContext();
        if (dukV2CreateContext != 0) {
            return new Duktape(dukV2CreateContext);
        }
        throw new OutOfMemoryError("Cannot create Duktape instance");
    }

    public static native int nativeCallJsMethod(long j, long j2, Object[] objArr);

    public static native int nativeCallJsMethodWithJson(long j, long j2, String str);

    public static native int nativeCoreBuildDom(long j, String str, String str2, int i2, boolean z);

    public static native int nativeCoreLayoutAndNotify(long j);

    public static native int nativeCoreLoad(long j, String str, String str2, int i2, boolean z);

    public static native long nativeCoreNew(FBDocument fBDocument, boolean z);

    public static native int nativeCoreReLoadData(long j, String str);

    public static native void nativeDestroyCore(long j);

    public static native int nativeExcuteJs(long j, String str);

    public static native String nativeExecuteJsWithResult(long j, String str);

    public static native void nativeInvokeCallback(long j, String str, String str2);

    public static native void nativeMarkRenderSeqEventTiming(long j, long j2, int i2);

    public static native void nativeSendPrepareTiming(long j, long j2);

    public static native void nativeSendRenderTiming(long j, long j2);

    public static native void nativeSetRemParams(long j, float f2, boolean z);

    public static native String queryViewId(long j, String str);

    public static void setTidToDebug(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428ceb5c", new Object[]{str});
        } else {
            e = str;
        }
    }

    public void addCoreSampleLog(int i2, long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1e9bac", new Object[]{this, new Integer(i2), new Long(j), new Long(j2), str});
        } else {
            Platform.a(i2, j, j2, this.y, str, null);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public int callJsMethod(long j, Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a30e8ef", new Object[]{this, new Long(j), objArr})).intValue();
        }
        try {
            if (this.mCore == 0) {
                pgh.e("FBDocument_js_call", "dynamic exception case 000-005, this: " + this);
                return -1;
            }
            gwt a2 = FBDocumentAssistor.a(this);
            int nativeCallJsMethod = nativeCallJsMethod(this.mCore, j, objArr);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCallJsMethod_api");
            return nativeCallJsMethod;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public boolean configRemScaled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6938bfd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void destroy(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226d31e4", new Object[]{this, map});
            return;
        }
        gwt a2 = FBDocumentAssistor.a(this);
        ArrayList<CountDownTimer> arrayList = this.H;
        if (arrayList != null) {
            Iterator<CountDownTimer> it = arrayList.iterator();
            while (it.hasNext()) {
                CountDownTimer next = it.next();
                if (next.isTimerFinishing) {
                    FBLogger.e("FBDocument", "already has timer finishing, ignore destroying core!");
                    this.mCore = 0L;
                }
                next.pause();
            }
        }
        if (this.B) {
            FBLogger.e("FBDocument", "already has event in processing, ignore destroying core!");
            this.mCore = 0L;
        }
        Set<InvokeThreadPoolTask.TaskResult> set = this.W;
        if (set != null && !set.isEmpty()) {
            Handler handler = InvokeThreadPoolTask.HandlerInstanceHolder.f3833a;
            for (InvokeThreadPoolTask.TaskResult taskResult : set) {
                handler.removeMessages(16, taskResult);
            }
        }
        this.W.clear();
        this.j0.clear();
        if (this.Y.size() > 0) {
            for (FBClickCallBack fBClickCallBack : this.Y) {
                fBClickCallBack.clear();
            }
            this.Y.clear();
        }
        try {
            TemplateKeyboardService templateKeyboardService = this.R;
            if (templateKeyboardService != null) {
                Context context = this.k;
                if (context instanceof Activity) {
                    templateKeyboardService.destroyKeyboard(((Activity) context).getWindow().getDecorView());
                    this.R = null;
                }
            }
        } catch (Throwable th) {
            if (!BirdNestEngine.useNoFootprint) {
                Tracker.recordFootprint("In FBDocument.destroy() destroyKeyboard failed", th.getMessage(), "", null);
            }
        }
        this.g0 = null;
        FBPluginCtx fBPluginCtx = this.h0;
        if (fBPluginCtx != null && (fBPluginCtx instanceof FBContextHandle)) {
            ((FBContextHandle) fBPluginCtx).f4923a = null;
            this.h0 = null;
        }
        HashMap<String, FBLabel> hashMap = this.G;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.C = null;
        FBNav fBNav = this.u;
        if (fBNav != null) {
            fBNav.destroy();
            this.u = null;
        }
        FBView fBView = this.mRoot;
        if (fBView != null) {
            fBView.destroy();
            this.mRoot = null;
        }
        ArrayList<FBScrollView> arrayList2 = this.I;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList<FBHScrollView> arrayList3 = this.J;
        if (arrayList3 != null) {
            arrayList3.clear();
        }
        ArrayList<CountDownTimer> arrayList4 = this.H;
        if (arrayList4 != null) {
            Iterator<CountDownTimer> it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.H.clear();
        }
        HashMap<String, FBView> hashMap2 = this.F;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        FBRootFrameLayout fBRootFrameLayout = this.v;
        if (fBRootFrameLayout != null) {
            fBRootFrameLayout.setOnSizeChangedListener(null);
            if (getEngine() != null) {
                try {
                    this.v.setTag(getEngine().getTagId(), null);
                } catch (IllegalArgumentException e2) {
                    FBLogger.e("FBDocument", e2);
                }
            }
            this.v = null;
        }
        FBPartialVisibilityHelper fBPartialVisibilityHelper = this.K;
        if (fBPartialVisibilityHelper != null) {
            synchronized (fBPartialVisibilityHelper) {
                fBPartialVisibilityHelper.c = null;
            }
        }
        this.V = null;
        this.U = null;
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "异常场景，重复 destroy FBDocument, options: " + map);
        }
        synchronized (this) {
            try {
                if (this.mCore != 0) {
                    long j = this.mCore;
                    this.mCore = 0L;
                    gwt a3 = FBDocumentAssistor.a(this);
                    nativeDestroyCore(j);
                    FBDocumentAssistor.a(this, a3, 21, "Doc:nativeDestroyCore");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a0 = null;
        this.T = null;
        this.param = null;
        this.k = null;
        this.k0 = null;
        j();
        FBDocumentAssistor.a(this, a2, 21, "Doc:destroy");
    }

    public void dispatchCoreTask(int i2, final FBDocument fBDocument, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39df5025", new Object[]{this, new Integer(i2), fBDocument, new Long(j), new Long(j2)});
            return;
        }
        pgh.i("FBDocument", "dispatchCoreTask: get " + i2 + ", " + j + ", " + j2);
        if (i2 == 1) {
            a(6, this, i, (FBContext.JsExecCallback) null, new ks9() { // from class: tb.vt8
                @Override // tb.ks9
                public final Object apply(Object obj) {
                    Pair a2;
                    FBDocument fBDocument2 = fBDocument;
                    long j3 = j;
                    a2 = FBDocument.this.a(fBDocument2, j3, j2, (Void) obj);
                    return a2;
                }
            });
        } else if (i2 != 2) {
            pgh.e("FBDocument", "dispatchCoreTask: unknown type: " + i2);
        } else {
            jst.b.submit(new Runnable() { // from class: tb.ut8
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.this.a(fBDocument, j, j2);
                }
            });
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public int executeJs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("314d87a2", new Object[]{this, str})).intValue();
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-003, this: " + this);
            return -1;
        }
        try {
            return nativeExcuteJs(this.mCore, str);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName().concat("executeJs"), th);
            return -1;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    @Deprecated
    public String executeJsWithResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86f7484e", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-004, this: " + this);
            return null;
        }
        try {
            return nativeExecuteJsWithResult(this.mCore, str);
        } catch (Throwable th) {
            FBLogger.e(getClass().getName().concat("executeJs"), th);
            return null;
        }
    }

    public FBView findViewById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBView) ipChange.ipc$dispatch("8b320212", new Object[]{this, str});
        }
        return this.F.get(str);
    }

    public void flushCoreSampleLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95053cbe", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBFocusable getAutoFocusable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBFocusable) ipChange.ipc$dispatch("69b70b5f", new Object[]{this});
        }
        return this.V;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.M;
    }

    @Override // com.alipay.android.app.template.FBContext
    public float getBodyOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b386c5ca", new Object[]{this})).floatValue();
        }
        return this.mRoot.getOpacity();
    }

    public ClickMode getClickMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClickMode) ipChange.ipc$dispatch("339414ba", new Object[]{this});
        }
        return this.m0;
    }

    public String getClientInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b68dd74a", new Object[]{this});
        }
        BirdNestEngine birdNestEngine = this.k0;
        if (birdNestEngine == null || birdNestEngine.getConfig() == null || this.k0.getConfig().getDevicePropProvider() == null) {
            return "";
        }
        return this.k0.getConfig().getDevicePropProvider().getProperty("getClientInfo", null);
    }

    @Override // com.alipay.android.app.template.FBContext
    public View getContentView() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        if (this.v == null) {
            if (this.p == null) {
                this.p = new gwt();
            }
            FBRootFrameLayout fBRootFrameLayout = new FBRootFrameLayout(this.k);
            fBRootFrameLayout.setOnSizeChangedListener(this);
            try {
                fBRootFrameLayout.addView(b());
            } catch (NullPointerException e2) {
                Context context = this.k;
                if (context != null) {
                    str = context.getClass().getName();
                } else {
                    str = "unknown";
                }
                try {
                    AntEvent.Builder builder = new AntEvent.Builder();
                    builder.setEventID("10111088");
                    builder.setBizType("paymonitor");
                    builder.addExtParam("type", ErrorType.DEFAULT);
                    builder.addExtParam("location", "FBDocument#getContentView");
                    builder.addExtParam("detail", "NullPointerException");
                    AntEvent build = builder.build();
                    if (BirdNestEngine.useLogBatch) {
                        BirdNestEngine.eventBatchRunner.c(build);
                    } else {
                        build.send();
                    }
                } catch (Exception unused) {
                }
                FBLogger.e("FBDocument", "严重错误，调用时序有严重问题, context: ".concat(str), e2);
                Tracker.exceptionPoint(this.param.getEngine().getEngineLogTracer(), this.y, "严重错误，调用时序有严重问题, context: ".concat(str), e2);
            }
            fBRootFrameLayout.setTag(getEngine().getTagId(), this);
            this.v = fBRootFrameLayout;
        }
        return this.v;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.k;
    }

    public String getCustomAttr(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ecf637", new Object[]{this, str});
        }
        OnTemplateClickListener onTemplateClickListener = this.C;
        if (onTemplateClickListener != null) {
            return onTemplateClickListener.onGetCustomAttr(this, str);
        }
        return "";
    }

    @Override // com.alipay.android.app.template.FBContext
    public TemplateKeyboardService getDefaultKeyboardService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateKeyboardService) ipChange.ipc$dispatch("4611c4d7", new Object[]{this});
        }
        return this.T;
    }

    public TElementEventHandler getElementEventObserver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TElementEventHandler) ipChange.ipc$dispatch("ec6e8117", new Object[]{this});
        }
        return this.D;
    }

    public BirdNestEngine getEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BirdNestEngine) ipChange.ipc$dispatch("66fb5877", new Object[]{this});
        }
        return this.k0;
    }

    public boolean getGlobalClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dee9b7a", new Object[]{this})).booleanValue();
        }
        return this.Z;
    }

    @Deprecated
    public String getIndexUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de74d426", new Object[]{this});
        }
        return this.x;
    }

    public HashMap<String, String> getLogParam4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f56ce75f", new Object[]{this});
        }
        return this.O;
    }

    @Override // com.alipay.android.app.template.FBContext
    public Object getParameter(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("36c81d12", new Object[]{this, str, obj});
        }
        return this.j0.get(str);
    }

    @Override // com.alipay.android.app.template.FBContext
    public Map<String, ?> getParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("367605c", new Object[]{this});
        }
        return this.j0;
    }

    public String getProp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4534ba2c", new Object[]{this, str, str2});
        }
        gwt a2 = FBDocumentAssistor.a(this);
        if (this.k == null) {
            FBLogger.d("FBDocument", "document.getProp mContext == null");
            return null;
        }
        String performGetProp = JSPluginManager.getInstanse().performGetProp(this.k, str, str2);
        FBLogger.d("FBDocument", "document.getProp oldway name: " + str + ", args: " + str2 + ", result: " + performGetProp);
        StringBuilder sb = new StringBuilder("Doc:getProp_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        FBDocumentAssistor.a(this, a2, 21, sb.toString());
        return performGetProp;
    }

    public String getRawSwitch(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79708ca9", new Object[]{this, str});
        }
        try {
            BirdNestEngine engine = getEngine();
            if (engine != null) {
                return engine.getConfig().getSettingProvider().getRawSwitch(str, "");
            }
            return "";
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return "";
        }
    }

    public float getRemScale() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96fedfbd", new Object[]{this})).floatValue();
        }
        return this.t;
    }

    public int getScrollTop(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b52de596", new Object[]{this, str})).intValue();
        }
        try {
            FBView findViewById = findViewById(str);
            if (findViewById != null) {
                return findViewById.getScrollTop();
            }
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
        }
        return 0;
    }

    @Override // com.alipay.android.app.template.FBContext
    public Dialog getShowingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("62965b11", new Object[]{this});
        }
        return this.X;
    }

    public String getSpmId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c146b0e4", new Object[]{this});
        }
        return this.L;
    }

    public String getStorageForKey(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2efbe118", new Object[]{this, str, new Boolean(z)});
        }
        return FBDocumentAssistor.a(getEngine().inMemKV, str, z);
    }

    public boolean getSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c2620fd", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (str.equals("bn_rollback_scroll_change")) {
            return false;
        }
        try {
            BirdNestEngine engine = getEngine();
            if (engine != null) {
                return engine.getConfig().getSettingProvider().getSwitch(str, z);
            }
            return z;
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return z;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public TemplateKeyboardService getTemplateKeyboardService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateKeyboardService) ipChange.ipc$dispatch("588103d2", new Object[]{this});
        }
        return this.R;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.y;
    }

    public String getViewEncryptValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c1d7f88", new Object[]{this, str});
        }
        return this.F.get(str).getEncryptValue();
    }

    public void handleJSException(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9c7b83", new Object[]{this, str, str2, str3});
            return;
        }
        if (str == null) {
            str = this.y;
        }
        FBDocumentAssistor.a(str, str2, str3);
    }

    public void handleTwoArgsFunc(final String str, final long j, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d04298", new Object[]{this, str, new Long(j), str2});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FBDocument fBDocument = FBDocument.this;
                    String str3 = str;
                    long j2 = j;
                    String str4 = str2;
                    IpChange ipChange3 = FBDocument.$ipChange;
                    fBDocument.a(str3, j2, str4);
                }
            });
        } else {
            a(str, j, str2);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean hasInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24eec1db", new Object[]{this})).booleanValue();
        }
        return this.c0;
    }

    public boolean hiddenKeyboardService(View view, boolean z) {
        Throwable th;
        boolean z2;
        TemplateKeyboardService templateKeyboardService;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f78fdd11", new Object[]{this, view, new Boolean(z)})).booleanValue();
        }
        try {
            if (this.S || (templateKeyboardService = this.R) == null) {
                z2 = false;
            } else {
                z2 = templateKeyboardService.hideKeyboard(view);
            }
            if (!z) {
                return z2;
            }
            if (z2) {
                return true;
            }
            try {
                if (this.T.hideKeyboard(view)) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                z3 = z2;
                FBLogger.e("FBDocument", th);
                return z3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        if (params == null || !params.tmFlagsPrerenderV2) {
            return false;
        }
        return true;
    }

    public boolean invoke(int i2, final String str, final String str2, long j) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66b53cd0", new Object[]{this, new Integer(i2), str, str2, new Long(j)})).booleanValue();
        }
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            this.k0.getDetachedExecutorService().submit(new Runnable() { // from class: tb.iu8
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.this.a(str, str2);
                }
            });
            return true;
        } else if (this.k == null || this.mCore == 0) {
            return false;
        } else {
            long j2 = this.mCore;
            if (!JSPluginManager.getInstanse().containsInvoke(this.k, str)) {
                return false;
            }
            this.W.add(new AnonymousClass16(this.k0.getInvokeExecutorService(), j2, z2, str, str2, j).a());
            return true;
        }
    }

    public String invokeNode(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d9ff6941", new Object[]{this, str, str2, str3});
        }
        try {
            FBView findViewById = findViewById(str);
            if (findViewById != null) {
                return findViewById.invoke(str2, str3);
            }
            return null;
        } catch (Throwable th) {
            FBLogger.e("FBDocument", th);
            return null;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isFullscreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d663290", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isJsDebuggerEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("528cc958", new Object[]{this})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        if (params == null || !params.jsDebugger) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.android.app.template.FBContext
    public boolean isOnloadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97d8620d", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        }
    }

    public void layout(FBView fBView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7336f48e", new Object[]{this, fBView});
        } else if (this.mCore != 0 && this.k != null && fBView != null && fBView.mNode != 0) {
            gwt a2 = FBDocumentAssistor.a(this);
            nativeNodeDirtyLayout(fBView.mNode);
            nativeCoreLayout(this.mCore);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreLayout_api");
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void layoutNodeWithDimensions(long j, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ec12be", new Object[]{this, new Long(j), new Integer(i2), new Integer(i3)});
        } else if (this.k != null && this.mCore != 0) {
            gwt a2 = FBDocumentAssistor.a(this);
            nativeNodeSetMeasure(j, i2, i3);
            nativeCoreLayout(this.mCore);
            FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreLayout_apiDimen");
        }
    }

    public final native void nativeCallCoreFuncPtr(FBDocument fBDocument, long j, long j2);

    public final native void nativeCoreLayout(long j);

    public final native void nativeNodeDirtyLayout(long j);

    public final native void nativeNodeSetMeasure(long j, int i2, int i3);

    public final native void nativeUpdateScreenSize(long j, int i2, int i3);

    public void onLoadFinish() {
        FBView fBView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23670df", new Object[]{this});
        } else if (i()) {
            pgh.b("FBDocument", "tmFlags: rearranged onload cancelled here");
        } else {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                g();
            } else {
                Runnable runnable = new Runnable() { // from class: com.flybird.FBDocument.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument fBDocument = FBDocument.this;
                            IpChange ipChange3 = FBDocument.$ipChange;
                            fBDocument.g();
                            if (!BirdNestEngine.useNoFootprint) {
                                BirdNestEngine.LogTracer2 logTracer = FBDocument.this.k0.getConfig().getLogTracer();
                                FBDocument fBDocument2 = FBDocument.this;
                                Tracker.recordPerformance(logTracer, fBDocument2.y, fBDocument2.n0);
                            }
                        } catch (Exception e2) {
                            FBLogger.e("FBDocument", "ui render failed, fbDocument destroyed!" + e2.getMessage());
                        }
                    }
                };
                if (this.m) {
                    this.b0.postAtFrontOfQueue(runnable);
                } else {
                    this.b0.post(runnable);
                }
            }
            FBView fBView2 = this.mRoot;
            Context context = (fBView2 == null || fBView2.getInnerView() == null) ? null : this.mRoot.getInnerView().getContext();
            if (context == null) {
                context = this.k;
            }
            if (context == null || (fBView = this.mRoot) == null) {
                FBLogger.e("FBDocument", "mRoot is null or ctx is null");
                return;
            }
            int innerViewTag = fBView.getInnerViewTag();
            View innerView = this.mRoot.getInnerView();
            FBView fBView3 = this.mRoot;
            FBView.dispatchOnLongClickEvent(false, false, innerView, fBView3, fBView3, innerViewTag);
        }
    }

    @Override // com.flybird.FBRootFrameLayout.OnSizeChangedListener
    public void onSizeChanged(final int i2, final int i3, int i4, int i5) {
        FBView fBView;
        FBView fBView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.k != null && (fBView = this.mRoot) != null && fBView.getInnerView() != null && i2 != 0 && i3 != 0 && (fBView2 = this.mRoot) != null) {
            fBView2.getInnerView().post(new Runnable() { // from class: com.flybird.FBDocument.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FBView fBView3 = FBDocument.this.mRoot;
                    if (fBView3 != null && fBView3.getInnerView() != null) {
                        boolean z2 = (i2 == FBDocument.this.mRoot.getInnerView().getWidth() || i2 == FBDocument.this.screenSize[0]) ? false : true;
                        if (i3 == FBDocument.this.mRoot.getInnerView().getHeight() || i3 == FBDocument.this.screenSize[1]) {
                            z = false;
                        }
                        FBLogger.d("FBDocument", "onSizeChanged, autoAdaptWindow: " + FBDocument.this.l + ", heightChanged: " + z + ", widthChanged: " + z2);
                        FBDocument fBDocument = FBDocument.this;
                        if (!fBDocument.e0 || i2 <= 8192) {
                            if (z2 || (z && fBDocument.l)) {
                                fBDocument.handleWindowSizeChanged(i2, i3);
                            }
                            FBView fBView4 = FBDocument.this.mRoot;
                            if (fBView4 != null && fBView4.getInnerView() != null) {
                                FBDocument.this.mRoot.getInnerView().setVisibility(0);
                                return;
                            }
                            return;
                        }
                        FBLogger.d("FBDocument", "过宽保护逻辑生效, w: " + i2);
                    }
                }
            });
        }
    }

    public void openUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edf7b396", new Object[]{this, str});
        } else {
            getEngine().getConfig().getUiWidgetProvider().openWebPage(str, this.N, this.k);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public View queryView(String str) {
        HashMap<String, FBView> hashMap;
        FBView fBView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bea78320", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-006, this: " + this);
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            String queryViewId = queryViewId(this.mCore, str);
            if (!(TextUtils.isEmpty(queryViewId) || (hashMap = this.F) == null || (fBView = hashMap.get(queryViewId)) == null)) {
                return fBView.getInnerView();
            }
        } else {
            FBLogger.e("FBDocument", "dynamic exception case 000-007, this: " + this);
        }
        return null;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void reloadData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73108f34", new Object[]{this, str});
            return;
        }
        this.p = new gwt();
        reloadDataWithResult(str);
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBContext.ReloadResult reloadDataWithResult(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext.ReloadResult) ipChange.ipc$dispatch("3e5a4917", new Object[]{this, str});
        }
        if (this.mCore == 0) {
            FBLogger.e("FBDocument", "dynamic exception case 000-002, this: " + this + ", json: " + str);
            return FBContext.ReloadResult.INVALID_STATE;
        }
        if (this.mCore != 0) {
            updateDensity(this.mCore, FBTools.getDp(this.k));
        }
        a(Thread.currentThread());
        nativeCoreReLoadData(this.mCore, str);
        if (this.param.callback != null || i()) {
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FBDocument.this.mCore != 0) {
                        FBDocument fBDocument = FBDocument.this;
                        if (fBDocument.param != null) {
                            if (!fBDocument.w && fBDocument.i()) {
                                pgh.b("FBDocument", "tmFlags: rearranged onload trigger here");
                                FBDocument.this.g();
                            }
                            FBDocument.this.a(Thread.currentThread());
                            FBDocument fBDocument2 = FBDocument.this;
                            OnLoadCallback onLoadCallback = fBDocument2.param.callback;
                            if (onLoadCallback != null) {
                                onLoadCallback.onLoadFinish(fBDocument2, true);
                            }
                        }
                    }
                }
            });
        }
        return FBContext.ReloadResult.OK;
    }

    @Override // com.alipay.android.app.template.FBContext
    public void safeCallJsMethod(final long j, final Object[] objArr, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf9e004", new Object[]{this, new Long(j), objArr, jsExecOptions, jsExecCallback});
        } else {
            a(2, this, jsExecOptions, jsExecCallback, new ks9() { // from class: tb.xt8
                @Override // tb.ks9
                public final Object apply(Object obj) {
                    Pair a2;
                    a2 = FBDocument.this.a(j, objArr, (Void) obj);
                    return a2;
                }
            });
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void safeExecuteJs(final String str, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback) {
        final boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365c932b", new Object[]{this, str, jsExecOptions, jsExecCallback});
            return;
        }
        if (!(jsExecCallback == null || jsExecOptions.getCallbackMode() == 0)) {
            z = true;
        }
        a(1, this, jsExecOptions, jsExecCallback, new ks9() { // from class: tb.tt8
            @Override // tb.ks9
            public final Object apply(Object obj) {
                Pair a2;
                a2 = FBDocument.this.a(z, str, (Void) obj);
                return a2;
            }
        });
    }

    @Deprecated
    public void setActionBarHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329d9fda", new Object[]{this, new Integer(i2)});
        } else {
            this.actionBarHeight = i2;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setAutoFocusable(FBFocusable fBFocusable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a168f53", new Object[]{this, fBFocusable});
        } else {
            this.V = fBFocusable;
        }
    }

    public void setBizSource(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f0025d", new Object[]{this, str});
        } else {
            this.N = str;
        }
    }

    public void setClickMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d87eda", new Object[]{this, str});
        } else if ("global".equals(str)) {
            this.m0 = ClickMode.GLOBAL_PROTECT_CLICK;
        } else if ("individual".equals(str)) {
            this.m0 = ClickMode.INDIVIDUAL_PROTECT_CLICK;
        } else if ("none".equals(str)) {
            this.m0 = ClickMode.NO_PROTECT_CLICK;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.k = context;
        }
    }

    public void setElementEventObserver(TElementEventHandler tElementEventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e8ee0f", new Object[]{this, tElementEventHandler});
        } else {
            this.D = tElementEventHandler;
        }
    }

    public void setGlobalClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33e21b2a", new Object[]{this, new Boolean(z)});
        } else {
            setGlobalClick(z, 600L);
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setHasInput(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9204e9b", new Object[]{this, new Boolean(z)});
        } else {
            this.c0 = z;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void setParameter(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832e3a94", new Object[]{this, str, obj});
            return;
        }
        this.j0.put(str, obj);
        if (BirdNestEngine.Params.KEY_INDEX_URL.equals(str)) {
            this.x = (String) obj;
        } else if (BirdNestEngine.Params.KEY_VIRTUAL_HOST.equals(str)) {
            String str2 = (String) obj;
        }
    }

    public void setStorage(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c76ac80", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            FBDocumentAssistor.a(getEngine().inMemKV, str, str2, z);
        }
    }

    public final native boolean shouldSampleLog(long j, int i2);

    public final native void updateDensity(long j, float f2);

    public void updateLayout(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c030cfa4", new Object[]{this, str});
        } else if (this.mCore == 0 || this.k0 == null) {
            FBLogger.e("FBDocument", "FBDocument has been destroyed!");
        } else {
            if (!isOnloadFinish()) {
                this.o0 = System.currentTimeMillis();
            }
            final gwt a2 = FBDocumentAssistor.a(this);
            String str2 = "run";
            if (Looper.myLooper() != Looper.getMainLooper()) {
                final ConditionVariable conditionVariable = new ConditionVariable();
                Runnable runnable = new Runnable() { // from class: com.flybird.FBDocument.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        String str3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument fBDocument = FBDocument.this;
                            if (fBDocument.k0 != null && !fBDocument.isOnloadFinish()) {
                                long currentTimeMillis = System.currentTimeMillis() - FBDocument.this.o0;
                                if (currentTimeMillis > 1000) {
                                    Tracker.errorPoint(FBDocument.this.k0.getConfig().getLogTracer(), FBDocument.this.y, "schedule from " + Thread.currentThread() + " thread to ui thread cost: " + currentTimeMillis);
                                }
                                FBDocument.this.n0.put("bd_uiScheduleTime", String.valueOf(currentTimeMillis));
                            }
                            FBDocument fBDocument2 = FBDocument.this;
                            gwt gwtVar = a2;
                            if (!fBDocument2.isOnloadFinish()) {
                                str3 = "init";
                            } else {
                                str3 = "run";
                            }
                            FBDocumentAssistor.c(fBDocument2, gwtVar, 21, "Doc:updateLayout_wait_".concat(str3));
                            FBDocument.this.a(str);
                            if (FBDocument.this.d0) {
                            }
                        } catch (Throwable th) {
                            try {
                                LogCatLog.e("FBDocument", th);
                            } finally {
                                if (!FBDocument.this.d0) {
                                    conditionVariable.open();
                                }
                            }
                        }
                    }
                };
                if (this.m) {
                    this.b0.postAtFrontOfQueue(runnable);
                } else {
                    this.b0.post(runnable);
                }
                if (!this.d0) {
                    conditionVariable.block();
                    if (!isOnloadFinish()) {
                        str2 = "init";
                    }
                    FBDocumentAssistor.c(this, a2, 21, "Doc:updateLayout_bg_".concat(str2));
                    return;
                }
                return;
            }
            a(str);
            if (!isOnloadFinish()) {
                str2 = "init";
            }
            FBDocumentAssistor.a(this, a2, 21, "Doc:updateLayout_fg_".concat(str2));
        }
    }

    public void updateRemScale(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885b0b00", new Object[]{this, new Float(f2)});
        } else {
            this.t = f2;
        }
    }

    public static /* synthetic */ boolean a(FBDocument fBDocument, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e64329", new Object[]{fBDocument, new Boolean(z)})).booleanValue();
        }
        fBDocument.Z = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void b(int i2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("fc632983", new Object[]{this, new Integer(i2)});
        }
        if (this.r && this.mCore != 0) {
            if (this.q == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("tpl_time", this.A);
                hashMap.put("tpl_version", this.z);
                this.q = hashMap;
            }
            if (this.o != null) {
                nativeSendPrepareTiming(this.mCore, this.o.f20276a);
                String str = this.y;
                Map<String, String> map = this.q;
                long j = this.o.f20276a;
                Platform.a(1, 21L, 0L, str, "Doc:preparePoint", map);
                this.o = null;
            }
            if (this.p != null) {
                nativeSendRenderTiming(this.mCore, this.p.f20276a);
                String str2 = this.y;
                Map<String, String> map2 = this.q;
                long j2 = this.p.f20276a;
                Platform.a(1, 21L, 0L, str2, "Doc:renderPoint", map2);
                this.p = null;
            }
            nativeMarkRenderSeqEventTiming(this.mCore, SystemClock.elapsedRealtimeNanos(), i2);
            HashMap hashMap2 = new HashMap(this.q);
            hashMap2.put("size", String.valueOf(i2));
            Platform.a(1, 21L, 0L, this.y, "Doc:drawPoint", hashMap2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        View innerView = FBView.getInnerView(getBodyView());
        if (innerView != null) {
            innerView.setFocusableInTouchMode(true);
            innerView.setFocusable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            gwt a2 = FBDocumentAssistor.a(this);
            FBDocumentAssistor.a(this, FBDocumentAssistor.a(this), 21, "Doc:test_inner");
            FBDocumentAssistor.a(this, a2, 21, "Doc:test_outer");
        } catch (Throwable th) {
            pgh.f("FBDocument", "testing err", th);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        IpChange ipChange2 = Platform.$ipChange;
        BirdNestEngine.useValueCache = true;
        _FBDocumentInitializer.CachingModel cachingModel = (_FBDocumentInitializer.CachingModel) uca.c("Timed:EngineDocSwitches");
        if (cachingModel != null) {
            this.m = cachingModel.b;
            this.n = cachingModel.c;
            BirdNestEngine.rollbackAntEvent = false;
            BirdNestEngine.useLogBatch = cachingModel.d;
            BirdNestEngine.useNoFootprint = cachingModel.e;
            BirdNestEngine.useDelayedTorchBind = false;
            BirdNestEngine.useSkipOldSwitches = cachingModel.f;
            BirdNestEngine.useDelayedImgLoading = cachingModel.h;
            BirdNestEngine.useSimpleActionSplit = cachingModel.i;
            BirdNestEngine.globalPerfRatioOf10000 = cachingModel.j;
            uca.f29291a = cachingModel.g;
            BirdNestEngine.optimizationFlag = String.valueOf(cachingModel.k);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(e) && e.equals(this.param.tid)) {
            final String str = this.param.tid;
            FBLogger.d("FBDocument", "got tidToDebug: " + e);
            this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Context context = FBDocument.this.k;
                    Toast.makeText(context, "即将调试模板:" + str + "，请在 vs code 执行 attach 操作", 1).show();
                }
            });
            this.param.jsDebugger = true;
        }
        BirdNestEngine.Params params = this.param;
        if (params != null) {
            int i2 = params.initialWinWidth;
            if (i2 != 0) {
                this.screenSize[0] = i2;
            }
            int i3 = params.initialWinHeight;
            if (i3 != 0) {
                this.screenSize[1] = i3;
            }
        }
        if (params == null || !params.jsDebugger) {
            if (this.mCore != 0) {
                FBLogger.e("FBDocument", "模板加载重入");
            }
            gwt gwtVar = new gwt();
            String str2 = this.param.tplJson;
            if (TextUtils.isEmpty(str2)) {
                str2 = this.param.tplHtml;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (str2 != null && !str2.contains("{")) {
                    String str3 = new String(Base64.decode(str2));
                    if (!BirdNestEngine.useNoFootprint) {
                        int i4 = !str3.contains("{") ? 2 : 1;
                        Tracker.recordFootprint(this.k0.getEngineLogTracer(), this.y, "function: loadTemplate, check point " + i4 + ", invalid tpl content: " + str3 + ", stacktrace: " + a(Thread.currentThread().getStackTrace()));
                    }
                    str2 = str3;
                }
                String str4 = this.param.varJson;
                a(Thread.currentThread());
                gwt a2 = FBDocumentAssistor.a(this);
                this.mCore = nativeCoreNew(this, AppContextHolder.b);
                FBDocumentAssistor.a(this, a2, 21, "Doc:nativeCoreNew");
                if (this.mCore != 0) {
                    shouldSampleLog(this.mCore, 3);
                    this.r = shouldSampleLog(this.mCore, 1);
                    shouldSampleLog(this.mCore, 2);
                    updateDensity(this.mCore, FBTools.getDp(this.k));
                    nativeSetRemParams(this.mCore, this.t, this.s);
                }
                gwt a3 = FBDocumentAssistor.a(this);
                long j = this.mCore;
                BirdNestEngine.Params params2 = this.param;
                int nativeCoreLoad = nativeCoreLoad(j, str2, str4, params2.renderOptFlag, params2.jsDebugger);
                FBDocumentAssistor.a(this, a3, 21, "Doc:nativeCoreLoad");
                if (this.mRoot == null || b() == null) {
                    Map<String, Object> map = this.param.extParams;
                    String valueOf = (map == null || !map.containsKey("tplId")) ? null : String.valueOf(this.param.extParams.get("tplId"));
                    if (valueOf != null) {
                        String concat = "birdnest render local tpl failed! tplId: ".concat(valueOf);
                        FBLogger.e("FBDocument", "birdnest_render_local_failed, tid: ".concat(valueOf));
                        Tracker.errorPoint(this.k0.getConfig().getLogTracer(), valueOf, concat);
                    } else {
                        FBLogger.e("FBDocument", "birdnest_render_local_failed_unknown_tplId");
                        Tracker.errorPoint(this.k0.getConfig().getLogTracer(), "unknown", "birdnest render local tpl failed! unknown tplid");
                    }
                }
                if (nativeCoreLoad == 0) {
                    this.i0 = true;
                    if (this.param.callback != null) {
                        this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                FBDocument fBDocument;
                                BirdNestEngine.Params params3;
                                OnLoadCallback onLoadCallback;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (FBDocument.this.mCore != 0 && (params3 = (fBDocument = FBDocument.this).param) != null && (onLoadCallback = params3.callback) != null) {
                                    onLoadCallback.onLoadFinish(fBDocument, false);
                                }
                            }
                        });
                    }
                    h();
                    if (this.r) {
                        FBDocumentAssistor.a(this, gwtVar, 21, "Doc:loadTemplate");
                        return;
                    }
                    return;
                }
                FBLogger.e("FBDocument", "load failed, tplContent: \n<<<<<<\n" + str2 + "\n======\ndataOrJs: " + str4 + "\n>>>>>>\n");
                StringBuilder sb = new StringBuilder("template or data passed to document is invalid! template:");
                sb.append(str2);
                sb.append(" dataOrJs: ");
                sb.append(str4);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
                Tracker.exceptionPoint(this.k0.getConfig().getLogTracer(), this.y, "load failed", illegalArgumentException);
                throw illegalArgumentException;
            }
            throw new IllegalArgumentException("The template content is empty!");
        }
        if (this.p0 == null) {
            HandlerThread handlerThread = new HandlerThread("Duk-js-debugger");
            this.p0 = handlerThread;
            handlerThread.start();
            this.q0 = new Handler(this.p0.getLooper());
        }
        this.q0.post(new Runnable() { // from class: com.flybird.FBDocument.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                String str5;
                int i5 = 1;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String str6 = FBDocument.this.param.tplJson;
                if (TextUtils.isEmpty(str6)) {
                    str6 = FBDocument.this.param.tplHtml;
                }
                if (!TextUtils.isEmpty(str6)) {
                    if (str6 == null || str6.contains("{")) {
                        str5 = str6;
                    } else {
                        String str7 = new String(Base64.decode(str6));
                        if (!BirdNestEngine.useNoFootprint) {
                            if (!str7.contains("{")) {
                                i5 = 2;
                            }
                            Tracker.recordFootprint(FBDocument.this.k0.getEngineLogTracer(), FBDocument.this.y, "function: loadTemplate, check point " + i5 + ", invalid tpl content: " + str7 + ", stacktrace: " + FBDocument.a(Thread.currentThread().getStackTrace()));
                        }
                        str5 = str7;
                    }
                    FBDocument fBDocument = FBDocument.this;
                    final String str8 = fBDocument.param.varJson;
                    fBDocument.mCore = FBDocument.nativeCoreNew(fBDocument, AppContextHolder.b);
                    if (FBDocument.this.mCore != 0) {
                        FBDocument fBDocument2 = FBDocument.this;
                        fBDocument2.updateDensity(fBDocument2.mCore, FBTools.getDp(FBDocument.this.k));
                        long j2 = FBDocument.this.mCore;
                        FBDocument fBDocument3 = FBDocument.this;
                        FBDocument.nativeSetRemParams(j2, fBDocument3.t, fBDocument3.s);
                    }
                    if (FBDocument.nativeCoreBuildDom(FBDocument.this.mCore, str5, str8, 0, FBDocument.this.param.jsDebugger) == 0) {
                        FBDocument.this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                FBDocument fBDocument4;
                                BirdNestEngine.Params params3;
                                OnLoadCallback onLoadCallback;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (FBDocument.nativeCoreLayoutAndNotify(FBDocument.this.mCore) != 0) {
                                    FBLogger.e("FBDocument", "==========nativeCoreLayoutAndNotify faild========== ");
                                }
                                FBDocument.this.getClass();
                                FBDocument fBDocument5 = FBDocument.this;
                                fBDocument5.i0 = true;
                                if (fBDocument5.param.callback != null && fBDocument5.mCore != 0 && (params3 = (fBDocument4 = FBDocument.this).param) != null && (onLoadCallback = params3.callback) != null) {
                                    onLoadCallback.onLoadFinish(fBDocument4, false);
                                }
                            }
                        });
                        return;
                    }
                    FBLogger.e("FBDocument", "==========nativeCoreBuildDom faild========== ");
                    return;
                }
                throw new IllegalArgumentException("The template content is empty!");
            }
        });
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            this.H.get(i2).start();
        }
        if (!this.w) {
            for (FBView fBView : this.F.values()) {
                fBView.onLoadFinish();
            }
            this.w = true;
        }
        a(Thread.currentThread());
        FBView fBView2 = this.mRoot;
        if (!(fBView2 == null || fBView2.getInnerView() == null)) {
            this.mRoot.getInnerView().requestLayout();
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBView getBodyView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBView) ipChange.ipc$dispatch("19685dcf", new Object[]{this}) : this.mRoot;
    }

    @Override // com.alipay.android.app.template.FBContext
    public FBNav getNav() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FBNav) ipChange.ipc$dispatch("5fd489cf", new Object[]{this}) : this.u;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            jst.d.submit(new Runnable() { // from class: tb.au8
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.this.e();
                }
            });
        }
    }

    public void setGlobalClick(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4861c0da", new Object[]{this, new Boolean(z), new Long(j)});
            return;
        }
        this.Z = z;
        if (!z) {
            if (j == 2000) {
                this.b0.removeCallbacks(this.a0);
            }
            this.b0.postDelayed(this.a0, j);
        }
    }

    public void submit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fadd8a9", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object opt = jSONObject.opt("action");
            if (opt != null && (opt instanceof JSONObject)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("action");
                if (optJSONObject.has("name")) {
                    String string = optJSONObject.getString("name");
                    if (!TextUtils.equals(string, "loc:back")) {
                        if (TextUtils.equals(string, "loc:exit")) {
                        }
                    }
                    Context context = this.k;
                    if (context != null && (context instanceof Activity)) {
                        hiddenKeyboardService(((Activity) context).getWindow().getDecorView(), true);
                    }
                }
            }
        } catch (Throwable th) {
            FBLogger.e("FBDocument", "parseAction", th);
        }
        OnTemplateClickListener onTemplateClickListener = this.C;
        if (onTemplateClickListener != null) {
            onTemplateClickListener.onEvent(this, str, true);
        }
    }

    public void a(boolean z, gwt gwtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc85c872", new Object[]{this, new Boolean(z), gwtVar});
        } else if (z || this.o == null) {
            this.o = gwtVar;
        }
    }

    public void handleWindowSizeChanged(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7e4302", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else if (this.mCore != 0 && this.k != null) {
            FBLogger.d("FBDocument", "handleWindowSizeChanged, width: " + i2 + ", height: " + i3);
            int[] iArr = this.screenSize;
            iArr[0] = i2;
            iArr[1] = i3;
            nativeUpdateScreenSize(this.mCore, i2, i3);
            FBView fBView = this.mRoot;
            if (fBView != null) {
                layout(fBView);
            }
        }
    }

    public int setProp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f628bf3", new Object[]{this, str, str2})).intValue();
        }
        gwt a2 = FBDocumentAssistor.a(this);
        if (this.k == null) {
            FBLogger.d("FBDocument", "document.setProp mContext == null");
            return -1;
        } else if ("focusableInTouchMode".equals(str)) {
            try {
                if (!new JSONObject(str2).optBoolean("value")) {
                    return 0;
                }
                Runnable rt8Var = new Runnable() { // from class: tb.rt8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.this.d();
                    }
                };
                if (jst.b()) {
                    rt8Var.run();
                } else {
                    jst.c.post(rt8Var);
                }
                return 1;
            } catch (Throwable unused) {
                return -1;
            }
        } else {
            int performSetProp = JSPluginManager.getInstanse().performSetProp(this.k, str, str2);
            FBLogger.d("FBDocument", "document.setProp oldway name: " + str + ", args: " + str2 + ", result: " + performSetProp);
            StringBuilder sb = new StringBuilder("Doc:setProp_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            FBDocumentAssistor.a(this, a2, 21, sb.toString());
            return performSetProp;
        }
    }

    public void handleTplContent(int i2, String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5506bc5f", new Object[]{this, new Integer(i2), str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            if ("content".equals(str)) {
                String[] split2 = str2.split(";");
                if (split2 != null) {
                    for (String str3 : split2) {
                        String[] split3 = str3.split(":");
                        if (split3 != null && split3.length == 2) {
                            String trim = split3[0].trim();
                            String trim2 = split3[1].trim();
                            if ("spmId".equals(trim)) {
                                this.L = trim2;
                            } else if ("bizType".equals(trim)) {
                                this.M = trim2;
                            }
                        }
                    }
                }
            } else if ("param".equals(str) && (split = str2.split(";")) != null) {
                for (String str4 : split) {
                    String[] split4 = str4.split(":");
                    if (split4 != null && split4.length == 2) {
                        this.O.put(split4[0].trim(), split4[1].trim());
                    }
                }
            }
        }
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr});
        }
        StringBuilder sb = new StringBuilder();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append(stackTraceElement.toString());
            }
        }
        return sb.toString();
    }

    public final void a(BirdNestEngine.Params params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5666c31e", new Object[]{this, params});
            return;
        }
        Map<String, String> map = params.appParams;
        if (map != null) {
            if (TextUtils.equals(map.get("autoadaptwindow"), "true")) {
                this.l = true;
            }
            if (TextUtils.equals(params.appParams.get("asynclayout"), "true")) {
                this.d0 = true;
            }
            if (params.appParams.containsKey("actionSheetType")) {
                this.l0 = params.appParams.get("actionSheetType");
            }
            if (configRemScaled()) {
                if (TextUtils.equals(params.appParams.get("pixelToRem"), "true")) {
                    this.s = true;
                }
                if (params.appParams.containsKey("scale")) {
                    this.t = Float.parseFloat(params.appParams.get("scale"));
                }
            }
            if (TextUtils.equals(params.appParams.get("useAgednessVersion"), "true")) {
                FBLogger.d("FBDocument", "useAgednessVersion: true");
                Platform.e = true;
                return;
            }
            FBLogger.d("FBDocument", "useAgednessVersion: false");
            Platform.e = false;
        }
    }

    public static /* synthetic */ void c(ks9 ks9Var, ks9 ks9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bc0350", new Object[]{ks9Var, ks9Var2});
        } else {
            ks9Var2.apply((Pair) ks9Var.apply(null));
        }
    }

    public static void a(final FBDocument fBDocument, final long j, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d615a9", new Object[]{fBDocument, new Long(j), str, str2});
        } else if (fBDocument != null) {
            a(5, fBDocument, f, (FBContext.JsExecCallback) null, new ks9() { // from class: tb.zt8
                @Override // tb.ks9
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, j, str, str2, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, long j, String str, String str2, Void r9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("45ff781a", new Object[]{fBDocument, new Long(j), str, str2, r9});
        }
        try {
            long j2 = 0;
            if (fBDocument.mCore != 0) {
                j2 = j;
            }
            nativeInvokeCallback(j2, str, str2);
            return null;
        } catch (Throwable th) {
            pgh.f("FBDocument_js_call", "safeNativeInvokeCallback error " + j + " event: " + str + " param: " + str2, th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair a(boolean z, String str, Void r7) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("72cb7967", new Object[]{this, new Boolean(z), str, r7});
        }
        if (z) {
            String executeJsWithResult = executeJsWithResult(str);
            if (executeJsWithResult == null) {
                i2 = 100;
            }
            return new Pair(Integer.valueOf(i2), executeJsWithResult);
        }
        if (executeJs(str) == -1) {
            i2 = 100;
        }
        return new Pair(Integer.valueOf(i2), "");
    }

    public static /* synthetic */ void b(ks9 ks9Var, ks9 ks9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326a73cf", new Object[]{ks9Var, ks9Var2});
        } else {
            ks9Var2.apply((Pair) ks9Var.apply(null));
        }
    }

    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        FBView fBView = this.mRoot;
        if (fBView != null) {
            return fBView.getInnerView();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair a(long j, Object[] objArr, Void r7) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("981055c6", new Object[]{this, new Long(j), objArr, r7});
        }
        if (callJsMethod(j, objArr) == -1) {
            i2 = 100;
        }
        return new Pair(Integer.valueOf(i2), "");
    }

    public static void a(final FBDocument fBDocument, final long j, final String str, FBContext.JsExecOptions jsExecOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ce81bf", new Object[]{fBDocument, new Long(j), str, jsExecOptions});
        } else {
            a(3, fBDocument, jsExecOptions, (FBContext.JsExecCallback) null, new ks9() { // from class: tb.wt8
                @Override // tb.ks9
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, j, str, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, long j, String str, Void r6) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("1eab5a90", new Object[]{fBDocument, new Long(j), str, r6});
        }
        if (fBDocument != null) {
            try {
                j2 = fBDocument.mCore;
            } catch (Throwable th) {
                pgh.f("FBDocument_js_call", "safeCallJsMethodWithJson error " + fBDocument + " funcKey: " + j + " json: " + str, th);
                return null;
            }
        } else {
            j2 = 0;
        }
        nativeCallJsMethodWithJson(j2, j, str);
        return null;
    }

    public static void a(final FBDocument fBDocument, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89da2599", new Object[]{fBDocument, str});
        } else {
            a(4, fBDocument, h, (FBContext.JsExecCallback) null, new ks9() { // from class: tb.cu8
                @Override // tb.ks9
                public final Object apply(Object obj) {
                    return FBDocument.a(FBDocument.this, str, (Void) obj);
                }
            });
        }
    }

    public static /* synthetic */ Pair a(FBDocument fBDocument, String str, Void r6) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e3738c0a", new Object[]{fBDocument, str, r6});
        }
        if (fBDocument != null) {
            try {
                j = fBDocument.mCore;
            } catch (Throwable th) {
                pgh.f("FBDocument_js_call", "safeExecJsCodeForPlugin error " + fBDocument + " code: " + str, th);
                return null;
            }
        } else {
            j = 0;
        }
        nativeExcuteJs(j, str);
        return null;
    }

    public static void a(int i2, FBDocument fBDocument, FBContext.JsExecOptions jsExecOptions, FBContext.JsExecCallback jsExecCallback, ks9<Void, Pair<Integer, String>> ks9Var) {
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ebfbbe", new Object[]{new Integer(i2), fBDocument, jsExecOptions, jsExecCallback, ks9Var});
            return;
        }
        boolean b2 = jst.b();
        boolean a2 = fBDocument.a();
        int asyncMode = jsExecOptions.getAsyncMode();
        int callbackMode = jsExecOptions.getCallbackMode();
        if (asyncMode != 0 || a2) {
            if (asyncMode == 0 && a2) {
                i3 = 101;
            } else if (asyncMode != 2 || !b2) {
                if (asyncMode != 2 || b2 || a2) {
                    if (asyncMode != 2 || b2 || !a2) {
                        if (asyncMode == 1 && b2 && a2) {
                            i3 = 104;
                        } else if (asyncMode != 1 || !b2 || a2) {
                            if (asyncMode != 1 || b2 || !a2) {
                                if (asyncMode != 1 || b2 || a2) {
                                    pgh.p("unknown input combination: async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2);
                                    i3 = 0;
                                }
                            }
                        }
                    }
                    i3 = 103;
                }
                i3 = 102;
            } else {
                throw new RuntimeException("ASYNC_MODE_ONLY_SYNC cannot be used on main thread");
            }
            if (jsExecCallback != null || callbackMode == 0) {
                i4 = 201;
            } else if (callbackMode == 1) {
                i4 = 202;
            } else if (callbackMode == 2) {
                i4 = 203;
            } else {
                pgh.p("unknown input combination: " + callbackMode + ", " + jsExecCallback);
                i4 = 0;
            }
            int i5 = (i3 == 103 || callbackMode != 0) ? i3 : 101;
            long blockTimeoutMs = jsExecOptions.getBlockTimeoutMs();
            pgh.i("FBDocument_js_call", "safeExecuteJs " + i2 + " async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2 + " -> running:" + i5 + " callback:" + i4 + " block:" + blockTimeoutMs);
            a(fBDocument, i5, i4, blockTimeoutMs, jsExecCallback, ks9Var);
        }
        i3 = 100;
        if (jsExecCallback != null) {
        }
        i4 = 201;
        if (i3 == 103) {
        }
        long blockTimeoutMs2 = jsExecOptions.getBlockTimeoutMs();
        pgh.i("FBDocument_js_call", "safeExecuteJs " + i2 + " async_mode:" + asyncMode + ", curr_is_main:" + b2 + ", safe_is_main:" + a2 + " -> running:" + i5 + " callback:" + i4 + " block:" + blockTimeoutMs2);
        a(fBDocument, i5, i4, blockTimeoutMs2, jsExecCallback, ks9Var);
    }

    public static void a(final FBDocument fBDocument, int i2, final int i3, final long j, final FBContext.JsExecCallback jsExecCallback, final ks9 ks9Var) throws RuntimeException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f60fff7", new Object[]{fBDocument, new Integer(i2), new Integer(i3), new Long(j), jsExecCallback, ks9Var});
            return;
        }
        final ks9 du8Var = new ks9() { // from class: tb.du8
            @Override // tb.ks9
            public final Object apply(Object obj) {
                return FBDocument.a(FBContext.JsExecCallback.this, i3, (Pair) obj);
            }
        };
        switch (i2) {
            case 100:
                jst.f22189a.submit(new Runnable() { // from class: tb.hu8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.a(FBDocument.this, j, ks9Var, du8Var);
                    }
                });
                return;
            case 101:
                jst.c.post(new Runnable() { // from class: tb.gu8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.c(ks9.this, du8Var);
                    }
                });
                return;
            case 102:
                if (!fBDocument.a()) {
                    z = fBDocument.s0.block(j);
                }
                if (z) {
                    jst.c.post(new Runnable() { // from class: tb.fu8
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBDocument.b(ks9.this, du8Var);
                        }
                    });
                    return;
                }
                pgh.e("FBDocument_js_call", "safeExecuteJsFiring: timeout 1. time: " + j);
                du8Var.apply(new Pair(101, ""));
                return;
            case 103:
                final ConditionVariable conditionVariable = new ConditionVariable();
                final AtomicReference atomicReference = new AtomicReference(null);
                jst.c.post(new Runnable() { // from class: tb.eu8
                    @Override // java.lang.Runnable
                    public final void run() {
                        FBDocument.a(atomicReference, ks9Var, conditionVariable);
                    }
                });
                if (conditionVariable.block(j)) {
                    du8Var.apply(atomicReference.get());
                    return;
                }
                pgh.e("FBDocument_js_call", "safeExecuteJsFiring: timeout 2. time: " + j);
                du8Var.apply(new Pair(101, ""));
                return;
            case 104:
                du8Var.apply((Pair) ks9Var.apply(null));
                return;
            default:
                pgh.e("FBDocument_js_call", "safeExecuteJsFiring: unknown running_strategy:" + i2);
                return;
        }
    }

    public static /* synthetic */ void a(FBContext.JsExecCallback jsExecCallback, Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3ded43", new Object[]{jsExecCallback, pair});
        } else {
            jsExecCallback.onJsExecuted(((Integer) pair.first).intValue(), (String) pair.second);
        }
    }

    public static Void a(final FBContext.JsExecCallback jsExecCallback, int i2, final Pair pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("cd544d8f", new Object[]{jsExecCallback, new Integer(i2), pair});
        }
        if (pair == null || jsExecCallback == null) {
            return null;
        }
        try {
            switch (i2) {
                case 201:
                    return null;
                case 202:
                    Runnable st8Var = new Runnable() { // from class: tb.st8
                        @Override // java.lang.Runnable
                        public final void run() {
                            FBDocument.a(FBContext.JsExecCallback.this, pair);
                        }
                    };
                    if (!jst.b()) {
                        jst.c.post(st8Var);
                        break;
                    } else {
                        st8Var.run();
                        break;
                    }
                case 203:
                    jsExecCallback.onJsExecuted(((Integer) pair.first).intValue(), (String) pair.second);
                    break;
                default:
                    pgh.p("unknown callback_strategy:" + i2);
                    break;
            }
            return null;
        } catch (Throwable th) {
            pgh.f("FBDocument_js_call", "safeExecuteJsFiring: error caught on callback", th);
            return null;
        }
    }

    @Override // com.alipay.android.app.template.FBContext
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            destroy(null);
        }
    }

    public static /* synthetic */ void a(ks9 ks9Var, ks9 ks9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4118e44e", new Object[]{ks9Var, ks9Var2});
        } else {
            ks9Var2.apply((Pair) ks9Var.apply(null));
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, ks9 ks9Var, ConditionVariable conditionVariable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af11b3fb", new Object[]{atomicReference, ks9Var, conditionVariable});
            return;
        }
        atomicReference.set(ks9Var.apply(null));
        conditionVariable.open();
    }

    public final void a(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d0af99", new Object[]{this, thread});
            return;
        }
        pgh.i("FBDocument", "jsSafeThread: " + this + " " + this.r0.get() + " -> " + thread);
        this.r0 = new WeakReference<>(thread);
        IpChange ipChange2 = jst.$ipChange;
        if (thread == Looper.getMainLooper().getThread()) {
            this.s0.open();
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Thread thread = this.r0.get();
        IpChange ipChange2 = jst.$ipChange;
        return thread == Looper.getMainLooper().getThread();
    }

    public static void a(FBDocument fBDocument, long j, final ks9 ks9Var, final ks9 ks9Var2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2696fb", new Object[]{fBDocument, new Long(j), ks9Var, ks9Var2});
            return;
        }
        if (!fBDocument.a()) {
            z = fBDocument.s0.block(j);
        }
        if (z) {
            jst.c.post(new Runnable() { // from class: tb.yt8
                @Override // java.lang.Runnable
                public final void run() {
                    FBDocument.a(ks9.this, ks9Var2);
                }
            });
            return;
        }
        pgh.e("FBDocument_js_call", "safeExecuteJsFiring: timeout 0. time: " + j);
        ks9Var2.apply(new Pair(101, ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x02b8 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #5 {all -> 0x0062, blocks: (B:14:0x0046, B:16:0x004e, B:19:0x0054, B:23:0x005b, B:26:0x0065, B:27:0x006b, B:28:0x0085, B:30:0x0088, B:32:0x008f, B:33:0x0096, B:34:0x009c, B:38:0x00b0, B:40:0x00bd, B:42:0x00c1, B:43:0x00d1, B:44:0x00d5, B:46:0x00db, B:47:0x00ea, B:49:0x00f2, B:50:0x00fc, B:52:0x0104, B:54:0x010d, B:57:0x0118, B:59:0x0121, B:60:0x012a, B:62:0x0132, B:63:0x013a, B:65:0x0143, B:66:0x014b, B:68:0x0153, B:69:0x015c, B:71:0x0166, B:73:0x016e, B:79:0x0198, B:82:0x01a3, B:84:0x01ac, B:85:0x01b7, B:87:0x01bd, B:88:0x01ce, B:90:0x01d4, B:91:0x01e5, B:93:0x01ed, B:95:0x01f1, B:97:0x01f9, B:103:0x0223, B:105:0x0232, B:107:0x0238, B:109:0x0241, B:111:0x0256, B:112:0x025f, B:114:0x0268, B:115:0x0271, B:117:0x027a, B:118:0x0283, B:120:0x028c, B:122:0x029b, B:124:0x02a5, B:128:0x02b8, B:129:0x02bb, B:131:0x02c8, B:133:0x02d0, B:137:0x02dd, B:138:0x02e2, B:140:0x02f0, B:143:0x02fc, B:144:0x0300, B:145:0x031e, B:146:0x0326, B:147:0x033d, B:148:0x033e, B:152:0x034a, B:154:0x0364, B:156:0x036a, B:158:0x036e, B:160:0x0379, B:162:0x0391, B:164:0x039b, B:165:0x03b0, B:167:0x03b4, B:168:0x03be, B:170:0x03c3, B:172:0x03c7, B:173:0x03d2, B:175:0x03da, B:177:0x03e3, B:179:0x03ef, B:180:0x03f6, B:182:0x03fe, B:183:0x0409, B:185:0x0414, B:188:0x0425, B:191:0x0448, B:193:0x045f, B:195:0x0469, B:197:0x0472, B:199:0x0479, B:201:0x0482, B:202:0x048a, B:203:0x049f, B:204:0x04b5, B:206:0x04be, B:208:0x04cd, B:209:0x04d2, B:210:0x04d9, B:214:0x04e5, B:216:0x04f2, B:218:0x04f6, B:219:0x04fb, B:220:0x0502, B:222:0x050b, B:224:0x0517, B:225:0x051b, B:227:0x0521, B:229:0x052d, B:75:0x0177, B:76:0x0180, B:78:0x0186, B:99:0x0202, B:100:0x020b, B:102:0x0211), top: B:242:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0326 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBDocument.a(java.lang.String):void");
    }

    public final void a(final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
            return;
        }
        FBView fBView = this.mRoot;
        if (fBView != null) {
            View innerView = fBView.getInnerView();
            Context context = this.k;
            if ((innerView instanceof FBBodyFrameLayout) && (context instanceof Activity)) {
                ((FBBodyFrameLayout) innerView).setOnNextDispatchDraw(new Callable() { // from class: tb.bu8
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void b2;
                        b2 = FBDocument.this.b(i2);
                        return b2;
                    }
                });
                return;
            }
        }
        pgh.i("DRAWING", "Drawing action SKIPPED for ctx " + hashCode() + ", len " + i2 + ", root " + fBView + " android_ctx " + this.k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        String[] d2 = l2w.d(str);
        if (d2[0] != null) {
            JSPluginManager instanse = JSPluginManager.getInstanse();
            String str3 = d2[0];
            str3.hashCode();
            if (str3.equals(JSPluginManager.INVOKE_NS_EXTHUB)) {
                instanse.invokeOnExtHub(this.k, d2[1], str2, this, 0L);
            } else if (!str3.equals(JSPluginManager.INVOKE_NS_FB)) {
                JSPlugin registeredPlugin = instanse.getRegisteredPlugin(this.k, this.k0, JSPlugin.FromCall.INVOKE, str, false);
                if (registeredPlugin != null) {
                    instanse.invokeOnJSPlugin(this.k, str, str2, this, 0L, registeredPlugin);
                }
            } else if (!a(d2[1], str2, 0L)) {
                JSPlugin registeredPlugin2 = instanse.getRegisteredPlugin(this.k, this.k0, JSPlugin.FromCall.INVOKE, d2[1], false);
                if (registeredPlugin2 != null) {
                    instanse.invokeOnJSPlugin(this.k, d2[1], str2, this, 0L, registeredPlugin2);
                } else {
                    instanse.invokeOnExtHub(this.k, d2[1], str2, this, 0L);
                }
            }
        }
    }

    public final boolean a(String str, String str2, long j) {
        FBBridge fBBridge;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dba98cc", new Object[]{this, str, str2, new Long(j)})).booleanValue();
        }
        BirdNestEngine.Params params = this.param;
        if (params == null || this.mCore == 0 || (fBBridge = params.eventBridge) == null || (obj = params.eventTarget) == null) {
            return false;
        }
        return fBBridge.sendOriginEvent(str, str2, obj, this.mCore, j, this);
    }

    public final void a(String str, final long j, String str2) {
        String str3;
        String[] strArr;
        final boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa210a1c", new Object[]{this, str, new Long(j), str2});
        } else if (TextUtils.equals(str2, "toast")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("text")) {
                    Toast.makeText(this.k, jSONObject.getString("text"), 0).show();
                    if (j != 0) {
                        this.b0.post(new Runnable() { // from class: com.flybird.FBDocument.9
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    FBDocument.this.callJsMethod(j, null);
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                FBLogger.e("FBDocument", "toast", th);
            }
        } else if (TextUtils.equals(str2, "confirm")) {
            this.b0.post(new AnonymousClass15(str, j));
        } else if (TextUtils.equals(str2, "asyncSubmit")) {
            if (this.C != null) {
                FBClickCallBack fBClickCallBack = new FBClickCallBack(j, this);
                this.Y.add(fBClickCallBack);
                this.C.onAsyncEvent(this, str, fBClickCallBack);
            }
        } else if (TextUtils.equals(str2, "actionSheet")) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                JSONArray optJSONArray = jSONObject2.optJSONArray("btns");
                String optString = jSONObject2.optString("title");
                boolean optBoolean = jSONObject2.optBoolean("needCancel");
                int length = optJSONArray.length();
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    strArr2[i2] = optJSONArray.getString(i2);
                }
                if (jSONObject2.has("cancelBtn")) {
                    strArr = new String[length + 1];
                    System.arraycopy(strArr2, 0, strArr, 0, length);
                    strArr[length] = jSONObject2.getString("cancelBtn");
                    str3 = TextUtils.equals(this.l0, "AUActionSheet") ? jSONObject2.getString("cancelBtn") : "";
                } else {
                    strArr = strArr2;
                    str3 = "";
                    z = false;
                }
                final int length2 = strArr.length;
                if (this.f0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.k);
                    if (!TextUtils.isEmpty(optString)) {
                        builder.setTitle(optString);
                    }
                    builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i3) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                            } else if (!z || i3 != length2 - 1) {
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("index", i3);
                                } catch (JSONException e2) {
                                    FBLogger.e(AnonymousClass10.class.getName(), "exception", e2);
                                }
                                FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                            } else {
                                dialogInterface.dismiss();
                            }
                        }
                    });
                    if (optBoolean) {
                        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.flybird.FBDocument.11
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnCancelListener
                            public void onCancel(DialogInterface dialogInterface) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                                    return;
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                try {
                                    jSONObject3.put("index", length2 - 1);
                                } catch (JSONException e2) {
                                    FBLogger.e(AnonymousClass11.class.getName(), "exception", e2);
                                }
                                FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                            }
                        });
                    }
                    builder.create().show();
                    return;
                }
                Dialog createDialog = this.k0.getConfig().getUiWidgetProvider().createDialog(this.k, TextUtils.equals(this.l0, "AUActionSheet") ? "AUActionSheet" : "actionSheet", optString, str3, strArr, new AdapterView.OnItemClickListener() { // from class: com.flybird.FBDocument.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i3, long j2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i3), new Long(j2)});
                        } else if (!z || i3 != length2 - 1) {
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("index", i3);
                            } catch (JSONException e2) {
                                FBLogger.e(AnonymousClass12.class.getName(), "exception", e2);
                            }
                            FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                        }
                    }
                });
                if (optBoolean) {
                    createDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.flybird.FBDocument.13
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnCancelListener
                        public void onCancel(DialogInterface dialogInterface) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
                                return;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("index", length2 - 1);
                            } catch (JSONException e2) {
                                FBLogger.e(AnonymousClass13.class.getName(), "exception", e2);
                            }
                            FBDocument.this.callJsMethod(j, new Object[]{jSONObject3});
                        }
                    });
                }
                if (createDialog != null) {
                    createDialog.show();
                }
            } catch (Throwable th2) {
                FBLogger.e("FBDocument", "actionSheet", th2);
            }
        } else if (TextUtils.equals(str2, "alert")) {
            try {
                JSONObject jSONObject3 = new JSONObject(str);
                SystemDefaultDialog.showDialog(this.k, jSONObject3.optString("title"), jSONObject3.optString("message"), jSONObject3.optString(pg1.ATOM_EXT_button), new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i3) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i3)});
                        } else {
                            FBDocument.this.callJsMethod(j, null);
                        }
                    }
                }, null, null, null, null);
            } catch (Throwable th3) {
                FBLogger.e("FBDocument", "alert", th3);
            }
        } else if (TextUtils.equals(str2, "picker")) {
            try {
                JSONObject jSONObject4 = new JSONObject(str);
                JSONArray jSONArray = jSONObject4.getJSONArray("btns");
                String optString2 = jSONObject4.optString("title");
                if (jSONArray != null && jSONArray.length() > 0) {
                    String[] strArr3 = new String[jSONArray.length()];
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        strArr3[i3] = jSONArray.getString(i3);
                    }
                    a(strArr3, j, optString2);
                }
            } catch (Throwable th4) {
                FBLogger.e("FBDocument", "picker", th4);
            }
        } else if (TextUtils.equals(str2, "submit")) {
            submit(str);
        }
    }

    public final void a(String[] strArr, final long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df86677", new Object[]{this, strArr, new Long(j), str});
        } else if (strArr.length <= 0) {
        } else {
            if (this.f0) {
                AlertDialog.Builder builder = new AlertDialog.Builder(this.k);
                if (str == null) {
                    str = "";
                }
                builder.setTitle(str);
                builder.setItems(strArr, new DialogInterface.OnClickListener() { // from class: com.flybird.FBDocument.18
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("index", i2);
                        } catch (JSONException e2) {
                            FBLogger.e(AnonymousClass18.class.getName(), "exception", e2);
                        }
                        FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
                    }
                });
                builder.create().show();
                return;
            }
            Dialog createDialog = this.k0.getConfig().getUiWidgetProvider().createDialog(this.k, "actionSheet", str, "", strArr, new AdapterView.OnItemClickListener() { // from class: com.flybird.FBDocument.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i2), new Long(j2)});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("index", i2);
                    } catch (JSONException e2) {
                        FBLogger.e(AnonymousClass19.class.getName(), "exception", e2);
                    }
                    FBDocument.this.callJsMethod(j, new Object[]{jSONObject});
                }
            });
            if (createDialog != null) {
                createDialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair a(FBDocument fBDocument, long j, long j2, Void r13) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("94420b40", new Object[]{this, fBDocument, new Long(j), new Long(j2), r13});
        }
        if (fBDocument == null || fBDocument.mCore != 0) {
            pgh.i("FBDocument", "dispatchCoreTask: 1 " + j + ", " + j2 + " of core " + fBDocument);
            nativeCallCoreFuncPtr(this, j, j2);
            return null;
        }
        pgh.i("FBDocument", "dispatchCoreTask: 1 " + j + ", " + j2 + " core destroyed, ignoring");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(FBDocument fBDocument, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdb524f", new Object[]{this, fBDocument, new Long(j), new Long(j2)});
        } else if (fBDocument == null || fBDocument.mCore != 0) {
            pgh.i("FBDocument", "dispatchCoreTask: 2 " + j + ", " + j2 + " of core " + fBDocument);
            nativeCallCoreFuncPtr(this, j, j2);
        } else {
            pgh.i("FBDocument", "dispatchCoreTask: 2 " + j + ", " + j2 + " core destroyed, ignoring");
        }
    }

    public void a(BirdNestEngine birdNestEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f3e768", new Object[]{this, birdNestEngine});
        } else {
            this.k0 = birdNestEngine;
        }
    }
}
