package tb;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cqe extends qfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138850);
    }

    public static /* synthetic */ Object ipc$super(cqe cqeVar, String str, Object... objArr) {
        if (str.hashCode() == -1666188206) {
            cqeVar.e((View) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/ImageViewRender");
    }

    @Override // tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof ImageView) && (imageView = (ImageView) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                j(imageView, hashMap, cjdVar);
            }
        }
    }

    public void j(ImageView imageView, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8766fbe", new Object[]{this, imageView, hashMap, cjdVar});
        } else if (imageView != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(imageView);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                    switch (cdw.a(valueOf)) {
                        case cdw.T_ADJUST_VIEW_BOUNDS /* 10202 */:
                            imageView.setAdjustViewBounds(Boolean.parseBoolean(value.toString()));
                            continue;
                        case cdw.T_MAX_HEIGHT /* 10203 */:
                            imageView.setMaxHeight(lra.m(value.toString()));
                            continue;
                        case cdw.T_MAX_WIDTH /* 10204 */:
                            imageView.setMaxWidth(lra.m(value.toString()));
                            continue;
                        case cdw.T_SCALE_TYPE /* 10205 */:
                            k(imageView, Integer.parseInt(value.toString()));
                            continue;
                        case cdw.T_IMAGE_SOURCE /* 10206 */:
                        case cdw.T_IMAGE /* 10207 */:
                            String obj = value.toString();
                            if (!obj.startsWith("#") && !obj.startsWith(lra.COLOR_RESOURCE)) {
                                if (obj.startsWith(lra.DRAWABLE_RESOURCE)) {
                                    imageView.setImageDrawable(lra.p(obj));
                                    continue;
                                } else if (ntq.i().l() != null) {
                                    ntq.i().l().a(imageView, obj);
                                }
                            }
                            imageView.setImageDrawable(new ColorDrawable(lra.b(obj)));
                            break;
                        case cdw.T_TINT /* 10208 */:
                            imageView.setColorFilter(lra.b(value.toString()));
                            continue;
                        case cdw.T_CONTENT_DESCRIPTION /* 10209 */:
                            imageView.setContentDescription(value.toString());
                            continue;
                        default:
                            continue;
                    }
                    mgh.b(th);
                } else {
                    return;
                }
            }
            e(imageView, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(imageView);
            }
        }
    }

    public final void k(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4e0800", new Object[]{this, imageView, new Integer(i)});
        } else if (i >= 0) {
            switch (i) {
                case 1:
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    return;
                case 2:
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                case 3:
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                case 4:
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                case 5:
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                case 6:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    return;
                default:
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    return;
            }
        }
    }
}
