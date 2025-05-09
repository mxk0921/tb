package com.taobao.oversea.baobao.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import mtopsdk.common.util.StringUtils;
import tb.e0n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DXProgress extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTMGBAOBAOPROGRESS_AMOUNT = 8838732586388250L;
    public static final long DXTMGBAOBAOPROGRESS_CLDRPRICE = 5741489304768413601L;
    public static final long DXTMGBAOBAOPROGRESS_CURRENCY = 1763146857930398067L;
    public static final long DXTMGBAOBAOPROGRESS_CURRENCYINBACK = -4478620499514261855L;
    public static final long DXTMGBAOBAOPROGRESS_DETAILBIZCOUNTRY = 2206539582967756956L;
    public static final long DXTMGBAOBAOPROGRESS_FREEPIC = 4842540351073124421L;
    public static final long DXTMGBAOBAOPROGRESS_FREESHIPFORMAT = -974521516353376851L;
    public static final long DXTMGBAOBAOPROGRESS_FULLPIC = 4842978192655567062L;
    public static final long DXTMGBAOBAOPROGRESS_FULLPICGIF = -709999441544334865L;
    public static final long DXTMGBAOBAOPROGRESS_ISGREY = 9423390347262905L;
    public static final long DXTMGBAOBAOPROGRESS_MUCHMOREFORMAT = -1474529656738663497L;
    public static final long DXTMGBAOBAOPROGRESS_PROCESSBASECOLOR = 1348056772455562121L;
    public static final long DXTMGBAOBAOPROGRESS_PROCESSCOLOR = -4240141076472673270L;
    public static final long DXTMGBAOBAOPROGRESS_TARGETURL = 3372745712653098179L;
    public static final long DXTMGBAOBAOPROGRESS_TEXTCOLOR = 5737767606580872653L;
    public static final long DXTMGBAOBAOPROGRESS_TMGBAOBAOPROGRESS = 6675887151038685842L;
    public static final long DXTMGBAOBAOPROGRESS_TOTALPRICE = 397465271067463969L;
    public static final long DXTMGBAOBAOPROGRESS_TOTALQUANTITY = -8693813827769898864L;
    private static final int ID = 555;
    private double amount;
    private String currency;
    private String currencyInBack;
    private String freePic;
    private String freeShipFormat;
    private String fullPic;
    private String fullPicGif;
    private String muchMoreFormat;
    private String processBaseColor;
    private String processColor;
    private String targetUrl;
    private double totalPrice;
    private int totalQuantity;
    private String isGrey = "false";
    private String textColor = "#7A5100";
    private String cldrPrice = "false";
    private String detailBizCountry = "";

    public static /* synthetic */ Object ipc$super(DXProgress dXProgress, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/DXProgress");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXProgress();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        int i = (j > DXTMGBAOBAOPROGRESS_ISGREY ? 1 : (j == DXTMGBAOBAOPROGRESS_ISGREY ? 0 : -1));
        if (i == 0) {
            if (j == DXTMGBAOBAOPROGRESS_CLDRPRICE || i == 0) {
                return "false";
            }
            if (j == 5737767606580872653L) {
                return "#7A5100";
            }
        }
        return super.getDefaultValueForStringAttr(j);
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof DXProgress)) {
            super.onClone(dXWidgetNode, z);
            DXProgress dXProgress = (DXProgress) dXWidgetNode;
            this.amount = dXProgress.amount;
            this.cldrPrice = dXProgress.cldrPrice;
            this.currency = dXProgress.currency;
            this.currencyInBack = dXProgress.currencyInBack;
            this.freePic = dXProgress.freePic;
            this.freeShipFormat = dXProgress.freeShipFormat;
            this.fullPic = dXProgress.fullPic;
            this.fullPicGif = dXProgress.fullPicGif;
            this.isGrey = dXProgress.isGrey;
            this.muchMoreFormat = dXProgress.muchMoreFormat;
            this.processBaseColor = dXProgress.processBaseColor;
            this.processColor = dXProgress.processColor;
            this.targetUrl = dXProgress.targetUrl;
            this.totalPrice = dXProgress.totalPrice;
            this.totalQuantity = dXProgress.totalQuantity;
            this.textColor = dXProgress.textColor;
            this.detailBizCountry = dXProgress.detailBizCountry;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        BaobaoProgress build = BaobaoProgress.build(context);
        e0n.b().d(DXProgress.class.getName(), build);
        build.setId(ID);
        frameLayout.addView(build, 0, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof FrameLayout) {
            BaobaoProgress baobaoProgress = (BaobaoProgress) view.findViewById(ID);
            baobaoProgress.initView(context);
            if (StringUtils.isNotBlank(this.detailBizCountry)) {
                BaobaoManager.sDetail_Edition_Code = this.detailBizCountry;
                try {
                    BaobaoManager.getInstance().init();
                } catch (WXException e) {
                    throw new RuntimeException(e);
                }
            }
            HashMap hashMap = new HashMap();
            HashMap<String, Object> paramsCacheAndRefreshData = BaobaoManager.getInstance().getParamsCacheAndRefreshData();
            hashMap.put("totalQuantity", String.valueOf(paramsCacheAndRefreshData.get("totalQuantity")));
            hashMap.put("totalPrice", String.valueOf(paramsCacheAndRefreshData.get("totalPrice")));
            hashMap.put(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT, String.valueOf(this.amount));
            hashMap.put("freePic", String.valueOf(this.freePic));
            hashMap.put("processBaseColor", String.valueOf(this.processBaseColor));
            hashMap.put("processColor", String.valueOf(this.processColor));
            hashMap.put("targetUrl", String.valueOf(this.targetUrl));
            hashMap.put("currency", String.valueOf(this.currency));
            hashMap.put("freeShipFormat", String.valueOf(this.freeShipFormat));
            hashMap.put("muchMoreFormat", String.valueOf(this.muchMoreFormat));
            hashMap.put("fullPic", String.valueOf(this.fullPic));
            hashMap.put("fullPicGif", String.valueOf(this.fullPicGif));
            hashMap.put("isGrey", this.isGrey);
            hashMap.put("currencyInBack", this.currencyInBack);
            hashMap.put("textColor", this.textColor);
            hashMap.put("cldrPrice", this.cldrPrice);
            baobaoProgress.init(hashMap);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXTMGBAOBAOPROGRESS_AMOUNT) {
            this.amount = d;
        } else if (j == DXTMGBAOBAOPROGRESS_TOTALPRICE) {
            this.totalPrice = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTMGBAOBAOPROGRESS_TOTALQUANTITY) {
            this.totalQuantity = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTMGBAOBAOPROGRESS_CURRENCY) {
            this.currency = str;
        } else if (j == DXTMGBAOBAOPROGRESS_CURRENCYINBACK) {
            this.currencyInBack = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FREEPIC) {
            this.freePic = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FREESHIPFORMAT) {
            this.freeShipFormat = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FULLPIC) {
            this.fullPic = str;
        } else if (j == DXTMGBAOBAOPROGRESS_FULLPICGIF) {
            this.fullPicGif = str;
        } else if (j == DXTMGBAOBAOPROGRESS_ISGREY) {
            this.isGrey = str;
        } else if (j == DXTMGBAOBAOPROGRESS_MUCHMOREFORMAT) {
            this.muchMoreFormat = str;
        } else if (j == DXTMGBAOBAOPROGRESS_PROCESSBASECOLOR) {
            this.processBaseColor = str;
        } else if (j == DXTMGBAOBAOPROGRESS_PROCESSCOLOR) {
            this.processColor = str;
        } else if (j == DXTMGBAOBAOPROGRESS_TARGETURL) {
            this.targetUrl = str;
        } else if (j == 5737767606580872653L) {
            this.textColor = str;
        } else if (j == DXTMGBAOBAOPROGRESS_CLDRPRICE) {
            this.cldrPrice = str;
        } else if (j == DXTMGBAOBAOPROGRESS_DETAILBIZCOUNTRY) {
            this.detailBizCountry = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
