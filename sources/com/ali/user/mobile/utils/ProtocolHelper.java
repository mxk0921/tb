package com.ali.user.mobile.utils;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.StringOrangeResult;
import com.ali.user.mobile.base.ui.BaseFragment;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.register.old.TaoUrlSpan;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ProtocolHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206208);
    }

    private static void addOnekeyProtocol(String str, String str2, StringBuilder sb, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c6e07", new Object[]{str, str2, sb, map});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            sb.append("《");
            sb.append(str);
            sb.append("》");
            map.put(str, str2);
        }
    }

    public static void generateProtocol(final ProtocolModel protocolModel, Context context, TextView textView, final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec616d8", new Object[]{protocolModel, context, textView, str, new Boolean(z)});
        } else if (textView != null && protocolModel != null && !TextUtils.isEmpty(protocolModel.protocolTitle)) {
            try {
                final Context applicationContext = context.getApplicationContext();
                SpannableString spannableString = new SpannableString(protocolModel.protocolTitle);
                Map<String, String> map = protocolModel.protocolItems;
                if (map != null) {
                    for (String str2 : map.keySet()) {
                        int indexOf = protocolModel.protocolTitle.indexOf(str2);
                        int length = str2.length() + indexOf;
                        if (length > indexOf) {
                            spannableString.setSpan(new TaoUrlSpan(protocolModel.protocolItems.get(str2)), indexOf, length, 33);
                            spannableString.setSpan(new ClickableSpan() { // from class: com.ali.user.mobile.utils.ProtocolHelper.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str3, Object... objArr) {
                                    if (str3.hashCode() == -1038128277) {
                                        super.updateDrawState((TextPaint) objArr[0]);
                                        return null;
                                    }
                                    int hashCode = str3.hashCode();
                                    throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/ali/user/mobile/utils/ProtocolHelper$2");
                                }

                                @Override // android.text.style.ClickableSpan
                                public void onClick(View view) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                    } else {
                                        UserTrackAdapter.control(str, "agreement");
                                    }
                                }

                                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                public void updateDrawState(TextPaint textPaint) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
                                        return;
                                    }
                                    super.updateDrawState(textPaint);
                                    int i = ProtocolModel.this.protocolItemColor;
                                    if (i > 0) {
                                        textPaint.setColor(ContextCompat.getColor(applicationContext, i));
                                    }
                                    textPaint.setUnderlineText(z);
                                }
                            }, indexOf, length, 33);
                        }
                    }
                }
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setVisibility(0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String getAlipayProtocol(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3206b97", new Object[]{context});
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            return context.getString(R.string.aliuser_alipay_protocal_url_oversea);
        }
        return context.getString(R.string.aliuser_alipay_protocal_url);
    }

    public static String getPrivacyProtocol(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("178abc29", new Object[]{context});
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            return context.getString(R.string.aliuser_policy_protocal_url_oversea);
        }
        return context.getString(R.string.aliuser_policy_protocal_url);
    }

    public static ProtocolModel getProtocolModel(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProtocolModel) ipChange.ipc$dispatch("6efa3f1e", new Object[]{context, str, str2, new Boolean(z)}) : getProtocolModel(context, str, str2, z, false);
    }

    public static String getTbProtocol(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c35b7bb", new Object[]{context});
        }
        if (DataProviderFactory.getDataProvider().isForigenLocation()) {
            return context.getString(R.string.aliuser_tb_protocal_url_oversea);
        }
        return context.getString(R.string.aliuser_tb_protocal_url);
    }

    public static String getXianyuProtocol(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e08befc7", new Object[]{context});
        }
        return context.getString(R.string.aliuser_xianyu_protocal_url);
    }

    public static void setCheckBox(CheckBox checkBox, String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1820c11", new Object[]{checkBox, str, new Boolean(z), new Boolean(z2)});
        } else {
            setCheckBox(null, checkBox, str, z, z2);
        }
    }

    public static ProtocolModel getProtocolModel(Context context, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtocolModel) ipChange.ipc$dispatch("e4ef27e", new Object[]{context, str, str2, new Boolean(z), new Boolean(z2)});
        }
        ProtocolModel protocolModel = new ProtocolModel();
        StringBuilder sb = new StringBuilder(context.getString(R.string.aliuser_protocal_text));
        HashMap hashMap = new HashMap();
        StringOrangeResult customProtocol = DataProviderFactory.getOrangeConfig().customProtocol();
        if (customProtocol.orangeExist) {
            try {
                JSONArray parseArray = JSON.parseArray(customProtocol.value);
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    sb.append(jSONObject.getString("title"));
                    sb.append(" ");
                    hashMap.put(jSONObject.getString("title"), jSONObject.getString("url"));
                }
            } catch (Throwable unused) {
            }
        }
        if (hashMap.size() == 0) {
            boolean isChineseLanguage = LanguageUtil.isChineseLanguage();
            int i2 = R.string.aliuser_tb_protocal;
            hashMap.put(context.getString(i2), getTbProtocol(context));
            int i3 = R.string.aliuser_policy_protocal;
            hashMap.put(context.getString(i3), getPrivacyProtocol(context));
            sb.append(context.getString(i2));
            sb.append(" ");
            if (!isChineseLanguage) {
                sb.append(", ");
            }
            sb.append(context.getString(i3));
            sb.append(" ");
            if (!isChineseLanguage) {
                sb.append(context.getString(R.string.aliuser_and));
                sb.append(" ");
            }
            String string = context.getString(R.string.aliuser_alipay_protocal);
            sb.append(string);
            hashMap.put(string, getAlipayProtocol(context));
        }
        addOnekeyProtocol(str, str2, sb, hashMap);
        if (z) {
            if (z2) {
                sb.append(" ");
                int i4 = R.string.aliuser_xianyu_protocal;
                sb.append(context.getString(i4));
                sb.append(" ");
                hashMap.put(context.getString(i4), getXianyuProtocol(context));
            }
            sb.append(context.getString(R.string.aliuser_reg_protocol_autoreg));
        } else if (!LanguageUtil.isChineseLanguage()) {
            sb.append(".");
        }
        protocolModel.protocolTitle = sb.toString();
        protocolModel.protocolItems = hashMap;
        protocolModel.protocolItemColor = R.color.aliuser_new_edit_text_color;
        return protocolModel;
    }

    public static void setCheckBox(BaseFragment baseFragment, CheckBox checkBox, final String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37da9f68", new Object[]{baseFragment, checkBox, str, new Boolean(z), new Boolean(z2)});
        } else if (checkBox != null) {
            if (DataProviderFactory.getDataProvider().enableElder() && baseFragment != null && baseFragment.needAdaptElder) {
                ElderUtil.viewScale(checkBox, 1.2f, ScreenUtil.dip2px(baseFragment.getContext(), 2.0f));
            }
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.ali.user.mobile.utils.ProtocolHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z3)});
                    } else if (z3) {
                        UserTrackAdapter.control(str, "AgreementClick");
                    } else {
                        UserTrackAdapter.control(str, "Agreement_Button_Cancel");
                    }
                }
            });
            checkBox.setVisibility(0);
            if (z2) {
                checkBox.setChecked(z2);
            }
        }
    }

    public static ProtocolModel getProtocolXianyuModel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtocolModel) ipChange.ipc$dispatch("e2a01b38", new Object[]{context});
        }
        ProtocolModel protocolModel = new ProtocolModel();
        StringBuilder sb = new StringBuilder(context.getString(R.string.aliuser_protocal_text));
        HashMap hashMap = new HashMap();
        StringOrangeResult customXianyuProtocol = DataProviderFactory.getOrangeConfig().customXianyuProtocol();
        if (customXianyuProtocol.orangeExist) {
            try {
                JSONArray parseArray = JSON.parseArray(customXianyuProtocol.value);
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    sb.append(jSONObject.getString("title"));
                    sb.append(" ");
                    hashMap.put(jSONObject.getString("title"), jSONObject.getString("url"));
                }
            } catch (Throwable unused) {
            }
        }
        if (hashMap.size() == 0) {
            int i2 = R.string.aliuser_xianyu_protocal;
            hashMap.put(context.getString(i2), getXianyuProtocol(context));
            sb.append(context.getString(i2));
            sb.append(" ");
        }
        protocolModel.protocolTitle = sb.toString();
        protocolModel.protocolItems = hashMap;
        protocolModel.protocolItemColor = R.color.aliuser_new_edit_text_color;
        return protocolModel;
    }
}
