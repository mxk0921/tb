package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rwn extends qfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138854);
    }

    public static /* synthetic */ Object ipc$super(rwn rwnVar, String str, Object... objArr) {
        if (str.hashCode() == -1666188206) {
            rwnVar.e((View) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/RelativeLayoutRender");
    }

    @Override // tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof RelativeLayout) && (relativeLayout = (RelativeLayout) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                j(relativeLayout, hashMap, cjdVar);
            }
        }
    }

    public void j(RelativeLayout relativeLayout, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e9d9a0", new Object[]{this, relativeLayout, hashMap, cjdVar});
        } else if (relativeLayout != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(relativeLayout);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        int a2 = cdw.a(valueOf);
                        boolean parseBoolean = Boolean.parseBoolean(value.toString());
                        switch (a2) {
                            case cdw.T_LAYOUT_CENTER_HORIZONTAL /* 10402 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams == null) {
                                        break;
                                    } else {
                                        layoutParams.addRule(14, -1);
                                        relativeLayout.setLayoutParams(layoutParams);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_CENTER_VERTICAL /* 10403 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        break;
                                    } else {
                                        layoutParams2.addRule(15, -1);
                                        relativeLayout.setLayoutParams(layoutParams2);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_CENTER_IN_PARENT /* 10404 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams3 == null) {
                                        break;
                                    } else {
                                        layoutParams3.addRule(13, -1);
                                        relativeLayout.setLayoutParams(layoutParams3);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_ALIGN_PARENT_TOP /* 10405 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams4 == null) {
                                        break;
                                    } else {
                                        layoutParams4.addRule(10, -1);
                                        relativeLayout.setLayoutParams(layoutParams4);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_ALIGN_PARENT_BOTTOM /* 10406 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams5 == null) {
                                        break;
                                    } else {
                                        layoutParams5.addRule(12, -1);
                                        relativeLayout.setLayoutParams(layoutParams5);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_ALIGN_PARENT_RIGHT /* 10407 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams6 == null) {
                                        break;
                                    } else {
                                        layoutParams6.addRule(11, -1);
                                        relativeLayout.setLayoutParams(layoutParams6);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                            case cdw.T_LAYOUT_ALIGN_PARENT_LEFT /* 10408 */:
                                if (parseBoolean) {
                                    RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                                    if (layoutParams7 == null) {
                                        break;
                                    } else {
                                        layoutParams7.addRule(9, -1);
                                        relativeLayout.setLayoutParams(layoutParams7);
                                        break;
                                    }
                                } else {
                                    return;
                                }
                        }
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                }
            }
            e(relativeLayout, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(relativeLayout);
            }
        }
    }
}
