/*
 * Copyright 2015, Teradata, Inc. All rights reserved.
 */

package com.teradata.test.internal.configuration;

import com.teradata.test.configuration.Configuration;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public abstract class DelegateConfiguration
        implements Configuration
{

    protected abstract Configuration getDelegate();

    @Override
    public Optional<Object> get(String key)
    {
        return getDelegate().get(key);
    }

    @Override
    public Optional<String> getString(String key)
    {
        return getDelegate().getString(key);
    }

    @Override
    public String getStringMandatory(String key)
    {
        return getDelegate().getStringMandatory(key);
    }

    @Override
    public String getStringMandatory(String key, String errorMessage)
    {
        return getDelegate().getStringMandatory(key, errorMessage);
    }

    @Override
    public Optional<Integer> getInt(String key)
    {
        return getDelegate().getInt(key);
    }

    @Override
    public int getIntMandatory(String key)
    {
        return getDelegate().getIntMandatory(key);
    }

    @Override
    public int getIntMandatory(String key, String errorMessage)
    {
        return getDelegate().getIntMandatory(key, errorMessage);
    }

    @Override
    public Optional<Boolean> getBoolean(String key)
    {
        return getDelegate().getBoolean(key);
    }

    @Override
    public boolean getBooleanMandatory(String key)
    {
        return getDelegate().getBooleanMandatory(key);
    }

    @Override
    public boolean getBooleanMandatory(String key, String errorMessage)
    {
        return getDelegate().getBooleanMandatory(key, errorMessage);
    }
    
    @Override
    public Set<String> listKeys()
    {
        return getDelegate().listKeys();
    }

    @Override
    public Set<String> listKeyPrefixes(int prefixesLength)
    {
        return getDelegate().listKeyPrefixes(prefixesLength);
    }

    @Override
    public Configuration getSubconfiguration(String keyPrefix)
    {
        return getDelegate().getSubconfiguration(keyPrefix);
    }

    @Override
    public Map<String, Object> asMap()
    {
        return getDelegate().asMap();
    }

    @Override
    public int hashCode()
    {
        return getDelegate().hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return getDelegate().equals(o);
    }
}
