package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyFrames {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> hashMap = new HashMap<>();
        sKeyMakers = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e(TAG, "unable to load", e);
        }
    }

    public KeyFrames() {
    }

    public static String name(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bf32849", new Object[]{new Integer(i), context});
        }
        return context.getResources().getResourceEntryName(i);
    }

    public void addAllFrames(MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605cd4b6", new Object[]{this, motionController});
            return;
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a07397", new Object[]{this, motionController});
            return;
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            while (it.hasNext()) {
                Key next = it.next();
                if (next.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(next);
                }
            }
        }
    }

    public void addKey(Key key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b7fa7f1", new Object[]{this, key});
            return;
        }
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5e615f37", new Object[]{this, new Integer(i)});
        }
        return this.mFramesMap.get(Integer.valueOf(i));
    }

    public Set<Integer> getKeys() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2d9cf820", new Object[]{this});
        }
        return this.mFramesMap.keySet();
    }

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> hashMap;
        HashMap<String, ConstraintAttribute> hashMap2;
        char c;
        Key key;
        try {
            int eventType = xmlPullParser.getEventType();
            Key key2 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            key = new KeyAttributes();
                        } else if (c == 1) {
                            key = new KeyPosition();
                        } else if (c == 2) {
                            key = new KeyCycle();
                        } else if (c == 3) {
                            key = new KeyTimeCycle();
                        } else if (c == 4) {
                            key = new KeyTrigger();
                        } else {
                            throw new NullPointerException("Key " + name + " not found");
                        }
                        key.load(context, Xml.asAttributeSet(xmlPullParser));
                        addKey(key);
                        key2 = key;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (!(key2 == null || (hashMap2 = key2.mCustomConstraints) == null)) {
                            ConstraintAttribute.parse(context, xmlPullParser, hashMap2);
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomMethod") || key2 == null || (hashMap = key2.mCustomConstraints) == null)) {
                        ConstraintAttribute.parse(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3 && ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            Log.e(TAG, "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e(TAG, "Error parsing XML resource", e2);
        }
    }
}
