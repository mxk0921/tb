package com.alipay.android.msp.ui.widget.gifimage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBFocusable;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.ResUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import tb.f7l;
import tb.pg1;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GifImagePlugin extends AbsFBPlugin implements FBFocusable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ImageView q;
    public String r;
    public boolean s = false;
    public final Context t;

    public GifImagePlugin(Context context) {
        this.t = context;
    }

    public static /* synthetic */ void access$000(GifImagePlugin gifImagePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb048dd0", new Object[]{gifImagePlugin});
        } else {
            gifImagePlugin.f();
        }
    }

    public static DisplayMetrics e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("aeee540d", new Object[]{context});
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static /* synthetic */ Object ipc$super(GifImagePlugin gifImagePlugin, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1305055005) {
            return new Boolean(super.onLoadFinish());
        }
        if (hashCode == -740778895) {
            return new Boolean(super.setRect(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/ui/widget/gifimage/GifImagePlugin");
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        FBBorderImg fBBorderImg = new FBBorderImg(context);
        this.q = fBBorderImg;
        fBBorderImg.setScaleType(ImageView.ScaleType.FIT_XY);
        return this.q;
    }

    public final double d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c12e8916", new Object[]{this, str})).doubleValue();
        }
        if (str.contains("PX")) {
            return Double.parseDouble(str.replace("PX", "").trim());
        }
        return e(this.t).density * Double.parseDouble(str.replace("px", "").trim());
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
        } else {
            this.q = null;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c3e4ece", new Object[]{this});
        } else if (this.s) {
            this.q.setImageResource(R.drawable.alipay_msp_indicatior_loading);
        } else {
            g(this.r, MspContextUtil.getContext(), this.q);
        }
    }

    public final void g(String str, Context context, ImageView imageView) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90763edc", new Object[]{this, str, context, imageView});
        } else if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf("/")) != -1) {
            String substring = str.substring(0, indexOf);
            if (TextUtils.isEmpty(substring)) {
                substring = context.getPackageName();
            }
            String substring2 = str.substring(indexOf + 1);
            if (!TextUtils.isEmpty(substring2) && !TextUtils.isEmpty(substring)) {
                int indexOf2 = substring2.indexOf(".");
                if (indexOf2 >= 0) {
                    substring2 = substring2.substring(0, indexOf2);
                }
                int resourceId = ResUtils.getResourceId(substring2, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, substring);
                if (resourceId == 0 || resourceId == -1) {
                    LogUtil.record(1, "GifImagePlugin:loadImgWithCodeImpl", str);
                    return;
                }
                AnimationDrawable animationDrawable = (AnimationDrawable) context.getResources().getDrawable(resourceId);
                imageView.setImageDrawable(animationDrawable);
                animationDrawable.start();
                LogUtil.record(1, "GifImagePlugin:loadImgWithDrawable", str);
            }
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539f2704", new Object[]{this});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            this.q.post(new Runnable() { // from class: com.alipay.android.msp.ui.widget.gifimage.GifImagePlugin.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        GifImagePlugin.access$000(GifImagePlugin.this);
                    }
                }
            });
        } else {
            f();
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean onLoadFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b23670e3", new Object[]{this})).booleanValue();
        }
        super.onLoadFinish();
        h();
        return true;
    }

    public void onVisibilityChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcb329b", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            h();
        }
    }

    @Override // com.alipay.android.app.template.FBFocusable
    public void requestFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10da4b90", new Object[]{this});
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean setRect(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3d89c71", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)})).booleanValue();
        }
        return super.setRect(f, f2, f3, f4);
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateAttr(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a285a79", new Object[]{this, str, str2})).booleanValue();
        }
        LogUtil.record(1, "GifImagePlugin:updateAttr", "key=" + str + " value=" + str2);
        if (str.equals("src")) {
            if (!((FBBorderImg) this.q).resetWheelHelper(str2)) {
                if (TextUtils.equals(str2, "indicatior")) {
                    this.s = true;
                    str2 = "";
                } else {
                    this.s = false;
                }
                this.r = str2;
                if (this.q.getVisibility() == 0) {
                    h();
                }
            }
        } else if (str.equals("srcheight")) {
            d(str2);
        } else if (str.equals("srcwidth")) {
            d(str2);
        } else if (!TextUtils.equals(str, "defaultvalue") && !TextUtils.equals(str, "failurevalue")) {
            if (TextUtils.equals("imageGray", str)) {
                Boolean.parseBoolean(str2);
            } else if (TextUtils.equals(str, "contentmode") && !TextUtils.isEmpty(str2)) {
                if (TextUtils.equals("ScaleToFill", str2)) {
                    this.q.setScaleType(ImageView.ScaleType.FIT_XY);
                } else if (TextUtils.equals("ScaleAspectFit", str2)) {
                    this.q.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (TextUtils.equals("ScaleAspectFill", str2)) {
                    this.q.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else if (TextUtils.equals("ScaleAspectAuto", str2)) {
                    this.q.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } else if (TextUtils.equals("Center", str2)) {
                    this.q.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
            }
        }
        return true;
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public boolean updateCSS(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c310ec99", new Object[]{this, str, str2})).booleanValue();
        }
        this.q.setVisibility(0);
        if (TextUtils.equals(str, "-webkit-filter") || TextUtils.equals(str, "webkitFilter")) {
            int indexOf = str2.indexOf(f7l.BRACKET_START_STR);
            String replace = (indexOf > 0 ? str2.substring(indexOf + 1) : str2).replace(f7l.BRACKET_END_STR, "");
            if (str2.startsWith(Constants.Event.BLUR)) {
                d(replace);
            } else if (str2.startsWith("grayscale")) {
                TextUtils.equals(replace, "1");
            }
            str2 = replace;
        }
        if (TextUtils.equals(str, "visibility-display") && TextUtils.equals(str2, "hidden")) {
            ((FBBorderImg) this.q).resetWheelHelper("");
            this.q.setVisibility(8);
            LogUtil.record(1, "phonecashier", "GifImagePlugin", "updateCSS");
        }
        return true;
    }
}
