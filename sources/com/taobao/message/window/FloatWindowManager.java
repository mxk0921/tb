package com.taobao.message.window;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.message.window.FloatWindowManager;
import com.taobao.runtimepermission.a;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloatWindowManager implements IFloatWindow {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int STEP_NUM = 20;
    private static final String TAG = "FloatWindowManager";
    private static final int WINDOW_H = 78;
    private static final int WINDOW_H_BIG = 106;
    private static final int WINDOW_W = 63;
    private static final int WINDOW_W_BIG = 86;
    private boolean isBigMode;
    private LinearLayout mFloatLayout;
    private TUrlImageView mIcon;
    private TUrlImageView mIconBg;
    private String mNavUrl;
    private TextView mText;
    private Timer mTimer;
    private WindowManager mWindowManager;
    private boolean isReadyToMove = false;
    private float beginX = 0.0f;
    private float windowX = 0.0f;
    private float beginY = 0.0f;
    private float windowY = 0.0f;
    private boolean isCreated = false;
    private int mStartTime = 0;
    private int mStatus = 3;
    private final List<FloatWindowListener> mListeners = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.message.window.FloatWindowManager$5  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class AnonymousClass5 extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass5() {
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/window/FloatWindowManager$5");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f11d38c1", new Object[]{this});
            } else if (FloatWindowManager.access$1200(FloatWindowManager.this) != null) {
                TextView access$1200 = FloatWindowManager.access$1200(FloatWindowManager.this);
                FloatWindowManager floatWindowManager = FloatWindowManager.this;
                access$1200.setText(FloatWindowManager.access$1400(floatWindowManager, FloatWindowManager.access$1308(floatWindowManager)));
            }
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UIHandler.postMain(new Runnable() { // from class: tb.ro9
                    @Override // java.lang.Runnable
                    public final void run() {
                        FloatWindowManager.AnonymousClass5.this.lambda$run$0();
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class SingletonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static FloatWindowManager instance = new FloatWindowManager();

        static {
            t2o.a(530579523);
        }

        private SingletonHolder() {
        }

        public static /* synthetic */ FloatWindowManager access$1500() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FloatWindowManager) ipChange.ipc$dispatch("4de02435", new Object[0]);
            }
            return instance;
        }
    }

    static {
        t2o.a(530579516);
        t2o.a(530579525);
    }

    public static /* synthetic */ void access$000(FloatWindowManager floatWindowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a1902", new Object[]{floatWindowManager, new Integer(i)});
        } else {
            floatWindowManager.notifyLifecycle(i);
        }
    }

    public static /* synthetic */ boolean access$100(FloatWindowManager floatWindowManager, Context context, FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa1b059e", new Object[]{floatWindowManager, context, floatWindowVO})).booleanValue();
        }
        return floatWindowManager.createImpl(context, floatWindowVO);
    }

    public static /* synthetic */ List access$1000(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7323f37", new Object[]{floatWindowManager});
        }
        return floatWindowManager.mListeners;
    }

    public static /* synthetic */ String access$1100(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f5f462f", new Object[]{floatWindowManager});
        }
        return floatWindowManager.mNavUrl;
    }

    public static /* synthetic */ TextView access$1200(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("360cc686", new Object[]{floatWindowManager});
        }
        return floatWindowManager.mText;
    }

    public static /* synthetic */ int access$1308(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b30e538e", new Object[]{floatWindowManager})).intValue();
        }
        int i = floatWindowManager.mStartTime;
        floatWindowManager.mStartTime = 1 + i;
        return i;
    }

    public static /* synthetic */ String access$1400(FloatWindowManager floatWindowManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("878b8211", new Object[]{floatWindowManager, new Integer(i)});
        }
        return floatWindowManager.formatSecond(i);
    }

    public static /* synthetic */ float access$200(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c8f8113", new Object[]{floatWindowManager})).floatValue();
        }
        return floatWindowManager.beginX;
    }

    public static /* synthetic */ float access$202(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51123fab", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.beginX = f;
        return f;
    }

    public static /* synthetic */ float access$300(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29ca3294", new Object[]{floatWindowManager})).floatValue();
        }
        return floatWindowManager.beginY;
    }

    public static /* synthetic */ float access$302(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b2dbe4a", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.beginY = f;
        return f;
    }

    public static /* synthetic */ float access$400(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b704e415", new Object[]{floatWindowManager})).floatValue();
        }
        return floatWindowManager.windowX;
    }

    public static /* synthetic */ float access$402(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85493ce9", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.windowX = f;
        return f;
    }

    public static /* synthetic */ LinearLayout access$500(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("c74831fd", new Object[]{floatWindowManager});
        }
        return floatWindowManager.mFloatLayout;
    }

    public static /* synthetic */ float access$600(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d17a4717", new Object[]{floatWindowManager})).floatValue();
        }
        return floatWindowManager.windowY;
    }

    public static /* synthetic */ float access$602(FloatWindowManager floatWindowManager, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9803a27", new Object[]{floatWindowManager, new Float(f)})).floatValue();
        }
        floatWindowManager.windowY = f;
        return f;
    }

    public static /* synthetic */ boolean access$700(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb4f8ac", new Object[]{floatWindowManager})).booleanValue();
        }
        return floatWindowManager.isReadyToMove;
    }

    public static /* synthetic */ boolean access$702(FloatWindowManager floatWindowManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d39c03ee", new Object[]{floatWindowManager, new Boolean(z)})).booleanValue();
        }
        floatWindowManager.isReadyToMove = z;
        return z;
    }

    public static /* synthetic */ boolean access$800(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebefaa2d", new Object[]{floatWindowManager})).booleanValue();
        }
        return floatWindowManager.isCreated;
    }

    public static /* synthetic */ WindowManager access$900(FloatWindowManager floatWindowManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager) ipChange.ipc$dispatch("a0706fc8", new Object[]{floatWindowManager});
        }
        return floatWindowManager.mWindowManager;
    }

    private String formatSecond(int i) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cf51cf", new Object[]{this, new Integer(i)});
        }
        if (i >= 600000) {
            return "999:99";
        }
        int i2 = i / 60;
        int i3 = i - (i2 * 60);
        StringBuilder sb = new StringBuilder();
        if (i2 < 10) {
            obj = "0" + i2;
        } else {
            obj = Integer.valueOf(i2);
        }
        sb.append(obj);
        sb.append(":");
        if (i3 < 10) {
            obj2 = "0" + i3;
        } else {
            obj2 = Integer.valueOf(i3);
        }
        sb.append(obj2);
        return sb.toString();
    }

    public static FloatWindowManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatWindowManager) ipChange.ipc$dispatch("2289fb6e", new Object[0]);
        }
        return SingletonHolder.access$1500();
    }

    private void notifyLifecycle(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8619db", new Object[]{this, new Integer(i)});
            return;
        }
        this.mStatus = i;
        for (FloatWindowListener floatWindowListener : this.mListeners) {
            floatWindowListener.onLifecycleChanged(i);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void addListener(FloatWindowListener floatWindowListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4414e89", new Object[]{this, floatWindowListener});
        } else if (floatWindowListener != null) {
            this.mListeners.add(floatWindowListener);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public boolean create(FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4861921", new Object[]{this, floatWindowVO})).booleanValue();
        }
        Application application = Globals.getApplication();
        if (application == null) {
            return false;
        }
        return createImpl(application, floatWindowVO);
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void createWithRequestPermission(final FloatWindowVO floatWindowVO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae69141d", new Object[]{this, floatWindowVO});
            return;
        }
        final Application application = Globals.getApplication();
        if (application == null) {
            notifyLifecycle(4);
        } else {
            a.c(application, new String[]{"android.permission.SYSTEM_ALERT_WINDOW"}).w(DisplayUtil.localizedString(R.string.mp_system_authorization_is_required_when_2)).A(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!FloatWindowManager.access$100(FloatWindowManager.this, application, floatWindowVO)) {
                        FloatWindowManager.access$000(FloatWindowManager.this, 4);
                    }
                }
            }).z(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        FloatWindowManager.access$000(FloatWindowManager.this, 4);
                    }
                }
            }).m();
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void destroy() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (this.isCreated) {
                this.isCreated = false;
                WindowManager windowManager = this.mWindowManager;
                if (!(windowManager == null || (linearLayout = this.mFloatLayout) == null)) {
                    windowManager.removeView(linearLayout);
                    this.mFloatLayout = null;
                    this.mText = null;
                    this.mIcon = null;
                    this.mIconBg = null;
                }
            }
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
            }
        } catch (Throwable th) {
            TLog.loge(TAG, Log.getStackTraceString(th));
        }
        notifyLifecycle(3);
        this.isCreated = false;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public String getNavUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7553bf7", new Object[]{this});
        }
        return this.mNavUrl;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.mStatus;
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void removeListener(FloatWindowListener floatWindowListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7199c4c6", new Object[]{this, floatWindowListener});
        } else if (floatWindowListener != null) {
            this.mListeners.remove(floatWindowListener);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95a84c", new Object[]{this, str});
        } else {
            this.mIcon.setImageUrl(str);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setIconBackground(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("649c1d5a", new Object[]{this, str});
        } else {
            this.mIconBg.setImageUrl(str);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setNavUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fc305f", new Object[]{this, str});
        } else {
            this.mNavUrl = str;
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            return;
        }
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer = null;
        }
        this.mText.setText(str);
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setTimeSecond(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2d199", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            Timer timer = this.mTimer;
            if (timer != null) {
                timer.cancel();
                this.mTimer = null;
            }
            this.mStartTime = i;
            this.mTimer = new Timer("msgFloatWindowManager");
            this.mTimer.schedule(new AnonymousClass5(), 0L, 1000L);
        }
    }

    @Override // com.taobao.message.window.IFloatWindow
    public void setVisible(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8643d37d", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.mFloatLayout;
        if (linearLayout != null) {
            if (!z) {
                i = 8;
            }
            linearLayout.setVisibility(i);
            notifyLifecycle(!z ? 1 : 0);
        }
    }

    private boolean createImpl(Context context, FloatWindowVO floatWindowVO) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a9497f", new Object[]{this, context, floatWindowVO})).booleanValue();
        }
        if (this.isCreated || floatWindowVO == null) {
            return false;
        }
        this.isCreated = true;
        this.mNavUrl = floatWindowVO.getNavUrl();
        this.isBigMode = floatWindowVO.isBigMode();
        final float f = context.getResources().getDisplayMetrics().density;
        final int i2 = context.getResources().getDisplayMetrics().widthPixels;
        int i3 = context.getResources().getDisplayMetrics().heightPixels;
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.mWindowManager = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        if (Build.VERSION.SDK_INT < 26) {
            layoutParams.type = 2002;
        } else {
            layoutParams.type = 2038;
        }
        layoutParams.format = 1;
        layoutParams.flags = 8;
        layoutParams.gravity = floatWindowVO.getGravity() == 0 ? 51 : floatWindowVO.getGravity();
        layoutParams.x = 0;
        layoutParams.y = (int) (57.0f * f);
        boolean z = this.isBigMode;
        int i4 = 63;
        layoutParams.width = (int) ((z ? 86 : 63) * f);
        int i5 = 78;
        layoutParams.height = (int) ((z ? 106 : 78) * f);
        LayoutInflater from = LayoutInflater.from(context);
        if (this.isBigMode) {
            i = R.layout.alimp_open_float_layout_big;
        } else {
            i = R.layout.alimp_open_float_layout;
        }
        LinearLayout linearLayout = (LinearLayout) from.inflate(i, (ViewGroup) null);
        this.mFloatLayout = linearLayout;
        this.mText = (TextView) linearLayout.findViewById(R.id.tv_mp_float_text);
        this.mIcon = (TUrlImageView) this.mFloatLayout.findViewById(R.id.iv_mp_float_icon);
        this.mIconBg = (TUrlImageView) this.mFloatLayout.findViewById(R.id.iv_mp_float_bg);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        boolean z2 = this.isBigMode;
        if (z2) {
            i4 = 86;
        }
        layoutParams2.width = (int) ((i4 + 10) * f);
        if (z2) {
            i5 = 106;
        }
        layoutParams2.height = (int) ((i5 + 10) * f);
        this.mFloatLayout.setLayoutParams(layoutParams2);
        ViewCompat.setElevation(this.mFloatLayout, 8.0f);
        this.mWindowManager.addView(this.mFloatLayout, layoutParams);
        this.mFloatLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.mFloatLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.message.window.FloatWindowManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                float access$400;
                float access$600;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    FloatWindowManager.access$202(FloatWindowManager.this, motionEvent.getRawX());
                    FloatWindowManager.access$302(FloatWindowManager.this, motionEvent.getRawY());
                    FloatWindowManager floatWindowManager = FloatWindowManager.this;
                    FloatWindowManager.access$402(floatWindowManager, ((WindowManager.LayoutParams) FloatWindowManager.access$500(floatWindowManager).getLayoutParams()).x);
                    FloatWindowManager floatWindowManager2 = FloatWindowManager.this;
                    FloatWindowManager.access$602(floatWindowManager2, ((WindowManager.LayoutParams) FloatWindowManager.access$500(floatWindowManager2).getLayoutParams()).y);
                    FloatWindowManager.access$702(FloatWindowManager.this, false);
                } else if (action != 1) {
                    if (action == 2 && (Math.abs(motionEvent.getRawY() - FloatWindowManager.access$300(FloatWindowManager.this)) > f * 5.0f || Math.abs(motionEvent.getRawX() - FloatWindowManager.access$200(FloatWindowManager.this)) > f * 5.0f)) {
                        FloatWindowManager.access$702(FloatWindowManager.this, true);
                    }
                } else if (FloatWindowManager.access$500(FloatWindowManager.this) == null) {
                    return true;
                } else {
                    FloatWindowManager.access$500(FloatWindowManager.this).getLocationOnScreen(new int[2]);
                    final int i6 = layoutParams.y;
                    UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.window.FloatWindowManager.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            int i7 = 0;
                            int i8 = 1;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (FloatWindowManager.access$800(FloatWindowManager.this) && FloatWindowManager.access$500(FloatWindowManager.this) != null) {
                                int[] iArr = new int[2];
                                FloatWindowManager.access$500(FloatWindowManager.this).getLocationOnScreen(iArr);
                                int i9 = iArr[0];
                                AnonymousClass3 r4 = AnonymousClass3.this;
                                int i10 = (i2 / 2) / 20;
                                int measuredWidth = (FloatWindowManager.access$500(FloatWindowManager.this).getMeasuredWidth() / 2) + i9;
                                AnonymousClass3 r6 = AnonymousClass3.this;
                                int i11 = i2;
                                if (measuredWidth > i11 / 2) {
                                    int i12 = i9 + i10;
                                    if (i12 >= i11 - FloatWindowManager.access$500(FloatWindowManager.this).getMeasuredWidth()) {
                                        AnonymousClass3 r0 = AnonymousClass3.this;
                                        i12 = i2 - FloatWindowManager.access$500(FloatWindowManager.this).getMeasuredWidth();
                                        i7 = 1;
                                    }
                                    AnonymousClass3 r02 = AnonymousClass3.this;
                                    WindowManager.LayoutParams layoutParams3 = layoutParams;
                                    if ((layoutParams3.gravity & 5) == 5) {
                                        i12 = (i2 - FloatWindowManager.access$500(FloatWindowManager.this).getMeasuredWidth()) - i12;
                                    }
                                    layoutParams3.x = i12;
                                    AnonymousClass3 r03 = AnonymousClass3.this;
                                    layoutParams.y = i6;
                                    FloatWindowManager.access$900(FloatWindowManager.this).updateViewLayout(FloatWindowManager.access$500(FloatWindowManager.this), layoutParams);
                                } else {
                                    int i13 = i9 - i10;
                                    if (i13 > 0) {
                                        i7 = i13;
                                        i8 = 0;
                                    }
                                    WindowManager.LayoutParams layoutParams4 = layoutParams;
                                    if ((layoutParams4.gravity & 5) == 5) {
                                        i7 = (i11 - FloatWindowManager.access$500(FloatWindowManager.this).getMeasuredWidth()) - i7;
                                    }
                                    layoutParams4.x = i7;
                                    AnonymousClass3 r04 = AnonymousClass3.this;
                                    layoutParams.y = i6;
                                    if (FloatWindowManager.access$800(FloatWindowManager.this)) {
                                        FloatWindowManager.access$900(FloatWindowManager.this).updateViewLayout(FloatWindowManager.access$500(FloatWindowManager.this), layoutParams);
                                    }
                                    i7 = i8;
                                }
                                if (i7 == 0) {
                                    UIHandler.postDelayed(this, 10L);
                                }
                            }
                        }
                    }, 10L);
                }
                if (!FloatWindowManager.access$700(FloatWindowManager.this) || FloatWindowManager.access$500(FloatWindowManager.this) == null) {
                    return false;
                }
                float rawX = motionEvent.getRawX() - FloatWindowManager.access$200(FloatWindowManager.this);
                WindowManager.LayoutParams layoutParams3 = layoutParams;
                if ((layoutParams3.gravity & 5) == 5) {
                    access$400 = FloatWindowManager.access$400(FloatWindowManager.this) - rawX;
                } else {
                    access$400 = FloatWindowManager.access$400(FloatWindowManager.this) + rawX;
                }
                layoutParams3.x = Math.round(access$400);
                float rawY = motionEvent.getRawY() - FloatWindowManager.access$300(FloatWindowManager.this);
                WindowManager.LayoutParams layoutParams4 = layoutParams;
                if ((layoutParams4.gravity & 80) == 80) {
                    access$600 = FloatWindowManager.access$600(FloatWindowManager.this) - rawY;
                } else {
                    access$600 = FloatWindowManager.access$600(FloatWindowManager.this) + rawY;
                }
                layoutParams4.y = Math.round(access$600);
                FloatWindowManager.access$900(FloatWindowManager.this).updateViewLayout(FloatWindowManager.access$500(FloatWindowManager.this), layoutParams);
                return true;
            }
        });
        this.mFloatLayout.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.message.window.FloatWindowManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                for (FloatWindowListener floatWindowListener : FloatWindowManager.access$1000(FloatWindowManager.this)) {
                    floatWindowListener.onClick();
                }
                FloatWindowManager.this.setVisible(false);
                Nav.from(Globals.getApplication()).toUri(FloatWindowManager.access$1100(FloatWindowManager.this));
            }
        });
        if (floatWindowVO.getIconUrl() != null && !floatWindowVO.getIconUrl().isEmpty()) {
            setIcon(floatWindowVO.getIconUrl());
        }
        if (floatWindowVO.getText() != null && !floatWindowVO.getText().isEmpty()) {
            setText(floatWindowVO.getText());
        } else if (floatWindowVO.getTimeSecond() >= 0) {
            setTimeSecond(floatWindowVO.getTimeSecond());
        }
        notifyLifecycle(2);
        return true;
    }
}
