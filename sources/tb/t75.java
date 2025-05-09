package tb;

import android.media.AudioManager;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.media.DWViewUtil;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t75 extends GestureDetector.SimpleOnGestureListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f28533a;
    public boolean c;
    public int d;
    public final int e;
    public final String f;
    public final float g;
    public float h;
    public float i;
    public final FrameLayout j;
    public FrameLayout k;
    public ProgressBar l;
    public ImageView m;
    public TextView n;
    public LinearLayout o;
    public ProgressBar p;
    public LinearLayout q;
    public ProgressBar r;
    public long s;
    public int b = -1;
    public final StringBuilder t = new StringBuilder();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$avplayer$DWVideoScreenType;

        static {
            int[] iArr = new int[DWVideoScreenType.values().length];
            $SwitchMap$com$taobao$avplayer$DWVideoScreenType = iArr;
            try {
                iArr[DWVideoScreenType.PORTRAIT_FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$avplayer$DWVideoScreenType[DWVideoScreenType.LANDSCAPE_FULL_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(452985127);
    }

    public t75(DWContext dWContext, FrameLayout frameLayout) {
        this.f28533a = dWContext;
        this.j = frameLayout;
        int duration = dWContext.getVideo().getDuration();
        this.e = duration;
        this.f = new SimpleDateFormat("mm:ss").format(Integer.valueOf(duration));
        try {
            this.g = ((AudioManager) dWContext.getActivity().getApplicationContext().getSystemService("audio")).getStreamMaxVolume(3);
        } catch (Exception unused) {
            this.g = 15.0f;
        }
        this.h = this.f28533a.getVideo().o();
        this.i = 1.0f;
        e();
    }

    public static /* synthetic */ Object ipc$super(t75 t75Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 307521857) {
            return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        if (hashCode == 587072321) {
            return new Boolean(super.onDown((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/player/DWGestureController");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        if (this.b == 0) {
            g(false, false);
            if (this.f28533a.isInstantSeekingEnable()) {
                b();
            }
        }
        this.k.setVisibility(8);
        this.o.setVisibility(8);
        this.q.setVisibility(8);
    }

    public void b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c22ca0", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f28533a;
        if (dWContext != null && dWContext.mUTAdapter != null) {
            HashMap hashMap = new HashMap();
            String str2 = "0";
            hashMap.put("type", str2);
            int i = this.d;
            if (i < 0) {
                str2 = "1";
            } else if (i <= 0) {
                str2 = "2";
            }
            hashMap.put("progress", str2);
            if (this.f28533a.isMute()) {
                str = "true";
            } else {
                str = "false";
            }
            hashMap.put("mute", str);
            DWContext dWContext2 = this.f28533a;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "videoProgress", dWContext2.getUTParams(), hashMap);
        }
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        int i = a.$SwitchMap$com$taobao$avplayer$DWVideoScreenType[this.f28533a.screenType().ordinal()];
        if (i == 1) {
            return DWViewUtil.getPortraitScreenWidth();
        }
        if (i == 2) {
            return DWViewUtil.getVideoWidthInLandscape(this.f28533a.getActivity());
        }
        if (this.f28533a.isFloating()) {
            return this.f28533a.mNormalWidth;
        }
        return this.f28533a.mWidth;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f3bb73", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.q;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f28533a.getActivity()).inflate(R.layout.dw_gesture_progress_layout, (ViewGroup) null);
        this.k = frameLayout;
        this.l = (ProgressBar) frameLayout.findViewById(R.id.dw_gesture_background_progress);
        this.m = (ImageView) this.k.findViewById(R.id.dw_gesture_progress_img);
        this.n = (TextView) this.k.findViewById(R.id.dw_gesture_progress_tv);
        this.k.setVisibility(8);
        ViewParent parent = this.k.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        this.j.addView(this.k);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(this.f28533a.getActivity()).inflate(R.layout.dw_gesture_volume_layout, (ViewGroup) null).findViewById(R.id.dw_gesture_volume);
        this.o = linearLayout;
        this.p = (ProgressBar) linearLayout.findViewById(R.id.dw_gesture_volume_progress);
        this.o.setVisibility(8);
        ViewParent parent2 = this.o.getParent();
        if (parent2 != null) {
            ((ViewGroup) parent2).removeAllViews();
        }
        this.j.addView(this.o);
        LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(this.f28533a.getActivity()).inflate(R.layout.dw_gesture_bright_layout, (ViewGroup) null).findViewById(R.id.dw_gesture_bright);
        this.q = linearLayout2;
        this.r = (ProgressBar) linearLayout2.findViewById(R.id.dw_gesture_bright_progress);
        this.q.setVisibility(8);
        ViewParent parent3 = this.q.getParent();
        if (parent3 != null) {
            ((ViewGroup) parent3).removeAllViews();
        }
        this.j.addView(this.q);
        this.p.setProgress((int) ((this.h / this.g) * 100.0f));
        this.r.setProgress(((int) this.i) * 100);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.b = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r0 > r2) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r6, boolean r7) {
        /*
            r5 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.t75.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0022
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r6)
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2 = 0
            r7[r2] = r5
            r2 = 1
            r7[r2] = r1
            r1 = 2
            r7[r1] = r6
            java.lang.String r6 = "7bcc95bc"
            r0.ipc$dispatch(r6, r7)
            return
        L_0x0022:
            int r0 = r5.b
            if (r0 != 0) goto L_0x0069
            long r0 = r5.s
            int r2 = r5.d
            int r2 = r2 * 1000
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0036
        L_0x0034:
            r0 = r2
            goto L_0x003e
        L_0x0036:
            int r2 = r5.e
            long r2 = (long) r2
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x003e
            goto L_0x0034
        L_0x003e:
            android.widget.ProgressBar r2 = r5.l
            if (r2 == 0) goto L_0x004f
            r3 = 100
            long r3 = r3 * r0
            float r3 = (float) r3
            int r4 = r5.e
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = (int) r3
            r2.setProgress(r3)
        L_0x004f:
            if (r7 == 0) goto L_0x0052
            return
        L_0x0052:
            if (r6 == 0) goto L_0x005f
            com.taobao.avplayer.DWContext r6 = r5.f28533a
            tb.wtb r6 = r6.getVideo()
            int r7 = (int) r0
            r6.b(r7)
            goto L_0x0069
        L_0x005f:
            com.taobao.avplayer.DWContext r6 = r5.f28533a
            tb.wtb r6 = r6.getVideo()
            int r7 = (int) r0
            r6.seekTo(r7)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t75.g(boolean, boolean):void");
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cde6cda6", new Object[]{this})).booleanValue();
        }
        if (this.b == 0) {
            if (this.f28533a.isInstantSeekingEnable()) {
                b();
            }
            g(false, false);
        }
        this.k.setVisibility(8);
        this.o.setVisibility(8);
        this.q.setVisibility(8);
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
        }
        this.c = true;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f), new Float(f2)})).booleanValue();
        }
        if (motionEvent == null || motionEvent2 == null) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        float x = motionEvent.getX();
        motionEvent.getY();
        motionEvent2.getRawY();
        if (this.c) {
            if (Math.abs(f) >= Math.abs(f2)) {
                this.d = 0;
                this.s = this.f28533a.getVideo().getCurrentPosition();
                this.b = 0;
                if (!this.f28533a.isHiddenGestureView()) {
                    this.k.setVisibility(0);
                }
            } else {
                double d = x;
                if (d > (c() * 3.0d) / 5.0d) {
                    this.b = 1;
                } else if (d < (c() * 2.0d) / 5.0d) {
                    this.b = 2;
                }
            }
        }
        int i2 = this.b;
        if (i2 == 0) {
            if (Math.abs(f) > Math.abs(f2)) {
                long j = 0;
                if (f >= DWViewUtil.dip2px(this.f28533a.getActivity(), 1.0f)) {
                    this.d--;
                    this.m.setBackgroundDrawable(this.f28533a.getActivity().getResources().getDrawable(R.drawable.dw_gesture_progress_decrease));
                    this.t.setLength(0);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
                    if (this.d < 0) {
                        long abs = this.s - (Math.abs(i) * 1000);
                        if (abs >= 0) {
                            j = abs;
                        }
                        str = simpleDateFormat.format(Long.valueOf(j));
                    } else {
                        long abs2 = this.s + (Math.abs(i) * 1000);
                        long j2 = this.e;
                        if (abs2 > j2) {
                            abs2 = j2;
                        }
                        str = simpleDateFormat.format(Long.valueOf(abs2));
                    }
                    this.t.append(str);
                    StringBuilder sb = this.t;
                    sb.append(" / ");
                    sb.append(this.f);
                    SpannableString spannableString = new SpannableString(this.t.toString());
                    spannableString.setSpan(new ForegroundColorSpan(this.f28533a.getActivity().getResources().getColor(R.color.dw_interactive_sdk_red_a)), 0, str.length(), 33);
                    this.n.setText(spannableString);
                    g(this.f28533a.isInstantSeekingEnable(), true ^ this.f28533a.isInstantSeekingEnable());
                } else if (f <= (-DWViewUtil.dip2px(this.f28533a.getActivity(), 1.0f))) {
                    this.d++;
                    this.m.setBackgroundDrawable(this.f28533a.getActivity().getResources().getDrawable(R.drawable.dw_gesture_progress_increase));
                    this.t.setLength(0);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("mm:ss");
                    long j3 = this.s + (this.d * 1000);
                    long j4 = this.e;
                    if (j3 > j4) {
                        j3 = j4;
                    }
                    if (j3 >= 0) {
                        j = j3;
                    }
                    String format = simpleDateFormat2.format(Long.valueOf(j));
                    this.t.append(format);
                    StringBuilder sb2 = this.t;
                    sb2.append(" / ");
                    sb2.append(this.f);
                    SpannableString spannableString2 = new SpannableString(this.t.toString());
                    spannableString2.setSpan(new ForegroundColorSpan(this.f28533a.getActivity().getResources().getColor(R.color.dw_interactive_sdk_red_a)), 0, format.length(), 33);
                    this.n.setText(spannableString2);
                    g(this.f28533a.isInstantSeekingEnable(), true ^ this.f28533a.isInstantSeekingEnable());
                }
            }
        } else if (i2 == 1) {
            this.h = this.f28533a.getVideo().o();
            if (Math.abs(f2) > Math.abs(f)) {
                if (f2 >= DWViewUtil.dip2px(this.f28533a.getActivity(), 5.0f)) {
                    float f3 = this.h;
                    if (f3 < this.g) {
                        this.h = f3 + 1.0f;
                    }
                } else if (f2 < (-DWViewUtil.dip2px(this.f28533a.getActivity(), 5.0f))) {
                    float f4 = this.h;
                    if (f4 > 0.0f) {
                        this.h = f4 - 1.0f;
                    }
                }
                if (!this.f28533a.isHiddenGestureView()) {
                    this.o.setVisibility(0);
                }
                this.f28533a.getVideo().j(this.h);
                this.p.setProgress((int) ((this.h / this.g) * 100.0f));
            }
        } else if (i2 == 2 && Math.abs(f2) > Math.abs(f)) {
            WindowManager.LayoutParams attributes = this.f28533a.getActivity().getWindow().getAttributes();
            if (f2 >= DWViewUtil.dip2px(this.f28533a.getActivity(), 5.0f)) {
                float f5 = this.i + 0.1f;
                attributes.screenBrightness = f5;
                if (f5 > 1.0f) {
                    attributes.screenBrightness = 1.0f;
                } else if (f5 < 0.01f) {
                    attributes.screenBrightness = 0.01f;
                }
            } else if (f2 < (-DWViewUtil.dip2px(this.f28533a.getActivity(), 5.0f))) {
                float f6 = this.i - 0.1f;
                attributes.screenBrightness = f6;
                if (f6 > 1.0f) {
                    attributes.screenBrightness = 1.0f;
                } else if (f6 < 0.01f) {
                    attributes.screenBrightness = 0.01f;
                }
            }
            this.i = attributes.screenBrightness;
            if (!this.f28533a.isHiddenGestureView()) {
                this.q.setVisibility(0);
            }
            this.f28533a.getActivity().getWindow().setAttributes(attributes);
            this.r.setProgress((int) (this.i * 100.0f));
        }
        this.c = false;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}
