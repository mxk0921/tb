package com.alibaba.android.split.core.internal;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FieldObjectHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Class mClass;
    private final Field mFiled;
    private final Object mObject;

    static {
        t2o.a(677380138);
    }

    public FieldObjectHolder(Object obj, Field field, Class cls) {
        this.mObject = obj;
        this.mFiled = field;
        this.mClass = cls;
    }

    private Class fieldArrayClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6c2a33ed", new Object[]{this});
        }
        return this.mFiled.getType().getComponentType();
    }

    public void appendObjectsArray(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dc3d28b", new Object[]{this, objArr});
        } else {
            appendObjectsArray(Arrays.asList(objArr));
        }
    }

    public final Object getObject() {
        try {
            return this.mClass.cast(this.mFiled.get(this.mObject));
        } catch (Exception e) {
            String name = this.mFiled.getName();
            String name2 = this.mObject.getClass().getName();
            String name3 = this.mClass.getName();
            throw new InvokeException("Failed to get value of field " + name + " of type " + name2 + " on object of type " + name3, e);
        }
    }

    public void replaceObjectsArray(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de10f8b1", new Object[]{this, objArr});
        } else {
            replaceObjectsArray(Arrays.asList(objArr));
        }
    }

    public final void setObject(Object obj) {
        try {
            this.mFiled.set(this.mObject, obj);
        } catch (Exception e) {
            String name = this.mFiled.getName();
            String name2 = this.mObject.getClass().getName();
            String name3 = this.mClass.getName();
            throw new InvokeException("Failed to set value of field " + name + " of type " + name2 + " on object of type " + name3, e);
        }
    }

    public void setObjectsArrayBefore(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786e7304", new Object[]{this, objArr});
        } else {
            setObjectsArrayBefore(Arrays.asList(objArr));
        }
    }

    private static Class arrayClass(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("fe926704", new Object[]{cls});
        }
        return Array.newInstance(cls, 0).getClass();
    }

    public static Field field(Class cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("ee8dd4a3", new Object[]{cls, str});
        }
        Field field = null;
        while (cls != Object.class) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                cls = cls.getSuperclass();
                continue;
            }
            if (field != null) {
                break;
            }
        }
        return field;
    }

    public void appendObjectsArray(Collection collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f49017", new Object[]{this, collection});
            return;
        }
        Object[] objArr = (Object[]) getObject();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(fieldArrayClass(), collection.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        for (Object obj : collection) {
            objArr2[length] = obj;
            length++;
        }
        setObject(objArr2);
    }

    public void replaceObjectsArray(Collection collection) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2def031", new Object[]{this, collection});
            return;
        }
        Object[] objArr = (Object[]) Array.newInstance(fieldArrayClass(), collection.size());
        for (Object obj : collection) {
            i++;
            objArr[i] = obj;
        }
        setObject(objArr);
    }

    public void setObjectsArrayBefore(Collection collection) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6fcf0fe", new Object[]{this, collection});
            return;
        }
        Object[] objArr = (Object[]) getObject();
        Object[] objArr2 = (Object[]) Array.newInstance(fieldArrayClass(), (objArr == null ? 0 : objArr.length) + collection.size());
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        for (Object obj : collection) {
            objArr2[i] = obj;
            i++;
        }
        setObject(objArr2);
    }
}
