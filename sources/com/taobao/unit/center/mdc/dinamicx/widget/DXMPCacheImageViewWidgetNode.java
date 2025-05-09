package com.taobao.unit.center.mdc.dinamicx.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.util.ImageStrategyDecider;
import tb.dtl;
import tb.p1m;
import tb.qub;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.uwn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class DXMPCacheImageViewWidgetNode extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMPCACHEIMAGEVIEW_CACHEGROUP = 6117402302357436939L;
    public static final long DXMPCACHEIMAGEVIEW_MPCACHEIMAGEVIEW = 4919702779544933119L;
    public static final LruCache<String, Bitmap> sCacheBitMap = new LruCache<>(20);
    private String cacheGroup;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Builder implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599751);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXMPCacheImageViewWidgetNode();
        }
    }

    static {
        t2o.a(552599749);
    }

    public static /* synthetic */ String access$000(DXMPCacheImageViewWidgetNode dXMPCacheImageViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5fe1db", new Object[]{dXMPCacheImageViewWidgetNode});
        }
        return dXMPCacheImageViewWidgetNode.cacheGroup;
    }

    public static void cacheImage(String str, SuccPhenixEvent succPhenixEvent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71eb99c", new Object[]{str, succPhenixEvent, str2});
        } else if (succPhenixEvent.getDrawable() instanceof uwn) {
            uwn uwnVar = (uwn) succPhenixEvent.getDrawable();
            uwnVar.l();
            if (TextUtils.isEmpty(str2)) {
                sCacheBitMap.put(str, uwnVar.getBitmap());
            }
        } else if ((succPhenixEvent.getDrawable() instanceof dtl) && TextUtils.isEmpty(str2)) {
            sCacheBitMap.put(str, succPhenixEvent.getDrawable().getBitmap());
        }
    }

    public static /* synthetic */ Object ipc$super(DXMPCacheImageViewWidgetNode dXMPCacheImageViewWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 28626114:
                super.onEndParser();
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/mdc/dinamicx/widget/DXMPCacheImageViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXMPCacheImageViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXMPCacheImageViewWidgetNode)) {
            super.onClone(dXWidgetNode, z);
            this.cacheGroup = ((DXMPCacheImageViewWidgetNode) dXWidgetNode).cacheGroup;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
        } else {
            super.onEndParser();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = sCacheBitMap.get(getImageUrl());
        if (imageView != null && bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXMPCACHEIMAGEVIEW_CACHEGROUP) {
            this.cacheGroup = str;
        } else {
            if (3520785955321526846L == j && sCacheBitMap.get(str) == null) {
                preFetchHeadImage(str, new s8d<SuccPhenixEvent>() { // from class: com.taobao.unit.center.mdc.dinamicx.widget.DXMPCacheImageViewWidgetNode.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                        }
                        DXMPCacheImageViewWidgetNode.cacheImage(str, succPhenixEvent, DXMPCacheImageViewWidgetNode.access$000(DXMPCacheImageViewWidgetNode.this));
                        return false;
                    }
                }, null);
            }
            super.onSetStringAttribute(j, str);
        }
    }

    public static p1m preFetchHeadImage(String str, s8d<SuccPhenixEvent> s8dVar, s8d<FailPhenixEvent> s8dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1m) ipChange.ipc$dispatch("1414c6c4", new Object[]{str, s8dVar, s8dVar2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        PhenixCreator schedulePriority = s0m.B().U("wangxin-chat", ImageStrategyDecider.decideUrl(str, 120, 120, null)).diskCachePriority(34).schedulePriority(3);
        if (s8dVar != null) {
            schedulePriority.succListener(s8dVar);
        }
        if (s8dVar2 != null) {
            schedulePriority.failListener(s8dVar2);
        }
        return schedulePriority.fetch();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34e57e52", new Object[]{this, new Boolean(z)});
        } else {
            super.onEndParser();
        }
    }
}
