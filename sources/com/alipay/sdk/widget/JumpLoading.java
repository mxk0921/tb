package com.alipay.sdk.widget;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.sdk.util.LogUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class JumpLoading {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOADING = "正在加载";
    public static final String LOADING_GO_AUTH = "去支付宝授权";
    public static final String LOADING_GO_PAY = "去支付宝付款";
    public static String RES_ALIPAY_CIRCLE = "iVBORw0KGgoAAAANSUhEUgAAAF4AAABeCAYAAACq0qNuAAAAAXNSR0IArs4c6QAACp9JREFUeAHtXWtsHNUV3l2vvXgdh8QJJViULKVVoIEUFwJRU1nBAiJEK/IjBSQkKtQKoQaIQDRqS1WlP1AqFRT6qyj9V6mloVWBtlYVEHYFpMUlL6OUkDrITakgMcSO114/so/p961ndu+end2d3Z0dbzz3SMdzn+ee88313Zn7OBMMNCEZhhGFWusEr0W8UzCigSnBpxE/qXIwGJxBvKko2AzaAOh26LEZ3Ae+DXwzOAx2g1IQcgg8CB4AH8SNmMXVnwSwI+Dt4FfBc2CviG2xTbYd8Q36MPZm8AvgCfBiE3WgLvwP85Q8G2pgXC8sexp8p0MLR1DuAzDHa14ZnwCrYzqiBeP+SsS/BL4WzN8IXhl3Qq+h0DMYht50UrjpywDwPvBb4Ep0CgX2ge8HX+6WYZRlyqRstlGJqCt/ay5OgvLd4P0VrDyD/L3gHq+sZFtmm2y7HFH3bq/0qrsdKBsGPwmOg0vRIDLuBrv15FK13mzb1GEQ11JEG2jLounpyDAoGAMPgUtRPzK+5kiYh4WoE5i6laJ3kBHzUCXnTUGxbeBSTyr/RN5G59IWpyR1BFNXO6Jt2xZHM5tWoQz/ZZ+30xRp4+BHwCGbqk2ZRF1Nnam7HdHWxR16oEA7+M922iHtZfBlTYmuA6Wou2kDLkVEm/m27T2h4ZXgg0UqGcY80nZ6r1FjWqQtYNokibbzvcE7QoN8VDwuNUF8FOz5W2CjLadNpm24GMbYXNrYNZwwdhxJjP1sZH59o9vPyke77Ol2oB9BumsvPp4YU0UjtA1MG43egbgReGk8y9f0n597anj26ipEZYtW9aOHNjmu/QUs7zJn/rbgdftsVuoS/GPatgWmDR6e4ITnAn2YyEReP3vh2A/eq27YcQw8QOcv+Utg+Rz+CtLugmLxBVWW7l/Txru2XtE2qlo5fD69/O3Ppt7f/S+jTU0vF3YMPIQ8C/6GEMaefj8UmhfpSzZKWzdc2rFhY1cLJ+xy9PZnqTXvjk8P5RIqBBwBj97OFwf5pHIUadv8BLqF5e71wek7V7fecG1nqGBlq/+T5I0PH5rZY5Urd604LQzQYxBAkFcogv6D8CaAvmTHdMXWksGnhuev/91Hc0f+N5NutQpd2hrKfC/W1runJ3rQSrO7lu3x5ri+HxVV0C8g/i2/g04wn/1K5Ph9V7U91BoKGoyTJpOZUP9Y8q+PjZRf3SoLPOQ8Dr6FAhXaBdC5hqkJCDy3of03917Z9rIKxnuT6c6xTxN/UNMch9Hb+ZIkp3YLGnAszAcFNw/EP7ae7Xnt+ONE5vvDia+WMr1cj9+LStxOYdEEAg9bEX0tROCOK9q2rGwLZazURMoIHp7IlOyotsCjp/dBwL2WEPP6Iwwxn4o0HTUR2H3dJf++pzv8ogrIwFjyqp3HZp5Q06ywLfDI/KlVwLy+i+s+kaajAoHExo5vr18eSqjJb5xN7lbjVrgIePR27gb4ulXAvO5Ab8/9G4k8HTUR+H0wmO67PPyo+ox+fDK9/NEjM49VBAnAHwCr1F+xki5QgAB+aM+oP7S3vhEvGqILejzQ5pSu3PfyTIFUHamIwC1dLT9RCw2dS63edXT6ATWtAHhkfFfNRPhvGGL+LtJ0tAICe2/s2NezsuW8WuxYPPNjNZ4DHr2d+wjvUzMR5sSYphoQuLUr/Lxa7Z3x9LpdHxi5x/Mc8Cj0TbA6NcB5mANqZR12jsCaS6J7LouE0laNeNIITk7P5oYgFfgHrULm9UUMM/kZf5Gpo+URwAzmhU2rw8NqqRNTqdw4nwUew0w7CmxVCyH8axHX0SoR+EI08Jxa5R/n0mt2DMVXMc3q8ZsRVldPPkRvP6pW0uHqEfhFz7LfxjpCSatmMmMEjXD4O4xbwPdZmeZ1QMR1tEYEvtzZckqtemYufQ/jFvC3qZkIa+AFILVGu6PB19W6p6YzNzDO7Wo86CX3wnAtVZMLCKxobf2VKub9qcyyH56Ir2KPXwdW9wKOYHz39ZKeClS9Ya5SxaItXLXLUgrj/MxcaKsFvJXOK4+9aHIRgc9Hg+OquEQquEkDryLSoPCqSOi/qujJlHG9HfA87KXJRQRWhAMnVHHn5jNXE/i1aiLCIyKuo3UisKw1dFgVce6C0UXgO9VEhLm2qslFBKJh4yNVXCIVaLMDnudINbmIQEu6cK16Nm2ENfAuAlxKVEs4dEbNww6EkAZeRaRB4blMpBD4dCBI4DU1GIGfbwgkr2zPL4F/LhLMztXIMV3+2DZYLV+I79x3U0eA4JN/eVN0KoC5mlGwSjFfQOGhkQCXB69VGuVQo3t842+CHEWm7ID39ghh441uhha6hBJZ4E+LRKf+XUQ1HS2DwBdF3mn2eDk3w2liTe4iQIdFKp20A14WUivocG0IyM6sga8Nx6pryc58ko+TUXBSfdZBeMme0K4asjorEEuBLbGOhrDMxyOD8kyTXPyus3lfV5dYHiLmHONJcnG7byFZ/3UBAYllHmt0/dvFv0PBXhAXGvetCOAqPf/dngMDmXT4Qw+kKvXkCuhATQgATHr8U4kYc7vkwoYmjDmzCMudwXITa02N+7ySxPCAiXUeFtyJ7eqtQZh+GdX9NvnCOlQRAWJnYohLjrYXVUQWnSxLL3p3FxXUCY4QAJb0q6kSsY3YVkYGHRyrlP8Ftq2hE0shABAHVSARfqFUWb5M0feWJOkYqGR9nbGAAACkA1FJcn9qIVworY9bFkJSdQwYSq+t8sGlWCYq9cpbhXjTe0kttmRxUoiVDX69jrRBRel2nG5frbdcRzL8WIgYgaWL3LccY4HK9Pku6RHHAnxaEIDRna8kOWVQHh3Upv90lehr96J1WVve2vpziQ1Y+iPeX7VkCNGOgqpADXjRl7JKdLLUXYWIfFFUpNN6STvzJXSICAAg+h+W9GTN6EASX3vptF4lOjgu/0xac4sXX0ViAZZOn4lZfdMtEMDNOHIqYRRpvl+lIgZgYqESsYq50oUgiF9DkEQHx8tdaeAiFELbwcRA0jZXzYF0u68iDCDdfuLH1dabSxhtBtN2SQUeO1zRGi1wvLf7OgJ/zX0DPm0F02ZJxKa+cb3UnYJgrlTZfSWBd3/JDzu0EWzX04lJdmWpFHZ1p6MB3zvuBwYq8SMG3uw3RUO+/lSFgjpBr+0lqdZ/Ad5lsN2ww2faJfOSRVvA8jkdSVnbvenp8iahcf05IgmKV3GAz6cdu0dNJOsPcDX8PgBkvmTxrc2OOEfd9Isp1BEs59Mte2ibuy9Hbt0VKMbphSFLU5srl8Sabg2XOoGpWymiTTG3cGqIHCjIoYezmtL3PJJyNIiQ/qxoI+4AgOUj535wOeKmqb1gz7YLsi2zTbZdjqi7t4+Kbt4IKM9lRLmGa2ewrz4dnT9u7CbaNrKANFfanwZLp9E2pbNJdN9Cb1FkntNinJ5FeDzUYgRtP5bOoy88hUF2epjuNZRdOh9LhzEFhBvAhQPuWCv1BIQsz4g6UBf/LOzAWM7ybQf/Cczty14R22KbbHvRZlU9G2oKur2IAADO7G0GcysEj66wB7o1xUr/yDxqxH2gA+CDRVulkeg1NQXw0mjcCPrC5Dit8lrEeTRdZURz47017p9GGn8TcswzRyzYTPR//0eajTDt10YAAAAASUVORK5CYII=";

    /* renamed from: a  reason: collision with root package name */
    public JumpDialog f4541a;
    public Activity b;
    public String c;
    public boolean d = false;
    public final Handler e = new Handler(Looper.getMainLooper()) { // from class: com.alipay.sdk.widget.JumpLoading.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/widget/JumpLoading$3");
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
            } else {
                JumpLoading.this.dismiss();
            }
        }
    };

    public JumpLoading(Activity activity) {
        this.b = activity;
    }

    public static /* synthetic */ Activity access$000(JumpLoading jumpLoading) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("b98d484d", new Object[]{jumpLoading});
        }
        return jumpLoading.b;
    }

    public static /* synthetic */ String access$100(JumpLoading jumpLoading) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea77c986", new Object[]{jumpLoading});
        }
        return jumpLoading.c;
    }

    public static /* synthetic */ JumpDialog access$200(JumpLoading jumpLoading) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JumpDialog) ipChange.ipc$dispatch("e741baa1", new Object[]{jumpLoading});
        }
        return jumpLoading.f4541a;
    }

    public static /* synthetic */ JumpDialog access$202(JumpLoading jumpLoading, JumpDialog jumpDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JumpDialog) ipChange.ipc$dispatch("fdf0fdbf", new Object[]{jumpLoading, jumpDialog});
        }
        jumpLoading.f4541a = jumpDialog;
        return jumpDialog;
    }

    public static /* synthetic */ boolean access$300(JumpLoading jumpLoading) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2107549c", new Object[]{jumpLoading})).booleanValue();
        }
        return jumpLoading.d;
    }

    public static /* synthetic */ Handler access$400(JumpLoading jumpLoading) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("7d50c3af", new Object[]{jumpLoading});
        }
        return jumpLoading.e;
    }

    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        Activity activity = this.b;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.sdk.widget.JumpLoading.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (JumpLoading.access$200(JumpLoading.this) != null && JumpLoading.access$200(JumpLoading.this).isShowing()) {
                        try {
                            JumpLoading.access$400(JumpLoading.this).removeMessages(1);
                            JumpLoading.access$200(JumpLoading.this).dismiss();
                        } catch (Exception e) {
                            LogUtils.printExceptionStackTrace(e);
                        }
                    }
                }
            });
        }
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        this.b = null;
        this.f4541a = null;
    }

    public String getLoadingText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccfead86", new Object[]{this});
        }
        return this.c;
    }

    public void setCancelable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5895817", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void setLoadingText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea8e3218", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void showProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83b03d1", new Object[]{this});
            return;
        }
        Activity activity = this.b;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.alipay.sdk.widget.JumpLoading.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (JumpLoading.access$200(JumpLoading.this) == null) {
                        JumpLoading jumpLoading = JumpLoading.this;
                        JumpLoading jumpLoading2 = JumpLoading.this;
                        JumpLoading.access$202(jumpLoading, new JumpDialog(JumpLoading.access$000(jumpLoading2)));
                        JumpLoading.access$200(JumpLoading.this).setCancelable(JumpLoading.access$300(JumpLoading.this));
                    }
                    try {
                        if (!JumpLoading.access$200(JumpLoading.this).isShowing()) {
                            JumpLoading.access$200(JumpLoading.this).show();
                            JumpLoading.access$400(JumpLoading.this).sendEmptyMessageDelayed(1, 30000L);
                        }
                    } catch (Exception e) {
                        LogUtils.printExceptionStackTrace(e);
                    }
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class JumpDialog extends AlertDialog {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public JumpDialog(Context context) {
            super(context);
        }

        public static int a(Context context, float f) {
            Resources resources;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue();
            }
            if (context == null) {
                resources = Resources.getSystem();
            } else {
                resources = context.getResources();
            }
            return (int) (f * resources.getDisplayMetrics().density);
        }

        public static Drawable b(Context context, String str, int i) {
            Throwable th;
            ByteArrayInputStream byteArrayInputStream;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("37da6901", new Object[]{context, str, new Integer(i)});
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    if (i <= 0) {
                        i = 240;
                    }
                    options.inDensity = i;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(byteArrayInputStream, null, options));
                    try {
                        byteArrayInputStream.close();
                    } catch (Exception unused) {
                    }
                    return bitmapDrawable;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        LogUtils.printExceptionStackTrace(th);
                        if (byteArrayInputStream == null) {
                            return null;
                        }
                        try {
                            byteArrayInputStream.close();
                            return null;
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayInputStream = null;
            }
        }

        public static /* synthetic */ Object ipc$super(JumpDialog jumpDialog, String str, Object... objArr) {
            if (str.hashCode() == -641568046) {
                super.onCreate((Bundle) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/widget/JumpLoading$JumpDialog");
        }

        @Override // android.app.AlertDialog, android.app.Dialog
        public void onCreate(Bundle bundle) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
                return;
            }
            super.onCreate(bundle);
            Context context = getContext();
            LinearLayout linearLayout = new LinearLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, a(context, 50.0f));
            layoutParams.gravity = 17;
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-450944201);
            gradientDrawable.setCornerRadius(a(context, 5.0f));
            linearLayout.setBackgroundDrawable(gradientDrawable);
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(a(context, 20.0f), a(context, 20.0f));
            layoutParams2.gravity = 16;
            layoutParams2.setMargins(a(JumpLoading.access$000(JumpLoading.this), 17.0f), a(JumpLoading.access$000(JumpLoading.this), 10.0f), a(JumpLoading.access$000(JumpLoading.this), 8.0f), a(JumpLoading.access$000(JumpLoading.this), 10.0f));
            imageView.setLayoutParams(layoutParams2);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageDrawable(b(context, JumpLoading.RES_ALIPAY_CIRCLE, 480));
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(900L);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            imageView.startAnimation(rotateAnimation);
            TextView textView = new TextView(context);
            if (TextUtils.isEmpty(JumpLoading.access$100(JumpLoading.this))) {
                str = JumpLoading.LOADING;
            } else {
                str = JumpLoading.access$100(JumpLoading.this);
            }
            textView.setText(str);
            textView.setTextSize(16.0f);
            textView.setTextColor(-1);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 16;
            layoutParams3.setMargins(0, 0, a(context, 17.0f), 0);
            textView.setLayoutParams(layoutParams3);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.addView(linearLayout);
            setContentView(frameLayout);
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }

    public JumpLoading(Activity activity, String str) {
        this.b = activity;
        this.c = str;
    }
}
