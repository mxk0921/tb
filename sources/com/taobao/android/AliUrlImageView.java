package com.taobao.android;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import com.taobao.uikit.feature.features.ReusableImageShapeFeature;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.aq0;
import tb.bq0;
import tb.s8d;
import tb.vp0;
import tb.wp0;
import tb.xp0;
import tb.yp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliUrlImageView extends TUrlImageView implements AliUrlImageViewInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean enableReusableImageFeature;
    private ImageShapeFeature mImageShapeFeature;
    private RatioFeature mRatioFeature;

    public AliUrlImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEnableLayoutOptimize(true);
    }

    private ImageShapeFeature getImageShapeFeature() {
        ImageShapeFeature imageShapeFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageShapeFeature) ipChange.ipc$dispatch("7cfe067b", new Object[]{this});
        }
        if (this.mImageShapeFeature == null) {
            if (this.enableReusableImageFeature) {
                imageShapeFeature = new ReusableImageShapeFeature();
            } else {
                imageShapeFeature = new ImageShapeFeature();
            }
            this.mImageShapeFeature = imageShapeFeature;
            addFeature(imageShapeFeature);
        }
        return this.mImageShapeFeature;
    }

    private RatioFeature getRatioFeature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RatioFeature) ipChange.ipc$dispatch("d428d3f9", new Object[]{this});
        }
        if (this.mRatioFeature == null) {
            RatioFeature ratioFeature = new RatioFeature();
            this.mRatioFeature = ratioFeature;
            addFeature(ratioFeature);
        }
        return this.mRatioFeature;
    }

    public static /* synthetic */ Object ipc$super(AliUrlImageView aliUrlImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1542829318:
                super.setStrategyConfig(objArr[0]);
                return null;
            case -1076905364:
                super.setImageUrl((String) objArr[0], (PhenixOptions) objArr[1]);
                return null;
            case -826210649:
                super.setImageUrl((String) objArr[0]);
                return null;
            case -818596364:
                return super.failListener((s8d) objArr[0]);
            case 215972184:
                super.setPlaceHoldImageResId(((Number) objArr[0]).intValue());
                return null;
            case 713139031:
                super.setAutoRelease(((Boolean) objArr[0]).booleanValue());
                return null;
            case 924460660:
                super.enableSizeInLayoutParams(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1123925784:
                return super.succListener((s8d) objArr[0]);
            case 1129883254:
                super.setErrorImageResId(((Number) objArr[0]).intValue());
                return null;
            case 1295900082:
                super.setPlaceHoldForeground((Drawable) objArr[0]);
                return null;
            case 1575961262:
                super.setPriorityModuleName((String) objArr[0]);
                return null;
            case 1748955996:
                super.setSkipAutoSize(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/AliUrlImageView");
        }
    }

    public void failListener(xp0<vp0> xp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57aea7c4", new Object[]{this, xp0Var});
        } else if (xp0Var == null) {
            super.failListener((s8d<FailPhenixEvent>) null);
        } else {
            super.failListener(new wp0(xp0Var));
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageStrategyConfigBuilderInterface) ipChange.ipc$dispatch("f3057b15", new Object[]{this, str, new Integer(i)}) : new a(ImageStrategyConfig.v(str, i));
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
        } else {
            super.setAutoRelease(z);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setCornerRadius(float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d984d0", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else {
            getImageShapeFeature().setCornerRadius(f, f2, f3, f4);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setDarkModeOverlay(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5648cb", new Object[]{this, new Boolean(z), new Integer(i)});
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setEnableSizeInLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8df0d32", new Object[]{this, new Boolean(z)});
        } else {
            super.enableSizeInLayoutParams(z);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView
    public void setErrorImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4358a676", new Object[]{this, new Integer(i)});
        } else {
            super.setErrorImageResId(i);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setImageUrl(String str, yp0 yp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d89fd68", new Object[]{this, str, yp0Var});
            return;
        }
        PhenixOptions phenixOptions = new PhenixOptions();
        if (yp0Var != null) {
            Map<String, String> map = yp0Var.f32252a;
            if (map != null) {
                for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                    phenixOptions.addLoaderExtra((String) entry.getKey(), (String) entry.getValue());
                }
            }
            Map<String, String> map2 = yp0Var.b;
            if (map2 != null) {
                phenixOptions.setOpenTraceContext(map2);
            }
        }
        super.setImageUrl(str, phenixOptions);
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bea80e", new Object[]{this, new Integer(i)});
        } else {
            getRatioFeature().setOrientation(i);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setPlaceHoldForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3dddb2", new Object[]{this, drawable});
        } else {
            super.setPlaceHoldForeground(drawable);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
        } else {
            super.setPlaceHoldImageResId(i);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView
    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
        } else {
            super.setPriorityModuleName(str);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setRatio(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978378f0", new Object[]{this, new Float(f)});
        } else {
            getRatioFeature().setRatio(f);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setReusableImageShape(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73a0cba", new Object[]{this, new Boolean(z)});
        } else {
            this.enableReusableImageFeature = z;
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setShape(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4530d25d", new Object[]{this, new Integer(i)});
        } else {
            getImageShapeFeature().setShape(i);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setSkipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683ef35c", new Object[]{this, new Boolean(z)});
        } else {
            super.setSkipAutoSize(z);
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
        } else {
            super.setStrategyConfig(obj);
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setStrokeWidth(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6238daed", new Object[]{this, new Float(f)});
            return;
        }
        getImageShapeFeature().setStrokeEnable(true);
        getImageShapeFeature().setStrokeWidth(f);
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void succListener(xp0<aq0> xp0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c3120", new Object[]{this, xp0Var});
        } else if (xp0Var == null) {
            super.succListener((s8d<SuccPhenixEvent>) null);
        } else {
            super.succListener(new bq0(xp0Var));
        }
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageStrategyConfigBuilderInterface) ipChange.ipc$dispatch("7e5695ca", new Object[]{this, str}) : new a(ImageStrategyConfig.u(str));
    }

    @Override // com.taobao.android.AliUrlImageViewInterface
    public void setStrokeColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db15eb3", new Object[]{this, new Integer(i)});
            return;
        }
        getImageShapeFeature().setStrokeEnable(true);
        getImageShapeFeature().setStrokeColor(i);
    }

    public AliUrlImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnableLayoutOptimize(true);
    }

    public AliImageStrategyConfigBuilderInterface newImageStrategyConfigBuilder(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliImageStrategyConfigBuilderInterface) ipChange.ipc$dispatch("1b869814", new Object[]{this, str, str2}) : new a(ImageStrategyConfig.w(str, str2));
    }

    public AliUrlImageView(Context context) {
        super(context);
        setEnableLayoutOptimize(true);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.android.AliUrlImageViewInterface
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            super.setImageUrl(str);
        }
    }
}
