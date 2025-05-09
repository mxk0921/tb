package tb;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.extension.UCExtension;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class avg extends qfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138852);
    }

    public static /* synthetic */ Object ipc$super(avg avgVar, String str, Object... objArr) {
        if (str.hashCode() == -1666188206) {
            avgVar.e((View) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/ListViewRender");
    }

    @Override // tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        ListView listView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof ListView) && (listView = (ListView) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                j(listView, hashMap, cjdVar);
            }
        }
    }

    public void j(ListView listView, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b117d9f3", new Object[]{this, listView, hashMap, cjdVar});
        } else if (listView != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(listView);
            }
            for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                String valueOf = String.valueOf(entry.getKey());
                if (!TextUtils.isEmpty(valueOf)) {
                    Object value = entry.getValue();
                    try {
                        switch (cdw.a(valueOf)) {
                            case cdw.T_CACHE_COLOR_HINT /* 10452 */:
                                listView.setCacheColorHint(lra.b(String.valueOf(value)));
                                break;
                            case cdw.T_DIVIDER_HEIGHT /* 10453 */:
                                listView.setDividerHeight(Integer.parseInt(value.toString()));
                                break;
                            case cdw.T_FADING_EDGE /* 10455 */:
                                k(listView, Integer.parseInt(value.toString()));
                                break;
                            case cdw.T_SCROLL_BARS /* 10456 */:
                                m(listView, Integer.parseInt(value.toString()));
                                break;
                            case cdw.T_FAST_SCROLL_ENABLED /* 10457 */:
                                listView.setFastScrollEnabled(((Boolean) value).booleanValue());
                                break;
                            case cdw.T_SCROLL_BAR_STYLE /* 10458 */:
                                l(listView, Integer.parseInt(value.toString()));
                                break;
                            case cdw.T_STACK_FROM_BOTTOM /* 10459 */:
                                listView.setStackFromBottom(((Boolean) value).booleanValue());
                                break;
                            case cdw.T_FADE_SCROLL_BARS /* 10460 */:
                                listView.setScrollbarFadingEnabled(((Boolean) value).booleanValue());
                                break;
                            case cdw.T_SCROLLING_CACHE /* 10461 */:
                                listView.setScrollingCacheEnabled(((Boolean) value).booleanValue());
                                break;
                            case cdw.T_LIST_SELECTOR /* 10462 */:
                                listView.setSelector(new ColorDrawable(lra.b(String.valueOf(value))));
                                break;
                        }
                    } catch (Throwable th) {
                        mgh.b(th);
                    }
                }
            }
            e(listView, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(listView);
            }
        }
    }

    public final void k(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e1a70f", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setHorizontalFadingEdgeEnabled(false);
            listView.setVerticalFadingEdgeEnabled(true);
        } else if (i == 2) {
            listView.setHorizontalFadingEdgeEnabled(true);
            listView.setVerticalFadingEdgeEnabled(false);
        } else if (i != 3) {
            listView.setHorizontalFadingEdgeEnabled(false);
            listView.setVerticalFadingEdgeEnabled(false);
        } else {
            listView.setHorizontalFadingEdgeEnabled(true);
            listView.setVerticalFadingEdgeEnabled(true);
        }
    }

    public final void l(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("427510e4", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setScrollBarStyle(16777216);
        } else if (i == 2) {
            listView.setScrollBarStyle(UCExtension.EXTEND_INPUT_TYPE_IDCARD);
        } else if (i != 3) {
            listView.setScrollBarStyle(0);
        } else {
            listView.setScrollBarStyle(50331648);
        }
    }

    public final void m(ListView listView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4795a46", new Object[]{this, listView, new Integer(i)});
        } else if (i == 1) {
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalScrollBarEnabled(true);
        } else if (i != 2) {
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalScrollBarEnabled(false);
        } else {
            listView.setHorizontalScrollBarEnabled(true);
            listView.setVerticalScrollBarEnabled(false);
        }
    }
}
