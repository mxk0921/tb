package com.taobao.mytaobao.export;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.bus;
import tb.ckf;
import tb.e6a;
import tb.f7l;
import tb.j9t;
import tb.r0k;
import tb.ssq;
import tb.t2o;
import tb.tfp;
import tb.ugp;
import tb.wsq;
import tb.yjp;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u00062\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001fR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001fR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/taobao/mytaobao/export/GeneralSettingsSync;", "", "<init>", "()V", "", "key", "", "configMap", "getConfigValue", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "data", "considerConvertInTimeFrameMuteSub", "(Ljava/lang/String;)Ljava/lang/String;", "", "intValue", "", "setPreferVideoPlay", "(I)Z", "strValue", "setPreferInTimeFrameMuteDetail", "(Ljava/lang/String;)Z", "setConfigValue", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "bizNames", "loadUserPreference", "(Ljava/util/List;)Ljava/util/Map;", "preference", "writeUserPreference", "(Ljava/util/Map;)Ljava/util/Map;", GeneralSettingsSync.PreferVideoPlay, "Ljava/lang/String;", GeneralSettingsSync.PreferLiveBgPlay, GeneralSettingsSync.PreferVideoMute, GeneralSettingsSync.PreferLiveMute, GeneralSettingsSync.PreferInlineVolume, GeneralSettingsSync.PreferDarkMode, GeneralSettingsSync.PreferShake, GeneralSettingsSync.PreferScreenShare, GeneralSettingsSync.PreferInTimeFrameMute, GeneralSettingsSync.PreferInTimeFrameMuteDetail, "Ltb/e6a;", "mGeneralSettingOldLogicAdapter", "Ltb/e6a;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class GeneralSettingsSync {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PreferDarkMode = "PreferDarkMode";
    private static final String PreferInTimeFrameMute = "PreferInTimeFrameMute";
    private static final String PreferInTimeFrameMuteDetail = "PreferInTimeFrameMuteDetail";
    private static final String PreferInlineVolume = "PreferInlineVolume";
    private static final String PreferLiveBgPlay = "PreferLiveBgPlay";
    private static final String PreferLiveMute = "PreferLiveMute";
    private static final String PreferScreenShare = "PreferScreenShare";
    private static final String PreferShake = "PreferShake";
    private static final String PreferVideoMute = "PreferVideoMute";
    private static final String PreferVideoPlay = "PreferVideoPlay";
    public static final GeneralSettingsSync INSTANCE = new GeneralSettingsSync();
    private static final e6a mGeneralSettingOldLogicAdapter = new e6a();

    static {
        t2o.a(745537703);
    }

    private GeneralSettingsSync() {
    }

    private final String considerConvertInTimeFrameMuteSub(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cbef629", new Object[]{this, str});
        }
        if (str != null) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                int intValue = parseObject.getIntValue("startHour");
                int intValue2 = parseObject.getIntValue("starMinute");
                if (intValue2 < 10) {
                    str2 = "0" + intValue2;
                } else {
                    str2 = String.valueOf(intValue2);
                }
                int intValue3 = parseObject.getIntValue("endHour");
                int intValue4 = parseObject.getIntValue("endMinute");
                if (intValue4 < 10) {
                    str3 = "0" + intValue4;
                } else {
                    str3 = String.valueOf(intValue4);
                }
                return intValue + f7l.CONDITION_IF_MIDDLE + str2 + '-' + intValue3 + f7l.CONDITION_IF_MIDDLE + str3;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @JvmStatic
    public static final Map<String, String> loadUserPreference(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("af72ea39", new Object[]{list});
        }
        ckf.h(list, "bizNames");
        HashMap hashMap = new HashMap(list.size());
        SharedPreferences c = tfp.c();
        ckf.c(c, "SettingStateUtils.getUserSettingStateTable()");
        Map<String, ?> all = c.getAll();
        for (String str : list) {
            GeneralSettingsSync generalSettingsSync = INSTANCE;
            ckf.c(all, "allConfig");
            String configValue = generalSettingsSync.getConfigValue(str, all);
            if (configValue != null) {
                hashMap.put(str, configValue);
            }
        }
        return hashMap;
    }

    @JvmStatic
    public static final Map<String, Boolean> writeUserPreference(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdc2d5ae", new Object[]{map});
        }
        ckf.h(map, "preference");
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Boolean.valueOf(INSTANCE.setConfigValue(entry.getKey(), entry.getValue())));
        }
        return hashMap;
    }

    private final String getConfigValue(String str, Map<String, ?> map) {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        String obj8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fc9ba5", new Object[]{this, str, map});
        }
        Object obj9 = null;
        switch (str.hashCode()) {
            case -1981932683:
                if (!str.equals(PreferLiveBgPlay)) {
                    return null;
                }
                Object obj10 = map.get(r0k.KEY_LIVE_BACKGROUND_PLAY);
                return (obj10 == null || (obj = obj10.toString()) == null) ? String.valueOf(bus.a()) : obj;
            case -1649505949:
                if (!str.equals(PreferInlineVolume)) {
                    return null;
                }
                Object obj11 = map.get(r0k.KEY_INLINE_VOLUME);
                return (obj11 == null || (obj2 = obj11.toString()) == null) ? String.valueOf(yjp.a(SettingContants.SETTINGS_SYSTEM_SOUND, true)) : obj2;
            case -654041418:
                if (!str.equals(PreferShake)) {
                    return null;
                }
                Object obj12 = map.get(r0k.KEY_HOMEPAGE_SHAKE);
                return (obj12 == null || (obj3 = obj12.toString()) == null) ? String.valueOf(ugp.c()) : obj3;
            case -408423563:
                if (!str.equals(PreferLiveMute)) {
                    return null;
                }
                Object obj13 = map.get(r0k.KEY_LIVE_MUTE);
                if (!(obj13 == null || (obj4 = obj13.toString()) == null)) {
                    return obj4;
                }
                break;
            case -85080951:
                if (!str.equals(PreferDarkMode)) {
                    return null;
                }
                break;
            case 15748739:
                if (!str.equals(PreferScreenShare)) {
                    return null;
                }
                Object obj14 = map.get("share");
                if (!(obj14 == null || (obj5 = obj14.toString()) == null)) {
                    return obj5;
                }
                break;
            case 564108516:
                if (!str.equals(PreferVideoMute)) {
                    return null;
                }
                Object obj15 = map.get("mute");
                if (!(obj15 == null || (obj6 = obj15.toString()) == null)) {
                    return obj6;
                }
                break;
            case 564188671:
                if (!str.equals(PreferVideoPlay)) {
                    return null;
                }
                Object obj16 = map.get("video");
                return (obj16 == null || (obj7 = obj16.toString()) == null) ? "0" : obj7;
            case 1040111829:
                if (!str.equals(PreferInTimeFrameMuteDetail)) {
                    return null;
                }
                Object obj17 = map.get("timeFrameMuteSub");
                if (obj17 instanceof String) {
                    obj9 = obj17;
                }
                String considerConvertInTimeFrameMuteSub = considerConvertInTimeFrameMuteSub((String) obj9);
                return considerConvertInTimeFrameMuteSub != null ? considerConvertInTimeFrameMuteSub : "0:00-0:00";
            case 1211101028:
                if (!str.equals(PreferInTimeFrameMute)) {
                    return null;
                }
                Object obj18 = map.get("timeFrameMute");
                if (!(obj18 == null || (obj8 = obj18.toString()) == null)) {
                    return obj8;
                }
                break;
            default:
                return null;
        }
        return "false";
    }

    private final boolean setConfigValue(String str, String str2) {
        boolean z;
        Integer m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42d982ac", new Object[]{this, str, str2})).booleanValue();
        }
        if (ckf.b(str, PreferVideoPlay)) {
            if (str2 == null || (m = ssq.m(str2)) == null) {
                return false;
            }
            return setPreferVideoPlay(m.intValue());
        } else if (ckf.b(str, PreferInTimeFrameMuteDetail)) {
            return setPreferInTimeFrameMuteDetail(str2);
        } else {
            if (ckf.b("true", str2)) {
                z = true;
            } else if (!ckf.b("false", str2)) {
                return false;
            } else {
                z = false;
            }
            switch (str.hashCode()) {
                case -1981932683:
                    if (str.equals(PreferLiveBgPlay)) {
                        r0k.P(r0k.KEY_LIVE_BACKGROUND_PLAY, Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e(r0k.KEY_LIVE_BACKGROUND_PLAY, z, true);
                        return true;
                    }
                    break;
                case -1649505949:
                    if (str.equals(PreferInlineVolume)) {
                        r0k.P(r0k.KEY_INLINE_VOLUME, Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e(r0k.KEY_INLINE_VOLUME, z, true);
                        return true;
                    }
                    break;
                case -654041418:
                    if (str.equals(PreferShake)) {
                        r0k.P(r0k.KEY_HOMEPAGE_SHAKE, Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e(r0k.KEY_HOMEPAGE_SHAKE, z, true);
                        return true;
                    }
                    break;
                case -408423563:
                    if (str.equals(PreferLiveMute)) {
                        r0k.P(r0k.KEY_LIVE_MUTE, Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e(r0k.KEY_LIVE_MUTE, z, true);
                        return true;
                    }
                    break;
                case -85080951:
                    if (str.equals(PreferDarkMode)) {
                        return true;
                    }
                    break;
                case 15748739:
                    if (str.equals(PreferScreenShare)) {
                        r0k.P("share", Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e("share", z, true);
                        return true;
                    }
                    break;
                case 564108516:
                    if (str.equals(PreferVideoMute)) {
                        r0k.P("mute", Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e("mute", z, true);
                        return true;
                    }
                    break;
                case 1211101028:
                    if (str.equals(PreferInTimeFrameMute)) {
                        r0k.P("timeFrameMute", Boolean.valueOf(z));
                        mGeneralSettingOldLogicAdapter.e("timeFrameMute", z, true);
                        return true;
                    }
                    break;
            }
            return false;
        }
    }

    private final boolean setPreferInTimeFrameMuteDetail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5fbf188", new Object[]{this, str})).booleanValue();
        }
        if (str != null) {
            try {
                List z0 = wsq.z0(str, new String[]{"-"}, false, 0, 6, null);
                List z02 = wsq.z0((String) z0.get(0), new String[]{":"}, false, 0, 6, null);
                int parseInt = Integer.parseInt((String) z02.get(0));
                int parseInt2 = Integer.parseInt((String) z02.get(1));
                List z03 = wsq.z0((String) z0.get(1), new String[]{":"}, false, 0, 6, null);
                int parseInt3 = Integer.parseInt((String) z03.get(0));
                int parseInt4 = Integer.parseInt((String) z03.get(1));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "startHour", (String) Integer.valueOf(parseInt));
                jSONObject.put((JSONObject) "starMinute", (String) Integer.valueOf(parseInt2));
                jSONObject.put((JSONObject) "endHour", (String) Integer.valueOf(parseInt3));
                jSONObject.put((JSONObject) "endMinute", (String) Integer.valueOf(parseInt4));
                r0k.P("timeFrameMuteSub", jSONObject.toJSONString());
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private final boolean setPreferVideoPlay(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cb54823", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i < 0 || 2 < i) {
            return false;
        }
        j9t e = j9t.e(Globals.getApplication(), "mytaobao");
        ckf.c(e, "TaobaoGlobalSettings.get…pplication(), \"mytaobao\")");
        e.c().b(i);
        r0k.P("video", Integer.valueOf(i));
        return true;
    }
}
